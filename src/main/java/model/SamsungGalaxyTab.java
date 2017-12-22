package model;

public class SamsungGalaxyTab extends PhoneDetail {
    public static final SamsungGalaxyTab me = new SamsungGalaxyTab();

    private SamsungGalaxyTab() {
        super(
                "Adobe\u00ae Flash\u00ae Player compatible; 1.3MP front-facing camera for video chat; eReader pre-loaded; Swype text input technology\r\n",
                new PhoneDetail.Android(
                        "Android 2.2",
                        "TouchWiz"
                ),
                new String[] {
                        "AT&T,",
                        "Sprint,",
                        "T-Mobile,",
                        "Verizon"
                },
                new PhoneDetail.Battery(
                        "780 hours",
                        "",
                        "Lithium Ion (Li-Ion) (4000 mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {
                                "Flash",
                                "Video"
                        },
                        "3.0 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 3.0",
                        "AT&T: GSM/EDGE : 850/900/1800/1900; 3G : 850/1900/2100\r\n\r\nSprint: CDMA : 850/1900MHz\r\n\r\nT-Mobile: GSM/EDGE : 850/900/1800/1900; 3G : 1700/1900\r\n\r\nVerizon: CDMA : 800MHz/1900MHz",
                        true,
                        false,
                        "802.11 b/g/n"
                ),
                "Feel Free to Tab\u2122. The Samsung Galaxy Tab\u2122, the tablet device that delivers enhanced capabilities with advanced mobility, has a large, perfectly sized, 7.0\" screen that offers plenty of room for the thousands of interactive games and apps available for the Android\u2122 platform, and its slim design makes it perfect for travel and one-handed grip. Use the Galaxy Tab to relax and enjoy an e-book, watch rich video or full web content with its Adobe\u00ae Flash\u00ae Player compatibility, video chat using the front-facing camera, or send user-generated content wirelessly to other devices like your TV via AllShare\u2122.  With so many options for customization and interactivity, the Galaxy Tab gives you everything you want, anywhere you go\u2026Feel Free to Tab\u2122.",
                new PhoneDetail.Display(
                        "WSVGA (1024 x 600)",
                        "7.0 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "1GHz",
                        false,
                        false,
                        "USB 2.0"
                ),
                "samsung-galaxy-tab",
                new String[] {
                        "img/phones/samsung-galaxy-tab.0.jpg",
                        "img/phones/samsung-galaxy-tab.1.jpg",
                        "img/phones/samsung-galaxy-tab.2.jpg",
                        "img/phones/samsung-galaxy-tab.3.jpg",
                        "img/phones/samsung-galaxy-tab.4.jpg",
                        "img/phones/samsung-galaxy-tab.5.jpg",
                        "img/phones/samsung-galaxy-tab.6.jpg"
                },
                "Samsung Galaxy Tab\u2122",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "120.39 mm (w)",
                                "189.99 mm (h)",
                                "11.9 mm (d)"
                        },
                        "379.88 grams"
                ),
                new PhoneDetail.Storage(
                        "16384MB",
                        "640MB"
                )

        );
    }
}

