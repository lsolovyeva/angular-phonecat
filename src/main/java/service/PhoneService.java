package service;

import model.*;
import org.springframework.stereotype.Service;


@Service
public interface PhoneService {

    Phones[] getAllPhonesInfo();

    PhoneDetail getPhoneById(String id);

    Phones[] allInfo = new Phones[]{
            new Phones(
                    0,
                    "motorola-xoom-with-wi-fi",
                    "img/phones/motorola-xoom-with-wi-fi.0.jpg",
                    "Motorola XOOM\u2122 with Wi-Fi",
                    "The Next, Next Generation\r\n\r\nExperience the future with Motorola XOOM with Wi-Fi, the world's first tablet powered by Android 3.0 (Honeycomb)."
            ),
            new Phones(
                    6,
                    "Best Buy",
                    "nexus-s",
                    "img/phones/nexus-s.0.jpg",
                    "Nexus S",
                    "Fast just got faster with Nexus S. A pure Google experience, Nexus S is the first phone to run Gingerbread (Android 2.3), the fastest version of Android yet."
            ),
            new Phones(
                    1,
                    "motorola-xoom",
                    "img/phones/motorola-xoom.0.jpg",
                    "MOTOROLA XOOM\u2122",
                    "The Next, Next Generation\n\nExperience the future with MOTOROLA XOOM, the world's first tablet powered by Android 3.0 (Honeycomb)."
            ),
            new Phones(
                    2,
                    "AT&T",
                    "motorola-atrix-4g",
                    "img/phones/motorola-atrix-4g.0.jpg",
                    "MOTOROLA ATRIX\u2122 4G",
                    "MOTOROLA ATRIX 4G the world's most powerful smartphone."
            ),
            new Phones(
                    3,
                    "dell-streak-7",
                    "img/phones/dell-streak-7.0.jpg",
                    "Dell Streak 7",
                    "Introducing Dell\u2122 Streak 7. Share photos, videos and movies together. It\u2019s small enough to carry around, big enough to gather around."
         ),
            new Phones(
                    4,
                    "Cellular South",
                    "samsung-gem",
                    "img/phones/samsung-gem.0.jpg",
                    "Samsung Gem\u2122",
                    "The Samsung Gem\u2122 brings you everything that you would expect and more from a touch display smart phone \u2013 more apps, more features and a more affordable price."
            ),
            new Phones(
                    5,
                    "Dell",
                    "dell-venue",
                    "img/phones/dell-venue.0.jpg",
                    "Dell Venue",
                    "The Dell Venue; Your Personal Express Lane to Everything"
            ),
            new Phones(
                    7,
                    "Cellular South",
                    "lg-axis",
                    "img/phones/lg-axis.0.jpg",
                    "LG Axis",
                    "Android Powered, Google Maps Navigation, 5 Customizable Home Screens"
            ),
            new Phones(
                    8,
                    "samsung-galaxy-tab",
                    "img/phones/samsung-galaxy-tab.0.jpg",
                    "Samsung Galaxy Tab\u2122",
                    "Feel Free to Tab\u2122. The Samsung Galaxy Tab\u2122 brings you an ultra-mobile entertainment experience through its 7\u201d display, high-power processor and Adobe\u00ae Flash\u00ae Player compatibility."
            ),
            new Phones(
                    9,
            "Cellular South",
            "samsung-showcase-a-galaxy-s-phone",
            "img/phones/samsung-showcase-a-galaxy-s-phone.0.jpg",
            "Samsung Showcase\u2122 a Galaxy S\u2122 phone",
            "The Samsung Showcase\u2122 delivers a cinema quality experience like you\u2019ve never seen before. Its innovative 4\u201d touch display technology provides rich picture brilliance, even outdoors"
            ),
            new Phones(
                    10,
                    "Verizon",
            "droid-2-global-by-motorola",
           "img/phones/droid-2-global-by-motorola.0.jpg",
            "DROID\u2122 2 Global by Motorola",
            "The first smartphone with a 1.2 GHz processor and global capabilities."
            ),
            new Phones(
                    11,
                    "Verizon",
            "droid-pro-by-motorola",
            "img/phones/droid-pro-by-motorola.0.jpg",
            "DROID\u2122 Pro by Motorola",
            "The next generation of DOES."
            ),
            new Phones(
                    12,
                    "AT&T",
           "motorola-bravo-with-motoblur",
            "img/phones/motorola-bravo-with-motoblur.0.jpg",
            "MOTOROLA BRAVO\u2122 with MOTOBLUR\u2122",
            "An experience to cheer about."
            ),
            new Phones(
                    13,
                    "T-Mobile",
            "motorola-defy-with-motoblur",
            "img/phones/motorola-defy-with-motoblur.0.jpg",
            "Motorola DEFY\u2122 with MOTOBLUR\u2122",
            "Are you ready for everything life throws your way?"
            ),
            new Phones(
                    14,
                    "T-Mobile",
            "t-mobile-mytouch-4g",
            "img/phones/t-mobile-mytouch-4g.0.jpg",
            "T-Mobile myTouch 4G",
            "The T-Mobile myTouch 4G is a premium smartphone designed to deliver blazing fast 4G speeds so that you can video chat from practically anywhere, with or without Wi-Fi."
            ),
            new Phones(
                    15,
                    "US Cellular",
            "samsung-mesmerize-a-galaxy-s-phone",
            "img/phones/samsung-mesmerize-a-galaxy-s-phone.0.jpg",
            "Samsung Mesmerize\u2122 a Galaxy S\u2122 phone",
            "The Samsung Mesmerize\u2122 delivers a cinema quality experience like you\u2019ve never seen before. Its innovative 4\u201d touch display technology provides rich picture brilliance,even outdoors"
            ),
            new Phones(
                    16,
                    "Sprint",
            "sanyo-zio",
            "img/phones/sanyo-zio.0.jpg",
            "SANYO ZIO",
            "The Sanyo Zio by Kyocera is an Android smartphone with a combination of ultra-sleek styling, strong performance and unprecedented value."
            ),
            new Phones(
                    17,
                    "samsung-transform",
            "img/phones/samsung-transform.0.jpg",
            "Samsung Transform\u2122",
            "The Samsung Transform\u2122 brings you a fun way to customize your Android powered touch screen phone to just the way you like it through your favorite themed \u201cSprint ID Service Pack\u201d."
            ),
            new Phones(
                    18,
                    "t-mobile-g2",
            "img/phones/t-mobile-g2.0.jpg",
            "T-Mobile G2",
            "The T-Mobile G2 with Google is the first smartphone built for 4G speeds on T-Mobile's new network. Get the information you need, faster than you ever thought possible."
            ),
            new Phones(
                    19,
                    "motorola-charm-with-motoblur",
            "img/phones/motorola-charm-with-motoblur.0.jpg",
           "Motorola CHARM\u2122 with MOTOBLUR\u2122",
            "Motorola CHARM fits easily in your pocket or palm.  Includes MOTOBLUR service."
            )
    };


    PhoneDetail all[] = new PhoneDetail[] {
            MotorolaXoomWithWiFi.newInstance(),
            NexusS.newInstance(),
            DellStreak7.newInstance(),
            DellVenue.newInstance(),
            Droid2GlobalByMotorola.newInstance(),
            DroidProByMotorola.newInstance(),
            LgAxis.newInstance(),
            MotorolaAtrix4g.newInstance(),
            MotorolaBravoWithMotoblur.newInstance(),
            MotorolaCharmWithMotoblur.newInstance(),
            MotorolaDefyWithMotoblur.newInstance(),
            MotorolaXoom.newInstance(),
            SamsungGalaxyTab.newInstance(),
            SamsungGem.newInstance(),
            SamsungMesmerizeAGalaxySPhone.newInstance(),
            SamsungShowcaseAGalaxySPhone.newInstance(),
            SamsungTransform.newInstance(),
            SanyoZio.newInstance(),
            TMobileG2.newInstance(),
            TMobileMytouch4g.newInstance()

    };
}