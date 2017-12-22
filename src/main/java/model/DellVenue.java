package model;

public class DellVenue extends PhoneDetail {
    public static final DellVenue me = new DellVenue();

    public static DellVenue newInstance(){
        return new DellVenue();
    }

    private DellVenue() {
        super(
                "Gorilla Glass display, Dedicated Camera Key, Ring Silence Switch, Swype keyboard.",
                new PhoneDetail.Android(
                        "Android 2.2",
                        "Dell Stage"
                ),
                new String[] {
                        "AT&T,",
                        "KT,",
                        "T-Mobile"
                },
                new PhoneDetail.Battery(
                        "400 hours",
                        "7 hours",
                        "Lithium Ion (Li-Ion) (1400 mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {
                                "Flash",
                                "Video"
                        },
                        "8.0 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 2.1",
                        "850/1900/2100 3G; 850/900/1800/1900 GSM/GPRS/EDGE\n900/1700/2100 3G; 850/900/1800/1900 GSM/GPRS/EDGE",
                        true,
                        false,
                        "802.11 b/g/n"
                ),
                "The Venue is the perfect one-touch, Smart Phone providing instant access to everything you love. All of Venue's features make it perfect for on-the-go students, mobile professionals, and active social communicators who love style and performance.\n\nElegantly designed, the Venue offers a vibrant, curved glass display that\u2019s perfect for viewing all types of content. The Venue\u2019s slender form factor feels great in your hand and also slips easily into your pocket.  A mobile entertainment powerhouse that lets you download the latest tunes from Amazon MP3 or books from Kindle, watch video, or stream your favorite radio stations.  All on the go, anytime, anywhere.",
                new PhoneDetail.Display(
                        "WVGA (800 x 480))",
                        "4.1 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "1 Ghz processor",
                        false,
                        false,
                        "USB 2.0"
                ),
                "dell-venue",
                new String[] {
                        "img/phones/dell-venue.0.jpg",
                        "img/phones/dell-venue.1.jpg",
                        "img/phones/dell-venue.2.jpg",
                        "img/phones/dell-venue.3.jpg",
                        "img/phones/dell-venue.4.jpg",
                        "img/phones/dell-venue.5.jpg"
                },
                "Dell Venue",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "64.0 mm (w)",
                                "121.0 mm (h)",
                                "12.9 mm (d)"
                        },
                        "164.0 gram"
                ),
                new PhoneDetail.Storage(
                        "1000MB",
                        "512MB"
                )

        );
    }
}


