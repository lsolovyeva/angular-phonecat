'use strict';

angular.
module('add').
component('add', {
    templateUrl: 'add/add.template.html',
    controller: [
        function addController() {

        }
    ]
})
    .controller('addition',
        function($scope, $location, $http) {
/*
            $scope.credentials = {};
            $scope.login = function () {
                $http.post('/login', $.param($scope.credentials), {
                    headers: {
                        "content-type": "application/x-www-form-urlencoded"
                    }
                }).success(function (data) {
                    authenticate(function () {
                        if ($rootScope.authenticated) {
                            console.log("Login succeeded")
                            //$location.path("/");
                            $location.path("/phones");
                            $scope.error = false;
                            $rootScope.authenticated = true;
                        } else {
                            console.log("Login failed with redirect")
                            $location.path("/login");
                            $scope.error = true;
                            $rootScope.authenticated = false;
                        }
                    });
                }).error(function (data) {
                    console.log("Login failed")
                    $location.path("/login");
                    $scope.error = true;
                    $rootScope.authenticated = false;
                })
            };

         */
            $scope.myName2 = "My Carrier";
            $scope.myName5 = "My Name";


            $scope.add = function () {

                //$scope.myName2 = "My Carrier";
                                $http.post('/add', {'myName2': $scope.myName2, 'myName5': $scope.myName5}, {
                                    headers: {
                                      //  "content-type": "application/x-www-form-urlencoded"
                                    }
                                })

                /*
                                $http({
                                    method: 'POST',
                                    url: 'request-url',
                                    data: "message=" + $scope.myName1,
                                    headers: {'Content-Type': 'application/x-www-form-urlencoded'}
                                });
                                */



            };

        })
;
