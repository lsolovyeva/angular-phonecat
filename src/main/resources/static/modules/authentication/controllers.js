'use strict';

angular.module('Authentication')

    .controller('LoginController',
        ['$scope', '$rootScope', '$location', 'AuthenticationService','$window',
            function ($scope, $rootScope, $location, AuthenticationService, $window) {
                // reset login status
                AuthenticationService.ClearCredentials();

                $scope.login = function () {
                    $scope.dataLoading = true;
                    AuthenticationService.Login($scope.username, $scope.password, function(response) {
                        if(response.success) {
                            AuthenticationService.SetCredentials($scope.username, $scope.password);
                            $window.location.href = '/index2.html';
                            $location.path('/');
                        } else {
                            $scope.error = response.message;
                            $scope.dataLoading = false;
                        }
                    });
                };
            }]);