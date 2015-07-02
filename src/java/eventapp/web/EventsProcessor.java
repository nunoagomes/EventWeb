package eventapp.web;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import eventapp.Event;
import eventapp.beans.EventManagementLocal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.json.simple.JSONObject;

/**
 *
 * @author emanuel.braga
 * @author anr
 */
@WebServlet("/upload")
@MultipartConfig
public class EventsProcessor extends HttpServlet {

    //SERVLET_INFO
    private static final String SERVLET_INFO = "Servlet responsible for event operations";
    //ACTIONS
    private static final String ACTION_KEY = "action";
    private static final String CREATE_EVENT_ACTION = "createEvent";
    private static final String READ_EVENT_ACTION = "readEvent";
    private static final String UPDATE_EVENT_ACTION = "updateEvent";
    private static final String DELETE_EVENT_ACTION = "deleteEvent";
    private static final String INVALID_ACTION = "Invalid Operation";
    //STRING_EMPTY
    private static final String STRING_EMPTY = "";
    //UPLOAD_DIRECTORY_TO_SAVE_IMAGES
    private static final String UPLOAD_DIRECTORY = "../../uploadsImages";
    //CHARSETS
    private static final String CONTENT_TYPE = "text/html;charset=UTF-8";
    private static final String CHARSET_UTF = "UTF-8";
    private static final String CHARSET_ISO = "ISO-8859-1";
    //PARAMS
    private static final String PARAM_EVENT = "event";
    private static final String PARAM_EVENT_ID = "eventID";
    private static final String PARAM_TITLE = "title";
    private static final String PARAM_DATE = "date";
    private static final String PARAM_DESCRIPTION = "description";
    private static final String PARAM_ADDITIONAL_INFORMATION = "additionalInformation";
    private static final String PARAM_COUNTRY = "country";
    private static final String PARAM_CITY = "city";
    private static final String PARAM_ZIP = "zip";
    private static final String PARAM_ADDRESS = "address";
    private static final String PARAM_ADDRESS_OPTIONAL = "addressOptional";
    private static final String PARAM_PRICE = "price";
    private static final String PARAM_EVENT_CATEGORY_ID = "eventCategoryID";
    private static final String PARAM_USER_ID = "id";
    private static final String PARAM_SUCCESS = "success";
    private static final String PARAM_MESSAGE = "message";
    //ERROR_MESSAGES
    private static final String SAVE_SUCCESS_MESSAGE = "Event was successfully saved.";
    private static final String SAVE_ERROR_MESSAGE = "Event was not saved.";
    private static final String DELETE_SUCCESS_MESSAGE = "Event was successfully deleted.";
    private static final String DELETE_ERROR_MESSAGE = "Event was not deleted.";
    private static final String READ_ERROR_MESSAGE = "Event was not found.";

    @EJB
    private EventManagementLocal emlEjb;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        JsonObject myObj = new JsonObject();
        String actionName = getParameter(request, ACTION_KEY);

