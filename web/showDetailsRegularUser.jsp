<%@page import="eventapp.RegularUser"%>
<%
    RegularUser a = (RegularUser) request.getAttribute("user");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Details Regular User</title>
    </head>
    <body>
        <h1>Regular User details</h1>
        <fieldset id="registoAlunos">
            <legend>User Details details <%= a.getID()%></legend>

            <table>
                <tr>
                    <td>
                        <label>Last Name:</label>
                    </td>
                    <td>
                        <%= a.getLastName()%>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>First Name:</label>
                    </td>
                    <td>
                        <%= a.getFirstName()%>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Email:</label>
                    </td>
                    <td>
                        <%= a.getEmail()%>
                    </td> 
                </tr>
            </table>
        </fieldset>
        <a href="">Back</a>
    </body>
</html>
