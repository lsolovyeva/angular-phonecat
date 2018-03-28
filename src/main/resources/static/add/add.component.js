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

            $scope.myDefaultColor1 = {"color" : "grey"}; $scope.myDefaultColor2 = {"color" : "grey"};
            $scope.myDefaultColor3 = {"color" : "grey"}; $scope.myDefaultColor4 = {"color" : "grey"};
            $scope.myDefaultColor5 = {"color" : "grey"}; $scope.myDefaultColor6 = {"color" : "grey"};
            $scope.myDefaultColor7 = {"color" : "grey"}; $scope.myDefaultColor8 = {"color" : "grey"};
            $scope.myDefaultColor9 = {"color" : "grey"}; $scope.my1DefaultColor9 = {"color" : "grey"};
            $scope.myDefaultColor10 = {"color" : "grey"}; $scope.myDefaultColor11 = {"color" : "grey"};
            $scope.my2DefaultColor11 = {"color" : "grey"}; $scope.my3DefaultColor11 = {"color" : "grey"};
            $scope.myDefaultColor12 = {"color" : "grey"};$scope.my4DefaultColor12 = {"color" : "grey"};
            $scope.myDefaultColor13 = {"color" : "grey"};$scope.my5DefaultColor13 = {"color" : "grey"};
            $scope.my8DefaultColor13 = {"color" : "grey"};

            $scope.myDefaultColor14 = {"color" : "grey"}; $scope.myDefaultColor19 = {"color" : "grey"};


            $scope.myFunc1 = function() {$scope.myDefaultColor1 = {"color" : "black"}};
            $scope.myFunc2 = function() {$scope.myDefaultColor2 = {"color" : "black"}};
            $scope.myFunc3 = function() {$scope.myDefaultColor3 = {"color" : "black"}};
            $scope.myFunc4 = function() {$scope.myDefaultColor4 = {"color" : "black"}};
            $scope.myFunc5 = function() {$scope.myDefaultColor5 = {"color" : "black"}};
            $scope.myFunc6 = function() {$scope.myDefaultColor6 = {"color" : "black"}};
            $scope.myFunc7 = function() {$scope.myDefaultColor7 = {"color" : "black"}};
            $scope.myFunc8 = function() {$scope.myDefaultColor8 = {"color" : "black"}};
            $scope.myFunc9 = function() {$scope.myDefaultColor9 = {"color" : "black"}};
            $scope.my1Func9 = function() {$scope.my1DefaultColor9 = {"color" : "black"}};
            $scope.myFunc10 = function() {$scope.myDefaultColor10 = {"color" : "black"}};
            $scope.myFunc11 = function() {$scope.myDefaultColor11 = {"color" : "black"}};
            $scope.my2Func11 = function() {$scope.my2DefaultColor11 = {"color" : "black"}};
            $scope.my3Func11 = function() {$scope.my3DefaultColor11 = {"color" : "black"}};
            $scope.myFunc12 = function() {$scope.myDefaultColor12 = {"color" : "black"}};
            $scope.my4Func12 = function() {$scope.my4DefaultColor12 = {"color" : "black"}};
            $scope.myFunc13 = function() {$scope.myDefaultColor13 = {"color" : "black"}};
            $scope.my5Func13 = function() {$scope.my5DefaultColor13 = {"color" : "black"}};
            $scope.my8Func13 = function() {$scope.my8DefaultColor13 = {"color" : "black"}};

            $scope.myFunc14 = function() {$scope.myDefaultColor14 = {"color" : "black"}};
            $scope.myFunc19 = function() {$scope.myDefaultColor19 = {"color" : "black"}};



            $scope.myName1 = 0;
            $scope.myName2 = "My Carrier";
            $scope.myName3 = 0; //Id
            $scope.myName4 = "My ImageUrl";
            $scope.myName5 = "My Name";
            $scope.myName6 = "My Snippet";
            $scope.myName7 = 0;//phonedetail_id

            $scope.myName8 = "My AdditionalFeatures";

            $scope.myName9 = "My os";
            $scope.my1Name9 = "My ui";

            $scope.myName10 = "My availability"; //??? List<String>

            $scope.myName11 = "My standbyTime";
            $scope.my2Name11 = "My talkTime";
            $scope.my3Name11 = "My type";

            $scope.myName12 = "My features"; //??? List<String>
            $scope.my4Name12 = "My primary";

            $scope.myName13 = "My bluetooth";
            $scope.my5Name13 = "My cell";
            $scope.my6Name13 = true;
            $scope.my7Name13 = true;
            $scope.my8Name13 = "My wifi";

            $scope.myName14 = "My Description";

            $scope.myName15 = "My screenResolution";
            $scope.my9Name15 = "My screenSize";
            $scope.my10Name15 = true;


            $scope.myName16 = true;
            $scope.my11Name16 = "My audioJack";
            $scope.my12Name16 = "My cpu";
            $scope.my13Name16 = true;
            $scope.my14Name16 = true;
            $scope.my15Name16 = "My usb";

            $scope.myName17 = "My id";
            $scope.myName18 = "My images"; //??? List<String>
            $scope.myName19 = "My name";

            $scope.myName20 = "My dimensions"; //??? List<String>
            $scope.my16Name20 = "My weight";

            $scope.myName21 = "My flash";
            $scope.my17Name21 = "My ram";


            $scope.add = function () {
               // var phoneForAdd = {myName1 : $scope.myName1, myName2 : "My Carrier", myName5 : $scope.myName5, myName14 : $scope.myName14};
                var phoneForAdd = {
                                    phone : {
                                        age : $scope.myName1,
                                        carrier : $scope.myName2,
                                        id : $scope.myName3,
                                        imageUrl : $scope.myName4,
                                        name : $scope.myName5,
                                        snippet : $scope.myName6,
                                        phonedetail_id : $scope.myName7
                                    },
                                    phoneDetail : {
                                        additionalFeatures : $scope.myName8,
                                        android : {os : $scope.myName9, ui : $scope.my1Name9},
                                        availability : $scope.myName10,
                                        battery : {standbyTime : $scope.myName11, talkTime : $scope.my2Name11, type : $scope.my3Name11},
                                        camera : {features : $scope.myName12, primary : $scope.my4Name12},
                                        connectivity : {bluetooth : $scope.myName13, cell : $scope.my5Name13, gps : $scope.my6Name13, infrared : $scope.my7Name13, wifi : $scope.my8Name13},
                                        description : $scope.myName14,
                                        display : {screenResolution : $scope.myName15, screenSize : $scope.my9Name15, touchScreen : $scope.my10Name15},
                                        hardware : {accelerometer : $scope.myName16, audioJack : $scope.my11Name16, cpu : $scope.my12Name16, fmRadio : $scope.my13Name16, physicalKeyboard : $scope.my14Name16, usb : $scope.my15Name16},
                                        id : $scope.myName17,
                                        images : $scope.myName18,
                                        name : $scope.myName19,
                                        sizeAndWeight : {dimensions : $scope.myName20, weight : $scope.my16Name20},
                                        storage : {flash : $scope.myName21, ram : $scope.my17Name21}
                                    }
                };
                $http.post('/add',phoneForAdd , {
                        headers: {
                         //"content-type": "application/x-www-form-urlencoded"
                         //   "content-type": "application/json"
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
