package model;

public class SanyoZio extends PhoneDetail {
    public static final SanyoZio me = new SanyoZio();

    private SanyoZio() {
        super(
                "Trackball Navigation Control",
                new PhoneDetail.Android(
                        "Android 2.2",
                        ""
                ),
                new String[] {
                        "Sprint"
                },
                new PhoneDetail.Battery(
                        "",
                        "4 hours",
                        "Lithium Ion (Li-Ion) (1130 mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {
                                "Video"
                        },
                        "3.2 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 2.1",
                        "CDMA2000 1xEV-DO Rev.A",
                        true,
                        false,
                        "802.11 b/g"
                ),
                "Zio uses CDMA2000 1xEV-DO rev. A and Wi-Fi technologies and features a 3.5-inch WVGA touch-screen display as a backdrop for a fully customizable mobile multimedia experience.  Along with the touch-screen, a trackball helps users navigate features such as the 3.2 MP camera with video record/playback, media player and full HTML Web browser.  Zio supports up to 32GB through its external microSD memory slot.",
                new PhoneDetail.Display(
                        "WVGA (800 x 480)",
                        "3.5 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "600MHz Qualcomm MSM7627",
                        false,
                        false,
                        "USB 2.0"
                ),
                "sanyo-zio",
                new String[] {
                        "img/phones/sanyo-zio.0.jpg",
                        "img/phones/sanyo-zio.1.jpg",
                        "img/phones/sanyo-zio.2.jpg"
                },
                "SANYO ZIO",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "58.6 mm (w)",
                                "116.0 mm (h)",
                                "12.2 mm (d)"
                        },
                        "105.0 grams"
                ),
                new PhoneDetail.Storage(
                        "130MB",
                        "256MB"
                )

        );
    }
}

