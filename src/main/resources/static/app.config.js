'use strict';

angular.
module('phonecatApp').
config(['$locationProvider' ,'$routeProvider',
    function config($locationProvider, $routeProvider) {
        $locationProvider.hashPrefix('!');

        $routeProvider.
        when('/phones', {
            template: '<phone-list></phone-list>'
        }).
        when('/phones/:phoneId', {
            template: '<phone-detail></phone-detail>'
        }).
        when('/login', {
            //template: '<login></login>'
            //templateUrl : 'login.html',
            templateUrl: 'login/login.template.html',
            controller : 'navigation'
        }).
        otherwise('/login');
    }
])
.controller('navigation',
        
function($rootScope, $scope, $http, $location, $route) {

    $scope.tab = function(route) {
        return $route.current && route === $route.current.controller;
    };

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
    $scope.login = function() {
        $http.post('dologin', $.param($scope.credentials), {
            headers : {
                "content-type" : "application/x-www-form-urlencoded"
            }
        }).success(function(data) {
            authenticate(function() {
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
        }).error(function(data) {
            console.log("Login failed")
            $location.path("/login");
            $scope.error = true;
            $rootScope.authenticated = false;
        })
    };

    $scope.logout = function() {
        $http.post('logout', {}).success(function() {
            $rootScope.authenticated = false;
            $location.path("/");
        }).error(function(data) {
            console.log("Logout failed")
            $rootScope.authenticated = false;
        });
    }

})
;
