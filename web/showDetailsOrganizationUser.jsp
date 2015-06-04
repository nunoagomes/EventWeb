<%@page import="eventapp.OrganizationUser"%>
<%
    OrganizationUser a = (OrganizationUser) request.getAttribute("user");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Details Organization User</title>
    </head>
    <body>
        <h1>Organization User details</h1>
        <fieldset id="registoAlunos">
            <legend>User Details details <%= a.getID()%></legend>

            <table>
                <tr>
                    <td>
                        <label>Occupation:</label>
                    </td>
                    <td>
                        <%= a.getOccupation()%>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Phone Number:</label>
                    </td>
                    <td>
                        <%= a.getPhoneNumber()%>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Organization Name:</label>
                    </td>
                    <td>
                        <%= a.getOrganizationName()%>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Organization NIF</label>
                    </td>
                    <td>
                        <%= a.getOrganizationNIF()%>
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
