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

            $scope.add = function () {

                $scope.myName1 = 12;

                                $http.post('http://localhost:8080/#!/add', $scope.myName1, {
                                    headers: {
                                        "content-type": "application/x-www-form-urlenced"
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
