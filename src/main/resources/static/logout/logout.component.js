'use strict';

angular.
module('phoneDetail').
component('logout', {
    templateUrl: 'logout/logout.template.html',
    controller: ["$http", "$location", "$rootScope", "$scope",
        function LogoutController($http, $location, $rootScope, $scope) {
            $scope.logout = function() {
                $http.post('logout', {}).success(function() {
                    $rootScope.authenticated = false;
                    $location.path("#!/phones");
                }).error(function(data) {
                    $rootScope.authenticated = false;
                });
            };
        }
    ]
});