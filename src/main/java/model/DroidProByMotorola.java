package model;

public class DroidProByMotorola extends PhoneDetail {
    public static final DroidProByMotorola me = new DroidProByMotorola();

    private DroidProByMotorola() {
        super(
                "Adobe Flash Player 10, Quadband GSM Worldphone, Advance Business Security, Complex Password Secure, Review & Edit Documents with Quick Office, Personal 3G Mobile Hotspot for up to 5 WiFi enabled Devices, Advanced Social Networking brings all social content into a single homescreen widget",
                new PhoneDetail.Android(
                        "Android 2.2",
                        ""
                ),
                new String[] {
                        "Verizon"
                },
                new PhoneDetail.Battery(
                        "330 hours",
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
                        "Bluetooth 2.1",
                        "800/1900 CDMA EVDO Rev. A with dual diversity antenna, 850/900/1800/1900MHz GSM, GPRS Class 12, EDGE Class 12, 850/1900/2100 WCDMA (category 9/10), HSDPA 10.2mbps, HSUPA 1.8 mbps",
                        true,
                        false,
                        "802.11 b/g/n"
                ),
                 "Access your work directory, email or calendar with DROID Pro by Motorola., an Android-for-business smartphone with corporate-level security. It features both a QWERTY keyboard and touchscreen, a speedy 1 GHz processor and Adobe\u00ae Flash\u00ae Player 10.",
                new PhoneDetail.Display(
                        "HVGA (480 x 320)",
                        "3.1 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "1 GHz TI OMAP",
                        false,
                        true,
                        "USB 2.0"
                ),
                "droid-pro-by-motorola",
                new String[] {
                        "img/phones/droid-pro-by-motorola.0.jpg",
                        "img/phones/droid-pro-by-motorola.1.jpg"
                },
                "DROID\u2122 Pro by Motorola",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "61.0 mm (w)",
                                "119.0 mm (h)",
                                "11.7 mm (d)"
                        },
                        "134.0 grams"
                ),
                new PhoneDetail.Storage(
                        "2048MB",
                        "512MB"
                )

        );
    }
}

