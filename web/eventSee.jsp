<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
            #map {
                height:420px;
                width:600px;
            }
            .infoWindowContent {
                font-size:  14px !important;
                border-top: 1px solid #ccc;
                padding-top: 10px;
            }
        </style>

        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.9/angular.min.js"></script>
        <script type="text/javascript"
                src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDQm3SmzFttml3FCJAsO6nQ7os_q8bdUhA">
        </script>
        <script type="text/javascript">
            //Data
            var cities = [
                {
                    city: 'Toronto',
                    desc: 'This is the best city in the world!',
                    lat: 43.7000,
                    long: -79.4000
                },
                {
                    city: 'New York',
                    desc: 'This city is aiiiiite!',
                    lat: 40.6700,
                    long: -73.9400
                },
                {
                    city: 'Chicago',
                    desc: 'This is the second best city in the world!',
                    lat: 41.8819,
                    long: -87.6278
                },
                {
                    city: 'Los Angeles',
                    desc: 'This city is live!',
                    lat: 34.0500,
                    long: -118.2500
                },
                {
                    city: 'Las Vegas',
                    desc: 'Sin City...\'nuff said!',
                    lat: 36.0800,
                    long: -115.1522
                }
            ];

//Angular App Module and Controller
            angular.module('mapsApp', [])
                    .controller('MapCtrl', function ($scope) {

                        var mapOptions = {
                            zoom: 4,
                            center: new google.maps.LatLng(40.0000, -98.0000),
                            mapTypeId: google.maps.MapTypeId.TERRAIN
                        }

                        $scope.map = new google.maps.Map(document.getElementById('map'), mapOptions);

                        $scope.markers = [];

                        var infoWindow = new google.maps.InfoWindow();

                        var createMarker = function (info) {

                            var marker = new google.maps.Marker({
                                map: $scope.map,
                                position: new google.maps.LatLng(info.lat, info.long),
                                title: info.city
                            });
                            marker.content = '<div class="infoWindowContent">' + info.desc + '</div>';

                            google.maps.event.addListener(marker, 'click', function () {
                                infoWindow.setContent('<h2>' + marker.title + '</h2>' + marker.content);
                                infoWindow.open($scope.map, marker);
                            });

                            $scope.markers.push(marker);

                        }

                        for (i = 0; i < cities.length; i++) {
                            createMarker(cities[i]);
                        }

                        $scope.openInfoWindow = function (e, selectedMarker) {
                            e.preventDefault();
                            google.maps.event.trigger(selectedMarker, 'click');
                        }

                    });</script>
    </head>
    <body>
        <div ng-app="mapsApp" ng-controller="MapCtrl">
            <div id="map"></div>
            <div id="class" ng-repeat="marker in markers| orderBy : 'title'">
                <a href="#" ng-click="openInfoWindow($event, marker)">{{marker.title}}</a>
            </div>
        </div>
    </body>
</html>
