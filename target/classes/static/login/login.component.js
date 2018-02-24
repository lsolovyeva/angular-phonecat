'use strict';
angular.
module('phoneDetail').
component('login', {
    templateUrl: 'login/login.template.html',
    controller: ["$http", "$location", "$rootScope", "$scope",
        function LoginController($http, $location, $rootScope, $scope) {

           // var self = this;

            //
             var authenticate = function(callback) {
                 $http.get('user').success(function(data) {
                     if (data.name) {
                         $rootScope.authenticated = true;
                     } else {
                         $rootScope.authenticated = false;
                     }
                     callback && callback();
                 }).error(function() {
                     $rootScope.authenticated = false;
                     callback && callback();
                 });
             }
             authenticate();
             $scope.credentials = {};
            // $scope.credentials = "bla";
            //
            this.login = function() {
                $http.post('login', $.param($scope.credentials), {
                    headers : {
                        "content-type" : "application/x-www-form-urlencoded"
                    }
                })
                    //;
                     .success(function(data) {
                     authenticate(function() {
                         if ($rootScope.authenticated) {
                             $location.path("#!/phones");
                             $scope.error = false;
                         } else {
                             $location.path("#!login");
                             $scope.error = true;
                         }
                     });
                 }).error(function(data) {
                     $location.path("#!login");
                     $scope.error = true;
                     $rootScope.authenticated = false;
                 })
            };
        }
    ]
});