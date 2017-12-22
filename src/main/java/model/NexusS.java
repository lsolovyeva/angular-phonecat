package model;

public class NexusS extends PhoneDetail {
    //public static final NexusS me = new NexusS();
    public static NexusS newInstance(){
        return new NexusS();
    }

    private NexusS() {
        super(
                "Contour Display, Near Field Communications (NFC), Three-axis gyroscope, Anti-fingerprint display coating, Internet Calling support (VoIP/SIP)",
                new PhoneDetail.Android(
                        "Android 2.3",
                        "Android"
                ),
                new String[] {
                        "M1,",
                        "O2,",
                        "Orange,",
                        "Singtel,",
                        "StarHub,",
                        "T-Mobile,",
                        "Vodafone"
                },
                new PhoneDetail.Battery(
                        "428 hours",
                        "6 hours",
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
                        "Bluetooth 2.1",
                        "Quad-band GSM: 850, 900, 1800, 1900\r\nTri-band HSPA: 900, 2100, 1700\r\nHSPA type: HSDPA (7.2Mbps) HSUPA (5.76Mbps)",
                true,
                false,
                "802.11 b/g/n"
                ),
                "Nexus S is the next generation of Nexus devices, co-developed by Google and Samsung. The latest Android platform (Gingerbread), paired with a 1 GHz Hummingbird processor and 16GB of memory, makes Nexus S one of the fastest phones on the market. It comes pre-installed with the best of Google apps and enabled with new and popular features like true multi-tasking, Wi-Fi hotspot, Internet Calling, NFC support, and full web browsing. With this device, users will also be the first to receive software upgrades and new Google mobile apps as soon as they become available. For more details, visit http://www.google.com/nexus.",
                new PhoneDetail.Display(
                        "WVGA (800 x 480)",
                        "4.0 inches",
                 true
                ),
                new PhoneDetail.Hardware(
                        true,
                         "3.5mm",
                "1GHz Cortex A8 (Hummingbird) processor",
                false,
                 false,
                "USB 2.0"
                ),
                "nexus-s",
                new String[] {
                        "img/phones/nexus-s.0.jpg",
                        "img/phones/nexus-s.1.jpg",
                        "img/phones/nexus-s.2.jpg",
                        "img/phones/nexus-s.3.jpg"
                },
                "Nexus S",
                new PhoneDetail.SizeAndWeight(
                        new String[] {
                                "63.0 mm (w)",
                                "123.9 mm (h)",
                                "10.88 mm (d)"
                        },
                        "129.0 grams"
                ),
                new PhoneDetail.Storage(
                        "16384MB",
                        "512MB"
                )

        );
    }
}

