package model;

import java.util.List;
import java.util.Objects;

public class PhoneDetail {
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

    public static PhoneDetailBuilder builder() {
        return new PhoneDetailBuilder();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneDetail that = (PhoneDetail) o;
        return Objects.equals(additionalFeatures, that.additionalFeatures) &&
                Objects.equals(android, that.android) &&
                Objects.equals(availability, that.availability) &&
                Objects.equals(battery, that.battery) &&
                Objects.equals(camera, that.camera) &&
                Objects.equals(connectivity, that.connectivity) &&
                Objects.equals(description, that.description) &&
                Objects.equals(display, that.display) &&
                Objects.equals(hardware, that.hardware) &&
                Objects.equals(id, that.id) &&
                Objects.equals(images, that.images) &&
                Objects.equals(name, that.name) &&
                Objects.equals(sizeAndWeight, that.sizeAndWeight) &&
                Objects.equals(storage, that.storage);
    }

    @Override
    public int hashCode() {

        return Objects.hash(additionalFeatures, android, availability, battery, camera, connectivity, description, display, hardware, id, images, name, sizeAndWeight, storage);
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


        private PhoneDetailBuilder() {}

        public PhoneDetailBuilder additionalFeatures(String additionalFeatures) {
            this.additionalFeatures = additionalFeatures;
            return this;
        }

        public PhoneDetailBuilder android(Android android) {
            this.android = android;
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
        public PhoneDetailBuilder battery(Battery battery) {
            this.battery = battery;
            return this;
        }
        public PhoneDetailBuilder camera(Camera camera) {
            this.camera = camera;
            return this;
        }
        public PhoneDetailBuilder connectivity(Connectivity connectivity) {
            this.connectivity = connectivity;
            return this;
        }
        public PhoneDetailBuilder display(Display display) {
            this.display = display;
            return this;
        }
        public PhoneDetailBuilder hardware(Hardware hardware) {
            this.hardware = hardware;
            return this;
        }
        public PhoneDetailBuilder sizeAndWeight(SizeAndWeight sizeAndWeight) {
            this.sizeAndWeight = sizeAndWeight;
            return this;
        }
        public PhoneDetailBuilder storage(Storage storage) {
            this.storage = storage;
            return this;
        }
        public PhoneDetail build() {
            return new PhoneDetail(this.additionalFeatures,
            this.android,
            this.availability,
            this.battery,
            this.camera,
            this.connectivity,
            this.description,
            this.display,
            this.hardware,
            this.id,
            this.images,
            this.name,
            this.sizeAndWeight,
            this.storage);
        }
    }
}