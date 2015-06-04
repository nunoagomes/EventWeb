package eventapp.web;

import eventapp.beans.UserManagementLocal;
import eventapp.RegularUser;
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
public class InsertRegularUser extends HttpServlet {

    @EJB
    private UserManagementLocal umlEjb;

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

            String firstName = "";
            if (request.getParameter("user[firstName]") != null ) {
                firstName = new String(request.getParameter("user[firstName]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            String lastName = "";
            if (request.getParameter("user[lastName]") != null ) {
                lastName = new String(request.getParameter("user[lastName]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            String email = "";
            if (request.getParameter("user[email]") != null ) {
                email = new String(request.getParameter("user[email]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            String password = "";
            if (request.getParameter("user[password]") != null ) {
                password = new String(request.getParameter("user[password]").toString().getBytes("ISO-8859-1"), "UTF-8");
            }
            RegularUser regularUser = umlEjb.insertRegularUser(firstName, lastName, email, password);
            
            if(regularUser != null){
            request.setAttribute("user", regularUser);

            RequestDispatcher reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/showDetailsRegularUser.jsp");
            reqDispatcher.forward(request, response);
            }
          
        } catch (Exception e) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Insert Regular User</title>");
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
