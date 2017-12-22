package model;

public class MotorolaDefyWithMotoblur extends PhoneDetail {
    public static final MotorolaDefyWithMotoblur me = new MotorolaDefyWithMotoblur();

    private MotorolaDefyWithMotoblur() {
        super(
                "Blockbuster On Demand\u00ae movies and music downloads with connected music player\nWater-resistant and dustproof",
                new PhoneDetail.Android(
                        "Android 2.1",
                        "MOTOBLUR"
                ),
                new String[] {
                        "SFR,",
                        "T-Mobile,",
                        "Vodafone"
                },
                new PhoneDetail.Battery(
                        "400 hours",
                        "6 hours",
                        "Lithium Ion (Li-Ion) (1540 mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {
                                "Flash",
                                "Video"
                        },
                        "5.0 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 2.1",
                        "WCDMA 850/1700/2100, GSM 850/900/1800/1900, HSDPA 7.2 Mbps (Category 7/8), EDGE Class 12, GPRS Class 12, HSUPA 2.0 Mbps",
                        true,
                        false,
                        "802.11 b/g/n"
                ),
                 "DEFY with MOTOBLUR is ready for everything life throws your way. It's water-resistant and dustproof, with plenty of entertainment options; and, with MOTOBLUR, it automatically delivers messages and status updates right to your home screen.",
                new PhoneDetail.Display(
                        "FWVGA (854 x 480)",
                        "3.7 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "800 MHz TI OMAP3610",
                        false,
                        false,
                        "USB 2.0"
                ),
                "motorola-defy-with-motoblur",
                new String[] {
                        "img/phones/motorola-defy-with-motoblur.0.jpg",
                        "img/phones/motorola-defy-with-motoblur.1.jpg",
                        "img/phones/motorola-defy-with-motoblur.2.jpg"
                },
                "Motorola DEFY\u2122 with MOTOBLUR\u2122",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "59.0 mm (w)",
                                "107.0 mm (h)",
                                "13.4 mm (d)"
                        },
                        "118.0 grams"
                ),
                new PhoneDetail.Storage(
                        "2000MB",
                        "512MB"
                )

        );
    }
}

