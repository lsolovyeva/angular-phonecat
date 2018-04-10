'use strict';

angular.
module('add').
factory('Image', ['$resource',
    function($resource) {
        return $resource('https://picsum.photos/list', {}, {
            query: {
                method: 'GET',
                //params: {phoneId: 'phones'},
                isArray: true
            }
        });
    }
]);
