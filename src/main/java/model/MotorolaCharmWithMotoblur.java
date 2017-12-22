package model;

public class MotorolaCharmWithMotoblur extends PhoneDetail {
    public static final MotorolaCharmWithMotoblur me = new MotorolaCharmWithMotoblur();

    private MotorolaCharmWithMotoblur() {
        super(
                 "MOTOBLUR-enabled; battery manager; seven home screens; customize by moving or resizing widgets; Android HTML WebKit w/Flash Lite; BACKTRACK\u2122 navigation pad behind screen",
                new PhoneDetail.Android(
                        "Android 2.1",
                        "MOTOBLUR"
                ),
                new String[] {
                        "T-Mobile,",
                        "Telus"
                },
                new PhoneDetail.Battery(
                        "267 hours",
                        "5 hours",
                        "Lithium Ion (Li-Ion) (1170 mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {
                                "Video"
                        },
                        "3.0 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 2.0",
                        "WCDMA 1700/2100, GSM 850/900/1800/1900, HSDPA 3.6 Mbps (Category 5/6), EDGE Class 12, GPRS Class 12",
                        true,
                        false,
                        "802.11 b/g"
                ),
                 "Motorola CHARM fits easily in your pocket or palm. Includes MOTOBLUR so you can sync and merge your contacts, emails, messages and posts with continuous updates and back-ups.",
                new PhoneDetail.Display(
                        "QVGA (320 x 240)",
                        "2.8 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "600 MHz",
                        false,
                        true,
                        "USB 2.0"
                ),
                "motorola-charm-with-motoblur",
                new String[] {
                        "img/phones/motorola-charm-with-motoblur.0.jpg",
                        "img/phones/motorola-charm-with-motoblur.1.jpg",
                        "img/phones/motorola-charm-with-motoblur.2.jpg"
                },
                "Motorola CHARM\u2122 with MOTOBLUR\u2122",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "67.2 mm (w)",
                                "98.4 mm (h)",
                                "11.4 mm (d)"
                        },
                        "110.0 grams"
                ),
                new PhoneDetail.Storage(
                        "150MB",
                        "512MB"
                )

        );
    }
}

