package model;

import java.util.List;
import java.util.Objects;

public class Camera {
    private List<String> features;
    private String primary;

    public Camera() {}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camera camera = (Camera) o;
        return Objects.equals(features, camera.features) &&
                Objects.equals(primary, camera.primary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(features, primary);
    }

    public static class CameraBuilder
    {
        private List<String> features;
        private String primary;

        public static CameraBuilder builder() {
            return new CameraBuilder();
        }
        private CameraBuilder() {}

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