/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp.web;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import eventapp.EventCategory;
import eventapp.beans.CategoryManagementLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author emanuel.braga
 * @author anr
 */
@WebServlet("/categories")
public class CategoriesProcessor extends HttpServlet {

    @EJB
    private CategoryManagementLocal cmlEjb;

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        JsonObject myObj = new JsonObject();
        try {

            JSONArray jsonArray = new JSONArray();
            EventCategory[] categories = cmlEjb.listCategories();

            for (EventCategory p : categories) {
                JSONObject formDetailsJson = new JSONObject();
                formDetailsJson.put("id", p.getID());
                formDetailsJson.put("name", p.getCategoryName());
                jsonArray.add(formDetailsJson);
            }
            JsonElement categoriesJson = new Gson().toJsonTree(jsonArray);
            myObj.add("categories", categoriesJson);
            myObj.addProperty("success", true);
            myObj.addProperty("message", "asdadsa");
            out.println(myObj.toString());
            out.close();
        } catch (Exception e) {
            myObj.addProperty("success", false);
            out.println(myObj.toString());
            out.close();
        }
    }

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
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
