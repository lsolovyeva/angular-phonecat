package model;

public class MotorolaXoom extends PhoneDetail {
    public static final MotorolaXoom me = new MotorolaXoom();

    private MotorolaXoom() {
        super(
                "Front-facing camera. Sensors: proximity, ambient light, barometer, gyroscope.",
                new PhoneDetail.Android(
                        "Android 3.0",
                        "Android"
                ),
                new String[] {
                        "Verizon"
                },
                new PhoneDetail.Battery(
                        "336 hours",
                        "24 hours",
                        "Other (3250 mAH)"
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
                         "CDMA 800 /1900 LTE 700, Rx diversity in all bands",
                        true,
                        false,
                        "802.11 a/b/g/n"
                ),
                 "MOTOROLA XOOM has a super-powerful dual-core processor and Android\u2122 3.0 (Honeycomb) \u2014 the Android platform designed specifically for tablets. With its 10.1-inch HD widescreen display, you\u2019ll enjoy HD video in a thin, light, powerful and upgradeable tablet.",
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
                "motorola-xoom",
                new String[] {
                        "img/phones/motorola-xoom.0.jpg",
                        "img/phones/motorola-xoom.1.jpg",
                        "img/phones/motorola-xoom.2.jpg"
                },
                "MOTOROLA XOOM\u2122",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "249.0 mm (w)",
                                "168.0 mm (h)",
                                "12.7 mm (d)"
                        },
                        "726.0 grams"
                ),
                new PhoneDetail.Storage(
                        "32000MB",
                        "1000MB"
                )

        );
    }
}

