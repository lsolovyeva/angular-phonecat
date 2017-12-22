package model;

public class TMobileMytouch4g extends PhoneDetail {
    //public static final TMobileMytouch4g me = new TMobileMytouch4g();
    public static TMobileMytouch4g newInstance(){
        return new TMobileMytouch4g();
    }

    private TMobileMytouch4g() {
        super(
                 "Mobile Video Chat, HD Camcorder, Screen Share (DLNA), Genius Button, Wi-Fi Calling, Wi-Fi HotSpot, T-Mobile TV, Slacker Radio, Rock Band, Monopoly, Asphalt 5, myModes, Faves Gallery",
                new PhoneDetail.Android(
                        "Android 2.2",
                        "AHTC Sense\u2122"
                ),
                new String[] {
                        "T-Mobile"
                },
                new PhoneDetail.Battery(
                        "285 hours",
                        "7 hours",
                        "Lithium Ion (Li-Ion) (1400 mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {
                                "Flash",
                                "Video"
                        },
                        "5.0 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 2.0",
                        "GSM: 850, 900, 1800, 1900; UMTS: Band I/IV",
                        true,
                        false,
                        "802.11 b/g/n"
                ),
                "The myTouch 4G lets you connect fast, communicate easily, and share\u2014all on America\u2019s largest 4G network.\n\nBuilt with families in mind, the newest T-Mobile myTouch 4G helps solve the challenges of staying physically and emotionally connected by sharing photos and video with the HD Camcorder, spontaneous face-to-face conversations through Video Chat, and the ability to reach 4G speeds on T-Mobile\u2019s HSPA+ network.",
                new PhoneDetail.Display(
                        "WVGA (800 x 480)",
                        "3.8 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "2nd Generation 1GHz Qualcomm Snapdragon MSM8255",
                        false,
                        false,
                        "USB 2.0"
                ),
                "t-mobile-mytouch-4g",
                new String[] {
                        "img/phones/t-mobile-mytouch-4g.0.jpg",
                        "img/phones/t-mobile-mytouch-4g.1.jpg",
                        "img/phones/t-mobile-mytouch-4g.2.jpg",
                        "img/phones/t-mobile-mytouch-4g.3.jpg",
                        "img/phones/t-mobile-mytouch-4g.4.jpg",
                        "img/phones/t-mobile-mytouch-4g.5.jpg"
                },
                "T-Mobile myTouch 4G",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "62.5 mm (w)",
                                "122.0 mm (h)",
                                "11.0 mm (d)"
                        },
                        "156.0 grams"
                ),
                new PhoneDetail.Storage(
                        "1100MB",
                        "768MB"
                )

        );
    }
}

