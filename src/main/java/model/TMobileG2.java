package model;

public class TMobileG2 extends PhoneDetail {
    public static final TMobileG2 me = new TMobileG2();

    private TMobileG2() {
        super(
                "Accessibility features: tactile QWERTY keyboard, trackpad, three programmable keys, camera button",
                new PhoneDetail.Android(
                        "Android 2.2",
                        "Android"
                ),
                new String[] {
                        "T-Mobile"
                },
                new PhoneDetail.Battery(
                        "420 hours",
                        "7 hours",
                        "Lithium Ion (Li-Ion) (1300 mAH)"
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
                        "QGSM: 850, 900, 1800, 1900  UMTS: Yes",
                        true,
                        false,
                        "802.11 b/g/n"
                ),
                "The T-Mobile G1 was the world's first Android-powered phone. Launched nearly two years ago, it created an entirely new class of mobile phones and apps. Its successor, the T-Mobile G2 with Google, will continue the revolution.\n\nThe T-Mobile G2 will deliver tight integration with Google services and break new ground as the first smartphone designed to run at 4G speeds on our new HSPA+ network.",
                new PhoneDetail.Display(
                        "WVGA (800 x 480)",
                        "3.7 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "800 MHz Qualcomm\u00ae Snapdragon\u2122 MSM723r",
                        false,
                        true,
                        "USB 2.0"
                ),
                "t-mobile-g2",
                new String[] {
                        "img/phones/nexus-s.0.jpg",
                        "img/phones/nexus-s.1.jpg",
                        "img/phones/nexus-s.2.jpg",
                        "img/phones/nexus-s.3.jpg"
                },
                "T-Mobile G2",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "60.4 mm (w)",
                                "119.0 mm (h)",
                                "14.2 mm (d)"
                        },
                        "180.0 grams"
                ),
                new PhoneDetail.Storage(
                        "4000MB",
                        "512MB"
                )

        );
    }
}

