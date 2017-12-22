package model;

public class MotorolaBravoWithMotoblur extends PhoneDetail {
    //public static final MotorolaBravoWithMotoblur me = new MotorolaBravoWithMotoblur();
    public static MotorolaBravoWithMotoblur newInstance(){
        return new MotorolaBravoWithMotoblur();
    }

    private MotorolaBravoWithMotoblur() {
        super(
                 "Adobe\u00ae Flash\u00ae Lite\u00ae 3, DNLA, CrystalTalk\u2122 PLUS technology",
                new PhoneDetail.Android(
                        "Android 2.1",
                        "MOTOBLUR\u2122"
                ),
                new String[] {
                        "AT&T"
                },
                new PhoneDetail.Battery(
                        "216 hours",
                        "6 hours",
                        "Lithium Ion (Li-Ion) (1500 mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {
                                "Video"
                        },
                        "3.0 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 2.1",
                         "WCDMA 850/1900, GSM 850/900/1800/1900, HSDPA 7.2 Mbps (Category 7/8), EDGE Class 12, GPRS Class 12, HSUPA 2.0 Mbps",
                        true,
                        false,
                        "802.11 b/g/n"
                ),
                 "MOTOROLA BRAVO\u2122 with MOTOBLUR\u2122 with its large 3.7-inch touchscreen and web-browsing capabilities is sure to make an impression.  And it keeps your life updated and secure through MOTOBLUR.",
                new PhoneDetail.Display(
                        "WVGA (800 x 480)",
                        "3.7 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "800 Mhz",
                        true,
                        false,
                        "USB 2.0"
                ),
                "motorola-bravo-with-motoblur",
                new String[] {
                        "img/phones/motorola-bravo-with-motoblur.0.jpg",
                        "img/phones/motorola-bravo-with-motoblur.1.jpg",
                        "img/phones/motorola-bravo-with-motoblur.2.jpg"
                },
                "NMOTOROLA BRAVO\\u2122 with MOTOBLUR\\u2122",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "63.0 mm (w)",
                                "109.0 mm (h)",
                                "13.3 mm (d)"
                        },
                        "130.0 grams"
                ),
                new PhoneDetail.Storage(
                        "",
                        ""
                )

        );
    }
}

