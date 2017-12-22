package model;

public class LgAxis extends PhoneDetail {
    //public static final LgAxis me = new LgAxis();
    public static LgAxis newInstance(){
        return new LgAxis();
    }

    private LgAxis() {
        super(
                "Accessibility features: Tactile QWERTY keyboard, four-direction keypad, start and end call buttons, dedicated number keys, camera button, TalkBack screen reader",
                new PhoneDetail.Android(
                        "Android 2.1",
                        "LG Home"
                ),
                new String[] {
                        "Cellular South"
                },
                new PhoneDetail.Battery(
                        "500 hours",
                        "8 hours",
                        "Lithium Ion (Li-Ion) (1500 mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {
                                "Flash",
                                "Video"
                        },
                        "3.0 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 2.1",
                        "1.9 GHz CDMA PCS, 800 MHz CDMA, EVDO Rev. A, 1xRTT",
                        true,
                        false,
                        "802.11 b/g"
                ),
                 "Android plus QWERTY is a powerful duo. LG Axis melds a speedy UI with the limitless micro-entertainment of 80,000+ apps including voice-activated Google. Feel the tactile vibration on its tempered glass touchscreen. Take the fuzziness out of your fun with a 3.2MP camera that does 360\u00b0 panoramics. And customize your home screens with shortcuts to your apps, favorites, and widgets. It's the centerpiece of your life.",
                new PhoneDetail.Display(
                        "WVGA (800 x 480)",
                        "3.2 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "",
                        "600 MHz Qualcomm MSM7627",
                        false,
                        true,
                        "USB 2.0"
                ),
                "lg-axis",
                new String[] {
                        "img/phones/lg-axis.0.jpg",
                        "img/phones/lg-axis.1.jpg",
                        "img/phones/lg-axis.2.jpg"
                },
                "LG Axis",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "56.0 mm (w)",
                                "116.0 mm (h)",
                                "16.0 mm (d)"
                        },
                        "158.0 grams"
                ),
                new PhoneDetail.Storage(
                        "126MB",
                        "256MB"
                )

        );
    }
}

