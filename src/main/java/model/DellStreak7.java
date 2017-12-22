package model;

public class DellStreak7 extends PhoneDetail{
    public static final DellStreak7 me = new DellStreak7();

    private DellStreak7() {
        super(
                "Front Facing 1.3MP Camera",
                new PhoneDetail.Android(
                        "Android 2.2",
                        "Dell Stage"
                ),
                new String[] {
                        "T-Mobile"
                },
                new PhoneDetail.Battery(
                        "",
                        "",
                        "Lithium Ion (Li-Ion) (2780 mAH)"
                ),
                new PhoneDetail.Camera(
                        new String[] {"Flash", "Video"},
                        "5.0 megapixels"
                ),
                new PhoneDetail.Connectivity(
                        "Bluetooth 2.1",
                        "T-mobile HSPA+ @ 2100/1900/AWS/850 MHz",
                        true,
                        false,
                        "802.11 b/g"
                ),
                "Introducing Dell\u2122 Streak 7. Share photos, videos and movies together. It\u2019s small enough to carry around, big enough to gather around. Android\u2122 2.2-based tablet with over-the-air upgrade capability for future OS releases.  A vibrant 7-inch, multitouch display with full Adobe\u00ae Flash 10.1 pre-installed.  Includes a 1.3 MP front-facing camera for face-to-face chats on popular services such as Qik or Skype.  16 GB of internal storage, plus Wi-Fi, Bluetooth and built-in GPS keeps you in touch with the world around you.  Connect on your terms. Save with 2-year contract or flexibility with prepaid pay-as-you-go plans",
                new PhoneDetail.Display(
                        "WVGA (800 x 480)",
                        "7.0 inches",
                        true
                ),
                new PhoneDetail.Hardware(
                        true,
                        "3.5mm",
                        "nVidia Tegra T20",
                        false,
                        false,
                        "USB 2.0"
                ),
                "dell-streak-7",
                new String[] {
                        "img/phones/dell-streak-7.0.jpg",
                        "img/phones/dell-streak-7.1.jpg",
                        "img/phones/dell-streak-7.2.jpg",
                        "img/phones/dell-streak-7.3.jpg",
                        "img/phones/dell-streak-7.4.jpg"
                },
                "Dell Streak 7",
                new PhoneDetail.SizeAndWeight(
                        new String[] {"199.9 mm (w)",
                                "119.8 mm (h)",
                                "12.4 mm (d)"},
                        "450.0 grams"
                ),
                new PhoneDetail.Storage(
                        "16000MB",
                        "512MB"
                )
        );
    }
}
