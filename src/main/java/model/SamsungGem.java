package model;

public class SamsungGem extends PhoneDetail {
    //public static final SamsungGem me = new SamsungGem();
    public static SamsungGem newInstance(){
        return new SamsungGem();
    }

    private SamsungGem() {
        super(
                 "3.2\u201d Full touch screen with Advanced anti smudge, anti reflective and anti scratch glass; Swype text input for easy and fast message creation; multiple messaging options, including text with threaded messaging for organized, easy-to-follow text; Social Community support, including Facebook and MySpace; Next generation Address book; Visual Voice Mail\n",
                new PhoneDetail.Android(
                        "Android 2.1",
                        "TouchWiz"
                ),
                new String[] {
                        "Cellular South"
                },
                new PhoneDetail.Battery(
                        "800 hours",
                        "7 hours",
                        "Nickel Cadmium (NiCd) (1500 mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {
                                ""
                        },
                        "3.0 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 3.0",
                         "3G/CDMA : 850MHz/1900MHz\n",
                        true,
                        false,
                        "802.11 b/g"
                ),
                "The Samsung Gem\u2122 maps a route to a smarter mobile experience. By pairing one of the fastest processors in the category with the Android\u2122 platform, the Gem delivers maximum multitasking speed and social networking capabilities to let you explore new territory online. A smart phone at an even smarter price is a real find, so uncover the Gem and discover what\u2019s next.",
                new PhoneDetail.Display(
                        "WQVGA (400 x 240)",
                        ".2 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "800 MHz",
                        false,
                        false,
                        "USB 2.0"
                ),
                "samsung-gem",
                new String[] {
                        "img/phones/samsung-gem.0.jpg",
                        "img/phones/samsung-gem.1.jpg",
                        "img/phones/samsung-gem.2.jpg"
                },
                "Samsung Gem\u2122",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "55.5 mm (w)",
                                "113.0 mm (h)",
                                "12.4 mm (d)"
                        },
                        "110.0 grams"
                ),
                new PhoneDetail.Storage(
                        "220MB",
                        "256MB"
                )

        );
    }
}

