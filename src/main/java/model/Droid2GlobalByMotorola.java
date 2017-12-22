package model;

public class Droid2GlobalByMotorola extends PhoneDetail {
    //public static final Droid2GlobalByMotorola me = new Droid2GlobalByMotorola();
    public static Droid2GlobalByMotorola newInstance(){
        return new Droid2GlobalByMotorola();
    }

    private Droid2GlobalByMotorola() {
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
                        "230 hours",
                        "8 hours",
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
                        "WCDMA 850/1900/2100, CDMA 800/1900, GSM 850/900/1800/1900, HSDPA 10.2 Mbps (Category 9/10), CDMA EV-DO Release A, EDGE Class 12, GPRS Class 12, HSUPA 1.8 Mbps",
                        true,
                        false,
                        "802.11 b/g/n"
                ),
                 "With Quad Band GSM, the DROID 2 Global can send email and make and receive calls from more than 200 countries. It features an improved QWERTY keyboard, super-fast 1.2 GHz processor and enhanced security for all your business needs.",
                new PhoneDetail.Display(
                        "FWVGA (854 x 480)",
                        "3.7 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "1.2 GHz TI OMAP",
                        false,
                        true,
                        "USB 2.0"
                ),
                "droid-2-global-by-motorola",
                new String[] {
                        "img/phones/droid-2-global-by-motorola.0.jpg",
                        "img/phones/droid-2-global-by-motorola.1.jpg",
                        "img/phones/droid-2-global-by-motorola.2.jpg"
                },
                "DROID\u2122 2 Global by Motorola",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "60.5 mm (w)",
                                "116.3 mm (h)",
                                "13.7 mm (d)"
                        },
                        "169.0 grams"
                ),
                new PhoneDetail.Storage(
                        "8192MB",
                        "512MB"
                )

        );
    }
}