        if (CREATE_EVENT_ACTION.equals(actionName)) {
            processCreate(request, out);
        } else if (READ_EVENT_ACTION.equals(actionName)) {
            processRead(request, out);
        } else if (UPDATE_EVENT_ACTION.equals(actionName)) {
            processUpdate(request, out);
        } else if (DELETE_EVENT_ACTION.equals(actionName)) {
            processDelete(request, out);
        } else {
            myObj.addProperty(PARAM_SUCCESS, false);
            myObj.addProperty(PARAM_MESSAGE, INVALID_ACTION);
            out.println(myObj.toString());
            out.close();
        }
    }

    private void processCreate(HttpServletRequest request, PrintWriter out) {
        processSave(request, out);
    }

    private void processRead(HttpServletRequest request, PrintWriter out) {
        JsonObject myObj = new JsonObject();
        try {
            String eventID = getParameter(request, PARAM_EVENT_ID);
            long ID = Long.parseLong(eventID);

            Event event = this.emlEjb.getEvent(ID);

            if (event != null) {
                JSONObject formDetailsJson = copyFromBean(event);
                JsonElement eventJson = new Gson().toJsonTree(formDetailsJson);
                myObj.add(PARAM_EVENT, eventJson);
                myObj.addProperty(PARAM_SUCCESS, true);
            } else {
                myObj.addProperty(PARAM_SUCCESS, false);
                myObj.addProperty(PARAM_MESSAGE, READ_ERROR_MESSAGE);
            }
            out.println(myObj.toString());
            out.close();
        } catch (Exception e) {
            myObj.addProperty(PARAM_SUCCESS, false);
            myObj.addProperty(PARAM_MESSAGE, READ_ERROR_MESSAGE + e.getMessage());
            out.println(myObj.toString());
            out.close();
        }
    }

    private void processUpdate(HttpServletRequest request, PrintWriter out) {
        processSave(request, out);
    }

    private void processDelete(HttpServletRequest request, PrintWriter out) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void processSave(HttpServletRequest request, PrintWriter out) {
        Event event = null;
        JsonObject myObj = new JsonObject();

        try {
            Directory uploadDirectory = new Directory(UPLOAD_DIRECTORY);
            ImageFormatValidator imgValidator = new ImageFormatValidator();
            uploadDirectory.createDirectory();

            ArrayList<String> imagesPath = getAttachements(request, imgValidator, uploadDirectory);
            String title = getParameter(request, PARAM_TITLE);
            String date = getParameter(request, PARAM_DATE);
            String description = getParameter(request, PARAM_DESCRIPTION);
            String additionalInformation = getParameter(request, PARAM_ADDITIONAL_INFORMATION);
            String country = getParameter(request, PARAM_COUNTRY);
            String city = getParameter(request, PARAM_CITY);
            String zip = getParameter(request, PARAM_ZIP);
            String address = getParameter(request, PARAM_ADDRESS);
            String addressOptional = getParameter(request, PARAM_ADDRESS_OPTIONAL);
            //String priceAux = getParameter(request, PARAM_PRICE);
            //double price = Double.parseDouble(priceAux);
            String categoryAux = getParameter(request, PARAM_EVENT_CATEGORY_ID);
            long eventCategoryID = Long.parseLong(categoryAux);
            //long organizationUserID = Long.parseLong(request.getSession(false).getAttribute(PARAM_USER_ID).toString());
            long organizationUserID = 2;
            double price = 2.0;

            event = emlEjb.saveEvent(organizationUserID, eventCategoryID, title, date, description, additionalInformation, country, city, zip, address, addressOptional, price, imagesPath);

            if (event != null) {
                myObj.addProperty(PARAM_EVENT_ID, event.getORMID());
                myObj.addProperty(PARAM_SUCCESS, true);
                myObj.addProperty(PARAM_MESSAGE, SAVE_SUCCESS_MESSAGE);
            } else {
                myObj.addProperty(PARAM_SUCCESS, false);
                myObj.addProperty(PARAM_MESSAGE, SAVE_ERROR_MESSAGE);
            }

            out.println(myObj.toString());
            out.close();
        } catch (Exception e) {
            myObj.addProperty(PARAM_SUCCESS, false);
            myObj.addProperty(PARAM_MESSAGE, SAVE_ERROR_MESSAGE + e.getMessage());
            out.println(myObj.toString());
            out.close();
        }
    }

    private String getParameter(HttpServletRequest request, String parameter) throws UnsupportedEncodingException {
        String value = STRING_EMPTY;
        if (request.getParameter(parameter) != null && !request.getParameter(parameter).trim().isEmpty()) {
            value = new String(request.getParameter(parameter).toString().getBytes(CHARSET_ISO), CHARSET_UTF);
        }
        return value;
    }

    private ArrayList<String> getAttachements(HttpServletRequest request, ImageFormatValidator imgValidator, Directory uploadDirectory) throws UnsupportedEncodingException, IOException, ServletException {
        Iterator part = request.getParts().iterator();
        ArrayList<String> imagesPath = new ArrayList<>();

        while (part.hasNext()) {
            Part filePart = (Part) part.next();
            String fileName = filePart.getSubmittedFileName();
            if (imgValidator.validate(fileName)) {
                File file = new File(uploadDirectory, fileName);
                try (InputStream input = filePart.getInputStream()) {  // How to obtain part is answered in http://stackoverflow.com/a/2424824
                    Files.copy(input, file.toPath());
                    imagesPath.add(fileName);
                }
            }
        }
        return imagesPath;
    }

    private JSONObject copyFromBean(Event _event) {
        JSONObject formDetailsJson = new JSONObject();

        formDetailsJson.put("title", _event.getTitle());
        formDetailsJson.put("date", _event.getDate());
        formDetailsJson.put("description", _event.getDescription());
        formDetailsJson.put("additionalInformation", _event.getAdditionalInformation());
        formDetailsJson.put("city", _event.getCity());
        formDetailsJson.put("country", _event.getCountry());
        formDetailsJson.put("zip", _event.getZip());
        formDetailsJson.put("address", _event.getAddress());
        formDetailsJson.put("addressOptional", _event.getAddressOptional());
        formDetailsJson.put("eventID", _event.getORMID());

        return formDetailsJson;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return SERVLET_INFO;
    }
}
