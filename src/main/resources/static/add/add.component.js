'use strict';

angular.module('add').component('add', {
    templateUrl: 'add/add.template.html',
    controller: [
        function addController() {

        }
    ]
})
    .controller('addition',
        function ($scope, $location, $http) {

            $scope.myDefaultColor1 = {"color": "grey"};
            $scope.myDefaultColor2 = {"color": "grey"};
            $scope.myDefaultColor5 = {"color": "grey"};
            $scope.myDefaultColor6 = {"color": "grey"};
            $scope.myDefaultColor8 = {"color": "grey"};
            $scope.my1DefaultColor9 = {"color": "grey"};
            $scope.myDefaultColor11 = {"color": "grey"};
            $scope.my2DefaultColor11 = {"color": "grey"};
            $scope.my3DefaultColor11 = {"color": "grey"};
            $scope.myDefaultColor13 = {"color": "grey"};
            $scope.my5DefaultColor13 = {"color": "grey"};
            $scope.myDefaultColor14 = {"color": "grey"};
            $scope.myDefaultColor15 = {"color": "grey"};
            $scope.my9DefaultColor15 = {"color": "grey"};
            $scope.my11DefaultColor16 = {"color": "grey"};
            $scope.my12DefaultColor16 = {"color": "grey"};
            $scope.my15DefaultColor16 = {"color": "grey"};
            $scope.myDefaultColor19 = {"color": "grey"};
            $scope.myDefaultColor20 = {"color": "grey"};
            $scope.my16DefaultColor20 = {"color": "grey"};
            $scope.my17DefaultColor20 = {"color": "grey"};
            $scope.my18DefaultColor20 = {"color": "grey"};
            $scope.myDefaultColor21 = {"color": "grey"};
            $scope.my19DefaultColor21 = {"color": "grey"};

            $scope.myFunc1 = function () {
                $scope.myDefaultColor1 = {"color": "black"}
            };
            $scope.myFunc2 = function () {
                $scope.myDefaultColor2 = {"color": "black"}
            };
            $scope.myFunc5 = function () {
                $scope.myDefaultColor5 = {"color": "black"}
            };
            $scope.myFunc6 = function () {
                $scope.myDefaultColor6 = {"color": "black"}
            };
            $scope.myFunc8 = function () {
                $scope.myDefaultColor8 = {"color": "black"}
            };
            $scope.my1Func9 = function () {
                $scope.my1DefaultColor9 = {"color": "black"}
            };
            $scope.myFunc11 = function () {
                $scope.myDefaultColor11 = {"color": "black"}
            };
            $scope.my2Func11 = function () {
                $scope.my2DefaultColor11 = {"color": "black"}
            };
            $scope.my3Func11 = function () {
                $scope.my3DefaultColor11 = {"color": "black"}
            };
            $scope.myFunc13 = function () {
                $scope.myDefaultColor13 = {"color": "black"}
            };
            $scope.my5Func13 = function () {
                $scope.my5DefaultColor13 = {"color": "black"}
            };
            $scope.myFunc14 = function () {
                $scope.myDefaultColor14 = {"color": "black"}
            };
            $scope.myFunc15 = function () {
                $scope.myDefaultColor15 = {"color": "black"}
            };
            $scope.my9Func15 = function () {
                $scope.my9DefaultColor15 = {"color": "black"}
            };
            $scope.my11Func16 = function () {
                $scope.my11DefaultColor16 = {"color": "black"}
            };
            $scope.my12Func16 = function () {
                $scope.my12DefaultColor16 = {"color": "black"}
            };
            $scope.my15Func16 = function () {
                $scope.my15DefaultColor16 = {"color": "black"}
            };
            $scope.myFunc19 = function () {
                $scope.myDefaultColor19 = {"color": "black"}
            };
            $scope.myFunc20 = function () {
                $scope.myDefaultColor20 = {"color": "black"}
            };
            $scope.my16Func20 = function () {
                $scope.my16DefaultColor20 = {"color": "black"}
            };
            $scope.my17Func20 = function () {
                $scope.my17DefaultColor20 = {"color": "black"}
            };
            $scope.my18Func20 = function () {
                $scope.my18DefaultColor20 = {"color": "black"}
            };
            $scope.myFunc21 = function () {
                $scope.myDefaultColor21 = {"color": "black"}
            };
            $scope.my19Func21 = function () {
                $scope.my19DefaultColor21 = {"color": "black"}
            };

            $scope.myName1 = 0; //age
            $scope.myName2 = "My Carrier";
            $scope.myName5 = "My Name";
            $scope.myName6 = "My Snippet";

            $scope.myName8 = "My AdditionalFeatures";

            $scope.myName9 = 0; //os_id

            $scope.my1Name9 = "My ui";

            $scope.myName10 = '0000'; //availability_id

            $scope.myName11 = "My standbyTime";
            $scope.my2Name11 = "My talkTime";
            $scope.my3Name11 = "My type";

            $scope.myName12 = 'Flash';

            $scope.my4Name12 = 0; //primary_id

            $scope.myName13 = 0; //bluetooth_id

            $scope.my5Name13 = "My cell";
            $scope.my6Name13 = false; //gps
            $scope.my7Name13 = false; //infrared
            $scope.my8Name13 = 0; //wifi_id

            $scope.myName14 = "My Description";

            $scope.myName15 = "My screenResolution";
            $scope.my9Name15 = "My screenSize";
            $scope.my10Name15 = false; //touchScreen


            $scope.myName16 = false; //accelerometer
            $scope.my11Name16 = 0;

            $scope.my12Name16 = "My cpu";
            $scope.my13Name16 = false; //fmRadio
            $scope.my14Name16 = false; //physicalKeyboard
            $scope.my15Name16 = 0; //usb_id

            $scope.myName18 = [];
            var rand1 = Math.floor(Math.random() * 1084);
            var rand2 = Math.floor(Math.random() * 1084);
            var rand3 = Math.floor(Math.random() * 1084);

            var img1 = "https://picsum.photos/400?image=" + rand1;
            var img2 = "https://picsum.photos/400?image=" + rand2;
            var img3 = "https://picsum.photos/400?image=" + rand3;

            $scope.myName18 = [img1, img2, img3];

            $scope.myName19 = "My name";

            $scope.myName20 = "My width";
            $scope.my16Name20 = "My height";
            $scope.my17Name20 = "My depth";

            $scope.my18Name20 = "My weight";

            $scope.myName21 = "My flash";
            $scope.my19Name21 = "My ram";

            $scope.add = function () {
                var favorite = [];
                $.each($("input[name='myName10']:checked"), function () {
                    favorite.push($(this).val());
                });
                var phoneForAdd = {
                    phone: {
                        age: $scope.myName1,
                        carrier: $scope.myName2,
                        name: $scope.myName5,
                        snippet: $scope.myName6,
                    },
                    phoneDetail: {
                        additionalFeatures: $scope.myName8,
                        android: {os: $scope.myName9, ui: $scope.my1Name9},

                        availability: favorite,

                        battery: {standbyTime: $scope.myName11, talkTime: $scope.my2Name11, type: $scope.my3Name11},
                        camera: {
                            features:
                                $scope.myName12.split(','),
                            primary: $scope.my4Name12
                        },
                        connectivity: {
                            bluetooth: $scope.myName13,
                            cell: $scope.my5Name13,
                            gps: $scope.my6Name13,
                            infrared: $scope.my7Name13,
                            wifi: $scope.my8Name13
                        },
                        description: $scope.myName14,
                        display: {
                            screenResolution: $scope.myName15,
                            screenSize: $scope.my9Name15,
                            touchScreen: $scope.my10Name15
                        },
                        hardware: {
                            accelerometer: $scope.myName16,
                            audioJack: $scope.my11Name16,
                            cpu: $scope.my12Name16,
                            fmRadio: $scope.my13Name16,
                            physicalKeyboard: $scope.my14Name16,
                            usb: $scope.my15Name16
                        },
                        id: $scope.myName17,

                        images: $scope.myName18,

                        name: $scope.myName19,
                        sizeAndWeight: {
                            dimensions: [$scope.myName20, $scope.my16Name20, $scope.my17Name20],
                            weight: $scope.my18Name20
                        },
                        storage: {flash: $scope.myName21, ram: $scope.my19Name21}
                    }
                };
                $http.post('/add', phoneForAdd, {
                    headers: {
                        //"content-type": "application/x-www-form-urlencoded"
                    }
                })
            };
        });
