package model;

import java.util.List;

public class Camera {
    private List<String> features;
    private String primary;

    public Camera(List<String> features, String primary) {
        this.features = features;
        this.primary = primary;
    }

    public List<String> getFeatures() {
        return features;
    }

    public String getPrimary() {
        return primary;
    }

    public static class CameraBuilder
    {
        private List<String> features;
        private String primary;

        //fabric static method:
        public static CameraBuilder newInstance() {
            return new CameraBuilder();
        }
        private CameraBuilder() {}

        //public CameraBuilder() {}
        public CameraBuilder features(List<String> features) {
            this.features = features;
            return this;
        }
        public CameraBuilder primary(String primary) {
            this.primary = primary;
            return this;
        }

        public Camera build() {
            return new Camera(this.features, this.primary);
        }
    }
}