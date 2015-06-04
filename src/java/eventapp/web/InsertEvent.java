package eventapp.web;


import eventapp.Event;
import eventapp.beans.UserManagementLocal;
import eventapp.OrganizationUser;
import eventapp.beans.EventManagementLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emanuel.braga
 * @author anr
 */
public class InsertEvent extends HttpServlet {

    @EJB
    private EventManagementLocal emlEjb;
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            String title = "";
            if (request.getParameter("event[title]") != null ) {
                title = new String(request.getParameter("event[title]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            String date = "";
            if (request.getParameter("event[date]") != null ) {
                date = new String(request.getParameter("event[date]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            String description = "";
            if (request.getParameter("event[description]") != null ) {
                description = new String(request.getParameter("event[description]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            String additionalInformation = "";
            if (request.getParameter("event[additionalInformation]") != null ) {
                additionalInformation = new String(request.getParameter("event[additionalInformation]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            String country = "";
            if (request.getParameter("event[country]") != null ) {
                country = new String(request.getParameter("event[country]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            
            String city = "";
            if (request.getParameter("event[city]") != null ) {
                city = new String(request.getParameter("event[city]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            
            String zip = "";
            if (request.getParameter("event[zip]") != null ) {
                zip = new String(request.getParameter("event[zip]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            
            String address = "";
            if (request.getParameter("event[address]") != null ) {
                address = new String(request.getParameter("event[address]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            
            String addressOptional = "";
            if (request.getParameter("event[addressOptional]") != null ) {
                addressOptional = new String(request.getParameter("event[addressOptional]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            
            double price = 0;
            if (request.getParameter("event[price]") != null ) {
                String aux = new String(request.getParameter("event[price]").toString().getBytes("ISO-8859-1"), "UTF-8");
                price = Double.parseDouble(aux);
            }
            
            long organizationUserID = 0;
            if (request.getParameter("event[organizationUserID]") != null ) {
                String aux = new String(request.getParameter("event[organizationUserID]").toString().getBytes("ISO-8859-1"), "UTF-8");
                organizationUserID = Long.parseLong(aux);
            }
            
            long eventCategoryID = 0;
            if (request.getParameter("event[eventCategoryID]") != null ) {
                String aux = new String(request.getParameter("event[eventCategoryID]").toString().getBytes("ISO-8859-1"), "UTF-8");
                eventCategoryID = Long.parseLong(aux);
            }
            
            
            Event event = emlEjb.insertEvent(organizationUserID, eventCategoryID, title, date, description, additionalInformation, country, city, zip, address, addressOptional, price);
            
            if(event != null){
            request.setAttribute("event", event);

            RequestDispatcher reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/showDetailsOrganizationUser.jsp");
            reqDispatcher.forward(request, response);
            }
          
        } catch (Exception e) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Insert Organization User</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Insert Event at " + request.getContextPath() + "</h1>");
            out.println("Exception: " + e.getMessage());
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
