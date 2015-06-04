<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up regular user page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/main.css">
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    </head>
    <body>
        <jsp:include page="/partials/header.jsp" />
        <div class="error-messages">
            
        </div>
        <div class="row">
            <div class="col-md-offset-4 col-md-4">
                <div class="page-header">
                    <h3>Sign up regular user</h3>
                </div>
                <div class="form alert" role="alert">
                    <form class="new_user" id="new_user" action=InsertRegularUser accept-charset="UTF-8" method="POST">
                        <div class="form-group">
                            <label for="user_email">Email</label>
                            <input autofocus="autofocus" class="form-control" placeholder="Email" required="required" type="email" value="" name="user[email]" id="user_email" />
                        </div>
                        <div class="form-group row">
                            <div class="col-md-6">
                                <label for="user_first_name">First name</label>
                                <input class="form-control" placeholder="First Name" required="required" type="text" value="" name="user[firstName]" id="user_first_name" />
                            </div>

                            <div class="col-md-6">
                                <label for="user_last_name">Last name</label>
                                <input class="form-control" placeholder="Last Name" required="required" type="text" value="" name="user[lastName]" id="user_last_name" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="user_password">Password</label>
                            <em>(8 characters minimum)</em>
                            <br />
                            <input autocomplete="off" class="form-control" placeholder="Password" required="required" type="password" name="user[password]" id="user_password" />
                        </div>
                      
                        <div class="actions">
                            <input type="submit" name="commit" value="Sign up" class="btn btn-success" />
                        </div>
                    </form>
                </div>
                <footer class="footer">
                    <a href="insertOrganizationUser.jsp">I represent an organization</a><br/>
                    Already have an account? <a href="signIn.jsp">Log in</a><br />
                </footer>
            </div>
        </div>
<jsp:include page="/partials/footer.jsp" />
</body>
</html>
