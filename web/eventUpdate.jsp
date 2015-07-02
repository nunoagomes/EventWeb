<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up organization page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.7.14/css/bootstrap-datetimepicker.min.css" rel="stylesheet"/>
        <link rel="stylesheet" type="text/css" href="assets/css/main.css">
        <link rel="stylesheet" type="text/css" href="assets/css/fileinput.css" media="all"  />
        <!-- Latest compiled and minified JavaScript -->

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.9.0/moment.min.js"></script>  
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <script src="assets/js/fileinput.min.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.9/angular.min.js"></script>
        <script src="assets/js/ui-bootstrap.tpls.js"></script>
        <script src="assets/js/datetime-picker.js"></script>

        <script>
            // define angular module/app
            var formApp = angular.module('formApp', ['ui.bootstrap', 'ui.bootstrap.datetimepicker']);

            formApp.directive('fileUpload', function () {
                return {
                    scope: true, //create a new scope
                    link: function (scope, el, attrs) {
                        el.bind('change', function (event) {
                            var files = event.target.files;
                            //iterate files since 'multiple' may be specified on the element
                            for (var i = 0; i < files.length; i++) {
                                //emit event upward
                                scope.$emit("fileSelected", {file: files[i]});
                            }
                        });
                    }
                };
            });

            // create angular controller and pass in $scope and $http
            formApp.controller('formController', ['$scope', '$http', function ($scope, $http) {
                    // create a blank object to hold our form information
                    // $scope will allow this to pass between controller and view
                    $scope.formData = {};
                    $scope.files = [];
                    $scope.categories = [];
                    $scope.formData.eventCategoryID = null;

                    $scope.loadCategories = function (e) {
                        $http({
                            method: 'GET',
                            url: 'http://localhost:8080/EventWeb/categories'
                        }).success(function (result) {
                            $scope.categories = result.categories;
                        });
                    };
                    
                    $scope.loadEvent = function (e) {
                        $http({
                            method: 'POST',
                            url: 'http://localhost:8080/EventWeb/upload',
                            data: $.param({eventID: 1, action: "readEvent"}),
                            headers: {'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'}                            
                        }).success(function (result) {
                            $scope.formData = result.event;
                        });
                    };

                    //listen for the file selected event
                    $scope.$on("fileSelected", function (event, args) {
                        $scope.$apply(function () {
                            $scope.files.push(args.file);
                        });
                    });

                    $scope.isOpen = false;

                    $scope.openCalendar = function (e) {
                        e.preventDefault();
                        e.stopPropagation();

                        $scope.isOpen = true;
                    };

                    // process the form
                    $scope.processForm = function () {
                        $http({
                            method: 'POST',
                            url: 'http://localhost:8080/EventWeb/upload',
                            headers: {'Content-Type': undefined},
                            transformRequest: function (data) {
                                var formData = new FormData();
                                formData.append("action", "updateEvent");
                                angular.forEach(data.formData, function (value, key) {
                                    this.append(key, value);
                                }, formData);

                                var i = 0;
                                angular.forEach(data.files, function (file) {
                                    this.append("file" + i, file);
                                    i++;
                                }, formData);

                                return formData;
                            }, // set the headers so angular passing info as form data (not request payload)
                            data: {formData: $scope.formData, files: $scope.files}
                        })
                                .success(function (data) {
                                    console.log(data);
                                    if (!data.success) {
                                        // if not successful, bind errors to error variables
                                        $scope.message = data.message;
                                        $scope.errorName = '';
                                        $scope.errorSuperhero = '';
                                    } else {
                                        // if successful, bind success message to message
                                        location.href = "http://www.example.com/ThankYou.html";
                                        $scope.message = data.message;
                                        $scope.errorName = '';
                                        $scope.errorSuperhero = '';
                                    }
                                });
                    };

                    $scope.loadCategories();
                    $scope.loadEvent();
                }]);
        </script>
        <style>
            .datetime-picker div > table .btn-default {
                border: 0;
            }
        </style>
    </head>
    <body ng-app="formApp" ng-controller="formController">
        <jsp:include page="/partials/header.jsp" />
        <div id="messages" class="well" ng-show="message">{{ message}}</div>
        <div class="container">
            <div class="row">
                <div class="col-md-offset-1 col-md-10">
                    <!-- FORM -->
                    <jsp:include page="/partials/sidenav.jsp" />

                    <div class="col-sm-9 col-md-9">
                        <form ng-submit="processForm()">
                            <div class="panel panel-info">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Event Advertising</h3>
                                </div>
                                <div class="panel-body">
                                    <div class="panel panel-primary">
                                        <div class="panel-heading">
                                            <h3 class="panel-title">Information</h3>
                                        </div>
                                        <div class="panel-body">
                                            <div class="form-group row">
                                                <div class="col-md-9" ng-class="{ 'has-error' : errorTitle }">
                                                    <label for="title">Title</label>
                                                    <input id="title" class="form-control" placeholder="Title" type="text" name="title" ng-model="formData.title" />
                                                    <span class="help-block" ng-show="errorTitle">{{ errorTitle}}</span>
                                                </div>
                                                <div class="col-md-3">
                                                    <label for="category">Category</label>
                                                    <select class="form-control" ng-model="formData.eventCategoryID">
                                                        <option ng-repeat="category in categories" value="{{category.id}}">
                                                            {{category.name}}
                                                        </option>
                                                    </select>
                                                </div>

                                            </div>
                                            <div class="form-group">
                                                <label>Select date and time</label>
                                                <div class="input-group">
                                                    <input type="text" class="form-control" datetime-picker="dd MMM yyyy HH:mm" ng-model="formData.date" is-open="isOpen" />
                                                    <span class="input-group-btn">
                                                        <button type="button" class="btn btn-default" ng-click="openCalendar($event, prop)"><span class="glyphicon-calendar glyphicon"></span></button>
                                                    </span>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="description">Description</label>
                                                <textarea id="description" class="form-control" rows="5" placeholder="Event description goes here" name="description" ng-model="formData.description"></textarea>
                                                <span class="help-block" ng-show="errorDescription">{{ errorDescription}}</span>
                                            </div>
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="panel panel-primary">
                                        <div class="panel-heading">
                                            <h3 class="panel-title">Location</h3>
                                        </div>
                                        <div class="panel-body">
                                            <div class="form-group">
                                                <label for="country">Country</label>
                                                <input id="country" class="form-control" placeholder="e.g.: EUA" type="text" name="country" ng-model="formData.country"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="city">City</label>
                                                <input id="city" class="form-control" placeholder="e.g.: New York" type="text" name="city" ng-model="formData.city"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="address">Address</label>
                                                <input id="address" class="form-control" placeholder="e.g.: 350 Fifth Avenue" type="text" name="address" ng-model="formData.address"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="address_optional">Optional Address</label>
                                                <input id="address_optional" class="form-control" placeholder="e.g.: 350 Fifth Avenue" type="text" name="addressOptional" ng-model="formData.addressOptional"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="zip">Postcode</label>
                                                <input id="zip" class="form-control" placeholder="e.g.: 10118-3299" type="text" name="zip" ng-model="formData.zip"/>
                                            </div>
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="panel panel-primary">
                                        <div class="panel-heading">
                                            <h3 class="panel-title">Insert some additional information</h3>
                                        </div>
                                        <div class="panel-body">
                                            <div class="form-group">
                                                <p>Do you have any additional details for your subscribers?</p>
                                                <label for="information">Information</label>
                                                <textarea id="information" class="form-control" rows="5" placeholder="Feel free to add some additional details about your event" name="information" ng-model="formData.additionalInformation"></textarea>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel panel-primary">
                                        <div class="panel-heading">
                                            <h3 class="panel-title">Insert some images</h3>
                                        </div>
                                        <div class="panel-body">
                                            <div class="form-group">
                                                <p>These may be photos from past editions or otherwise relevant to this event.</p>
                                                <label>Select Multiple Images</label>
                                                <input id="file-3" type="file" file-upload multiple=true>
                                            </div>
                                            <ul>
                                                <li ng-repeat="file in files">{{file.name}}</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- SUBMIT BUTTON -->
                            <button type="submit" class="btn btn-success btn-lg btn-block">
                                <span class="glyphicon glyphicon-flash"></span> Submit!
                            </button>
                        </form>
                    </div>
                    <!-- SHOW DATA FROM INPUTS AS THEY ARE BEING TYPED -->
                    <pre>
                        {{ formData}}
                    </pre>
                </div>
            </div>
        </div>
    </body>
</html>
<script>

    $(document).ready(function () {
        $("#file-3").fileinput({
            allowedFileExtensions: ['jpg', 'png', 'gif'],
            showUpload: false,
            showCaption: false,
            browseClass: "btn btn-primary btn-lg",
            fileType: "any",
            previewFileIcon: "<i class='glyphicon glyphicon-king'></i>"
        });
    });
</script>
