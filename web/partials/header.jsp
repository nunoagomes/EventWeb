<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/EventWeb/index.jsp">Events WebApp</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <p class="navbar-btn">
                    <a class="btn btn-primary" href="LoadEventInfo">
                        <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> New Event
                    </a>
                </p>
                <!--  <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Bookings<span class="caret"></span></a>
                      <ul class="dropdown-menu" role="menu">
                          <li><a href="/bookings">Bookings Made</a></li>
                          <li><a href="/proposals">Bookings Received</a></li>
                      </ul>
                  </li> -->
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">FAQ</a></li>
                <li><a href="index.jsp#howItWorks">How It Works?</a></li>
                    <% if (session.getAttribute("name") == null) { %>
                <li>
                    <a href="insertRegularUser.jsp">
                        <span class="glyphicon glyphicon-new-window" aria-hidden="true"></span> Sign up
                    </a>
                </li>
                <li>
                    <p class="navbar-btn">
                        <a class="btn btn-default" href="signIn.jsp">
                            <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span> Sign in
                        </a>
                    </p>
                </li>
                <% } else {%>
                <li>
                    <a href="insertRegularUser.jsp">
                        <span class="glyphicon glyphicon-user" aria-hidden="true"></span> <%= session.getAttribute("name")%>
                    </a>
                </li>
                <li>
                    <a href="DestroySession">
                        <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span> Logout
                    </a>
                </li>
                <% }%>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>