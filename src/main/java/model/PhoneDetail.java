package model;

import java.util.List;

public class PhoneDetail {

    public static class Android {
        private String os;
        private String ui;

        public Android(String os, String ui) {
            this.os = os;
            this.ui = ui;
        }

        public Android() {
        }

        public String getOs() {
            return os;
        }

        public String getUi() {
            return ui;
        }
        public void setOs(String os) {
            this.os = os;
        }

        public void setUi(String ui) {
            this.ui = ui;
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

        public Battery() {
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

        public void setStandbyTime(String standbyTime) {
            this.standbyTime = standbyTime;
        }

        public void setTalkTime(String talkTime) {
            this.talkTime = talkTime;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Camera {
        private List<String> features;
        private String primary;
        public Camera(List<String> features, String primary) {
            this.features = features;
            this.primary = primary;
        }

        public Camera() {
        }

        public List<String> getFeatures() {
            return features;
        }

        public String getPrimary() {
            return primary;
        }

        public void setFeatures(List<String> features) {
            this.features = features;
        }

        public void setPrimary(String primary) {
            this.primary = primary;
        }
    }
    public static class Connectivity {
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

        public Connectivity() {
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

        public void setBluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
        }

        public void setCell(String cell) {
            this.cell = cell;
        }

        public void setGps(Boolean gps) {
            this.gps = gps;
        }public void setInfrared(Boolean infrared) {
            this.infrared = infrared;
        }

        public void setWifi(String wifi) {
            this.wifi = wifi;
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
        public Display() {
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

        public void setScreenResolution(String screenResolution) {
            this.screenResolution = screenResolution;
        }

        public void setScreenSize(String screenSize) {
            this.screenSize = screenSize;
        }
        public void setTouchScreen(Boolean touchScreen) {
            this.touchScreen = touchScreen;
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

        public Hardware() {
        }public Boolean isAccelerometer() {
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
        public void setAccelerometer(Boolean accelerometer) {
            this.accelerometer = accelerometer;
        }

        public void setAudioJack(String audioJack) {
            this.audioJack = audioJack;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public void setFmRadio(Boolean fmRadio) {
            this.fmRadio = fmRadio;
        }

        public void setPhysicalKeyboard(Boolean physicalKeyboard) {
            this.physicalKeyboard = physicalKeyboard;
        }

        public void setUsb(String usb) {
            this.usb = usb;
        }
    }
    public static class SizeAndWeight {
        private List<String> dimensions;
        private String weight;

        public SizeAndWeight(List<String> dimensions, String weight) {
            this.dimensions = dimensions;
            this.weight = weight;
        }

        public SizeAndWeight() {
        }

        public List<String> getDimensions() {
            return dimensions;
        }

        public String getWeight() {
            return weight;
        } public void setDimensions(List<String> dimensions) {
            this.dimensions = dimensions;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }
    }

    public static class Storage {
        String flash;
        String ram;

        public Storage(String flash, String ram) {
            this.flash = flash;
            this.ram = ram;
        }

        public Storage() {
        }
        public String getFlash() {
            return flash;
        }

        public String getRam() {
            return ram;
        }

        public void setFlash(String flash) {
            this.flash = flash;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }
    }

    private String additionalFeatures;
    private Android android;
    private List<String> availability;
    private Battery battery;
    private Camera camera;
    private Connectivity connectivity;
    private String description;
    private Display display;
    private Hardware hardware;
    public String id;
    private List<String> images;
    private String name;
    private SizeAndWeight sizeAndWeight;
    private Storage storage;

    private PhoneDetail(PhoneDetailBuilder builder) {

        this.additionalFeatures = builder.additionalFeatures;
        this.android = builder.android;
        this.availability = builder.availability;
        this.battery = builder.battery;
        this.camera = builder.camera;
        this.connectivity = builder.connectivity;
        this.description = builder.description;
        this.display = builder.display;
        this.hardware = builder.hardware;
        this.id = builder.id;
        this.images = builder.images;
        this.name = builder.name;
        this.sizeAndWeight = builder.sizeAndWeight;
        this.storage = builder.storage;
    }

    public PhoneDetail(String additionalFeatures,
                       Android android,
                       List<String> availability,
                       Battery battery,
                       Camera camera,
                       Connectivity connectivity,
                       String description,
                       Display display,
                       Hardware hardware,
                       String id,
                       List<String> images,
                       String name,
                       SizeAndWeight sizeAndWeight,
                       Storage storage
    ) {this.additionalFeatures = additionalFeatures;
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

    public PhoneDetail() {
    }

    public String getAdditionalFeatures() {
        return additionalFeatures;
    }
    public Android getAndroid() {
        return android;
    }

    public List<String> getAvailability() {
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

    public List<String> getImages() {
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

    public void setImages(List<String> images) {
        this.images = images;
    }

    public void setAvailability(List<String> availability) {
        this.availability = availability;
    }



    public static class PhoneDetailBuilder
    {
        private String additionalFeatures;
        private Android android;
        private List<String> availability;
        private Battery battery;
        private Camera camera;
        private Connectivity connectivity;
        private String description;
        private Display display;
        private Hardware hardware;
        public String id;
        private List<String> images;
        private String name;
        private SizeAndWeight sizeAndWeight;
        private Storage storage;

        public PhoneDetailBuilder(String additionalFeatures) {
            this.additionalFeatures = additionalFeatures;
        }

        public PhoneDetailBuilder android(String ui, String os) {
            this.android = new Android(ui, os);
            return this;
        }
        public PhoneDetailBuilder description(String description) {
            this.description = description;
            return this;
        }
        public PhoneDetailBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PhoneDetailBuilder availability(List<String> availability) {
            this.availability = availability;
            return this;
        }
        public PhoneDetailBuilder images(List<String> images) {
            this.images = images;
            return this;
        }
        public PhoneDetailBuilder battery(String standbyTime,String talkTime, String type) {
            this.battery = new Battery(standbyTime, talkTime, type);
            return this;
        }
        public PhoneDetailBuilder camera(List<String> features, String primary) {
            this.camera = new Camera(features, primary);
            return this;
        }
        public PhoneDetailBuilder connectivity(String bluetooth, String cell, Boolean gps, Boolean infrared, String wifi) {
            this.connectivity = new Connectivity(bluetooth, cell, gps, infrared, wifi);
            return this;
        }
        public PhoneDetailBuilder display(String screenResolution, String screenSize, Boolean touchScreen) {
            this.display = new Display(screenResolution, screenSize, touchScreen);
            return this;
        }
        public PhoneDetailBuilder hardware(Boolean accelerometer, String audioJack, String cpu, Boolean fmRadio, Boolean physicalKeyboard, String usb) {
            this.hardware = new Hardware(accelerometer, audioJack, cpu, fmRadio, physicalKeyboard, usb);
            return this;
        }
        public PhoneDetailBuilder sizeAndWeight(List<String> dimensions, String weight) {
            this.sizeAndWeight = new SizeAndWeight(dimensions, weight);
            return this;
        }
        public PhoneDetailBuilder storage(String flash, String ram) {
            this.storage = new Storage(flash, ram);
            return this;
        }
        //Return the finally constructed PhoneDetail object
        public PhoneDetail build() {
            PhoneDetail phoneDetail =  new PhoneDetail(this);
            return phoneDetail;
        }
    }



}