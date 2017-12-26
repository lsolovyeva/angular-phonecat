package model;


public class PhoneDetail {

    public static class Android {
        private String os;
        private String ui;
        public Android(String os, String ui) {
            this.os = os;
            this.ui = ui;
        }
        public String getOs() {
            return os;
        }
        public String getUi() {
            return ui;
        }
    }

    public static class Battery {
        private String standbyTime;
        private String talkTime;
        private String type;
        public Battery(String standbyTime, String talkTime, String type) {
            this.standbyTime = standbyTime;
            this.talkTime = talkTime;
            this.type = type;
        }
        public String getStandbyTime() {
            return standbyTime;
        }
        public String getTalkTime() {
            return talkTime;
        }
        public String getType() {
            return type;
        }
    }

    public static class Camera {
        private String[] features;
        private String primary;
        public Camera(String[] features, String primary) {
            this.features = features;
            this.primary = primary;
        }
        public String[] getFeatures() {
            return features;
        }
        public String getPrimary() {
            return primary;
        }
    }

    public static class Connectivity{
        private String bluetooth;
        private String cell;
        private Boolean gps;
        private Boolean infrared;
        private String wifi;

        public Connectivity(String bluetooth, String cell, Boolean gps, Boolean infrared, String wifi) {
            this.bluetooth = bluetooth;
            this.cell = cell;
            this.gps = gps;
            this.infrared = infrared;
            this.wifi = wifi;
        }
        public String getBluetooth() {
            return bluetooth;
        }
        public String getCell() {
            return cell;
        }
        public Boolean isGps() {
            return gps;
        }
        public Boolean isInfrared() {
            return infrared;
        }
        public String getWifi() {
            return wifi;
        }
    }

    public static class Display {
        private String screenResolution;
        private String screenSize;
        private Boolean touchScreen;
        public Display(String screenResolution, String screenSize, Boolean touchScreen) {
            this.screenResolution = screenResolution;
            this.screenSize = screenSize;
            this.touchScreen = touchScreen;
        }
        public String getScreenResolution() {
            return screenResolution;
        }
        public String getScreenSize() {
            return screenSize;
        }
        public Boolean isTouchScreen() {
            return touchScreen;
        }
    }

    public static class Hardware {
        private Boolean accelerometer;
        private String audioJack;
        private String cpu;
        private Boolean fmRadio;
        private Boolean physicalKeyboard;
        private String usb;
        public Hardware(Boolean accelerometer, String audioJack, String cpu, Boolean fmRadio, Boolean physicalKeyboard, String usb) {
            this.accelerometer = accelerometer;
            this.audioJack = audioJack;
            this.cpu = cpu;
            this.fmRadio = fmRadio;
            this.physicalKeyboard = physicalKeyboard;
            this.usb = usb;
        }
        public Boolean isAccelerometer() {
            return accelerometer;
        }
        public String getAudioJack() {
            return audioJack;
        }
        public String getCpu() {
            return cpu;
        }
        public Boolean isFmRadio() {
            return fmRadio;
        }
        public Boolean isPhysicalKeyboard() {
            return physicalKeyboard;
        }
        public String getUsb() {
            return usb;
        }
    }

    public static class SizeAndWeight {
        private String[] dimensions;
        private String weight;
        public SizeAndWeight(String[] dimensions, String weight) {
            this.dimensions = dimensions;
            this.weight = weight;
        }
        public String[] getDimensions() {
            return dimensions;
        }
        public String getWeight() {
            return weight;
        }
    }

    public static class Storage {
        String flash;
        String ram;
        public Storage(String flash, String ram) {
            this.flash = flash;
            this.ram = ram;
        }
        public String getFlash() {
            return flash;
        }
        public String getRam() {
            return ram;
        }
    }

    private String additionalFeatures;
    private Android android;
    private String[] availability;
    private Battery battery;
    private Camera camera;
    private Connectivity connectivity;
    private String description;
    private Display display;
    private Hardware hardware;
    private String id;
    private String[] images;
    private String name;
    private SizeAndWeight sizeAndWeight;
    private Storage storage;


    public PhoneDetail(String additionalFeatures,
                       Android android,
                       String[] availability,
                       Battery battery,
                       Camera camera,
                       Connectivity connectivity,
                       String description,
                       Display display,
                       Hardware hardware,
                       String id,
                       String[] images,
                       String name,
                       SizeAndWeight sizeAndWeight,
                       Storage storage
    ) {
        this.additionalFeatures = additionalFeatures;
        this.android = android;
        this.availability = availability;
        this.battery = battery;
        this.camera = camera;
        this.connectivity = connectivity;
        this.description = description;
        this.display = display;
        this.hardware = hardware;
        this.id = id;
        this.images = images;
        this.name = name;
        this.sizeAndWeight = sizeAndWeight;
        this.storage = storage;
    }

    public String getAdditionalFeatures() {
        return additionalFeatures;
    }
    public Android getAndroid() {
        return android;
    }
    public String[] getAvailability() {
        return availability;
    }
    public Battery getBattery() {
        return battery;
    }
    public Camera getCamera() {
        return camera;
    }
    public Connectivity getConnectivity() {
        return connectivity;
    }
    public String getDescription() {
        return description;
    }
    public Display getDisplay() {
        return display;
    }
    public Hardware getHardware() {
        return hardware;
    }
    public String getId() {
        return id;
    }
    public String[] getImages() {
        return images;
    }
    public String getName() {
        return name;
    }
    public SizeAndWeight getSizeAndWeight() {
        return sizeAndWeight;
    }
    public Storage getStorage() {
        return storage;
    }
}
