'use strict';

angular.
module('phonecatApp')
.config(['$locationProvider' ,'$routeProvider',
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
            templateUrl: 'login/login.template.html',
            controller : 'navigation'
        }).
        when('/add', {
            templateUrl: 'add/add.template.html',
            controller : 'navigation'
        }).
        otherwise('/login');
    }
]);
