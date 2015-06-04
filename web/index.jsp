<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Event Web</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/main.css">
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    </head>
    <body>
        <jsp:include page="/partials/header.jsp" />
        <!-- Full Width Image Header with Logo -->
        <header class="image-bg-fluid-height">
            <div class="header-radius" >
                <img class="img-responsive img-center" src="assets/images/icon.png" alt="White logo background" />
                <div class="alert" role="alert">
                    <form class="form-inline" action="/locations" accept-charset="UTF-8" method="get"><input name="utf8" type="hidden" value="&#x2713;" />
                        <div class="form-group">
                            <label class="sr-only" for="location">Nearby</label>
                            <div class="controls">
                                <div class="input-group">
                                    <span class="input-group-addon">Nearby</span>
                                    <input type="text" class="form-control" id="location" placeholder="e.g.: Porto" required="required">
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="sr-only" for="distance">Distance</label>
                            <div class="controls">
                                <div class="input-group">
                                    <span class="input-group-addon">Distance</span>
                                    <input type="number" name="distance" id="distance" placeholder="e.g.: 10" class="form-control" min="1" required="required" />
                                    <span class="input-group-addon">km</span>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="submit" name="commit" value="Go!" class="btn btn-success" />
                        </div>

                    </form>    
                </div>
                <a href="#howItWorks" class="btn btn-default btn-lg">How it works ?</a>
            </div>
        </header>
        <!-- Content Section -->
        <section>
            <div class="container">
                <div class="row">
                    <div class="col-md-2">
                        <img class="img-responsive" height="200" width="200" src="assets/images/icon.png" alt="Blue logo background" />   
                    </div>
                    <div class="col-md-10">
                        <h3 class="section-heading page-header">Events <small>What's happening?</small></h3>
                        <p class="lead">Connecting users in search of events that suits your preferences.</p>
                    </div>
                </div>
            </div>
        </section>

        <!-- Fixed Height Image Aside -->
        <!-- Image backgrounds are set within the full-width-pics.css file. -->
        <aside class="image-bg-fixed-height"></aside>
        <!-- Content Section -->
        <section>
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 id="howItWorks" class="section-heading page-header">How it works?</h1>
                        <p class="lead section-lead">It is as simple as 3 steps!</p>
                        <div class="row">
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img width="75px" heigh="75px" src="/assets/icon-search-ddc92bf442c3647402628bb9da51b13c.png" alt="Icon search" />
                                    <div class="caption">
                                        <h3>1. Search</h3>
                                        <p>Search the differents events that we have to offer</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img width="75px" heigh="75px" src="/assets/icon-calendar-67c21781ba5e22c3c65aad734c6a9edb.png" alt="Icon calendar" />
                                    <div class="caption">
                                        <h3>2. Find</h3>
                                        <p>Find the event that suit your interest and subscribe.</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img width="75px" heigh="75px" src="/assets/icon-car-996508cf4abcd54a546b565be5af7440.png" alt="Icon car" />
                                    <div class="caption">
                                        <h3>3. Subscribe</h3>
                                        <p>Go there, and enjoy it. The event is yours!</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container -->
        </section>
        <jsp:include page="/partials/footer.jsp" />
    </body>
</html>
