package model;


public class MotorolaXoomWithWiFi extends PhoneDetail {
    //public static final MotorolaXoomWithWiFi me = new MotorolaXoomWithWiFi();
    public static MotorolaXoomWithWiFi newInstance(){
        return new MotorolaXoomWithWiFi();
    }

    private MotorolaXoomWithWiFi() {
        super(
                "Sensors: proximity, ambient light, barometer, gyroscope",
                new PhoneDetail.Android(
                        "Android 3.0",
                        "Honeycomb"
                ),
                new String[] {
                        ""
                },
                new PhoneDetail.Battery(
                        "336 hours",
                        "24 hours",
                        "Other ( mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {"Flash", "Video"},
                        "5.0 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 2.1",
                        "",
                        true,
                        false,
                        "802.11 b/g/n"
                ),
                "Motorola XOOM with Wi-Fi has a super-powerful dual-core processor and Android\u2122 3.0 (Honeycomb) \u2014 the Android platform designed specifically for tablets. With its 10.1-inch HD widescreen display, you\u2019ll enjoy HD video in a thin, light, powerful and upgradeable tablet.",
                new PhoneDetail.Display(
                        "WXGA (1200 x 800)",
                        "10.1 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                "1 GHz Dual Core Tegra 2",
                 false,
                 false,
                "USB 2.0"
                ),
                "motorola-xoom-with-wi-fi",
                new String[] {
                        "img/phones/motorola-xoom-with-wi-fi.0.jpg",
                        "img/phones/motorola-xoom-with-wi-fi.1.jpg",
                        "img/phones/motorola-xoom-with-wi-fi.2.jpg",
                        "img/phones/motorola-xoom-with-wi-fi.3.jpg",
                        "img/phones/motorola-xoom-with-wi-fi.4.jpg",
                        "img/phones/motorola-xoom-with-wi-fi.5.jpg",
                },
                "Motorola XOOM\u2122 with Wi-Fi",
                new PhoneDetail.SizeAndWeight(
                        new String[] {"249.1 mm (w)",
                                "167.8 mm (h)",
                                "12.9 mm (d)"},
                        "708.0 grams"
                ),
                new PhoneDetail.Storage(
                        "32000MB",
                        "1000MB"
                )
        );
    }
}
