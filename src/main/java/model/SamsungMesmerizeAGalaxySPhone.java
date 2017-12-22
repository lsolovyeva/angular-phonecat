package model;

public class SamsungMesmerizeAGalaxySPhone extends PhoneDetail {
    //public static final SamsungMesmerizeAGalaxySPhone me = new SamsungMesmerizeAGalaxySPhone();
    public static SamsungMesmerizeAGalaxySPhone newInstance(){
        return new SamsungMesmerizeAGalaxySPhone();
    }

    private SamsungMesmerizeAGalaxySPhone() {
        super(
                "Swype",
                new PhoneDetail.Android(
                        "Android 2.1",
                        "TouchWiz"
                ),
                new String[] {
                        "US Cellular"
                },
                new PhoneDetail.Battery(
                        "1000 hours",
                        "7 hours",
                        "Lithium Ion (Li-Ion) (1500 mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {
                                "Flash",
                                "Video"
                        },
                        "5.0 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 3.0",
                         "3G :800MHz/1900MHz\nCDMA :800MHz/1900MHz",
                        true,
                        false,
                        "802.11 b/g/n"
                ),
                 "Experience entertainment in a whole new light. The stylish and slim Samsung Mesmerize\u2122, with its vivid 4-inch Super AMOLED\u2122 display, makes everything from Hollywood blockbusters to music videos to Amazon\u2019s bestsellers look absolutely brilliant \u2013 even outside in the sun. Android\u2122 Market rockets you into a universe filled with equally brilliant apps; download them at blistering speeds thanks to the powerful 1GHz Hummingbird processor. Keep your social life organized and continuously updated with the pre-loaded social networking apps, while uploading all the 5.0MP pics you\u2019ve snapped and 720p HD videos you\u2019ve recorded.",
                new PhoneDetail.Display(
                        "WVGA (800 x 480)",
                        "4.0 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "",
                        "1GHzr",
                        false,
                        false,
                        "USB 2.0"
                ),
                "samsung-mesmerize-a-galaxy-s-phone",
                new String[] {
                        "img/phones/samsung-mesmerize-a-galaxy-s-phone.0.jpg",
                        "img/phones/samsung-mesmerize-a-galaxy-s-phone.1.jpg",
                        "img/phones/samsung-mesmerize-a-galaxy-s-phone.2.jpg",
                        "img/phones/samsung-mesmerize-a-galaxy-s-phone.3.jpg"
                },
                "Samsung Mesmerize\u2122 a Galaxy S\u2122 phone",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "64.2 mm (w)",
                                "125.0 mm (h)",
                                "9.97 mm (d)"
                        },
                        "118.0 grams"
                ),
                new PhoneDetail.Storage(
                        "2048MB",
                        "512MB"
                )

        );
    }
}

