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
            template: '<login></login>'
        }).
        when('/logout', {
            template: '<logout></logout>'
        }).
        otherwise('/phones');
    }
]);
