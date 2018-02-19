'use strict'
angular.
module('phoneDetail').
component('login', {
    templateUrl: 'login/login.template.html',
    controller: ["$http", "$location", "$rootScope",
        function LoginController($http, $location, $rootScope) {

            var self = this;
            this.login = function() {
                $http.post('login', $.param(self.credentials), {
                    headers : {
                        "content-type" : "application/x-www-form-urlencoded"
                    }
                });
                //     .success(function(data) {
                //     authenticate(function() {
                //         if ($rootScope.authenticated) {
                //             $location.path("/");
                //             self.error = false;
                //         } else {
                //             $location.path("/login");
                //             self.error = true;
                //         }
                //     });
                // }).error(function(data) {
                //     $location.path("/login");
                //     self.error = true;
                //     $rootScope.authenticated = false;
                // })
            };
        }
    ]
});