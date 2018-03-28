package model;

import java.util.List;
import java.util.Objects;

public class SizeAndWeight {
    private List<String> dimensions;
    private String weight;

    public SizeAndWeight(List<String> dimensions, String weight) {
        this.dimensions = dimensions;
        this.weight = weight;
    }

    public SizeAndWeight() {}

    public List<String> getDimensions() {
        return dimensions;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SizeAndWeight that = (SizeAndWeight) o;
        return Objects.equals(dimensions, that.dimensions) &&
                Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dimensions, weight);
    }

    public static class SizeAndWeightBuilder
    {
        private List<String> dimensions;
        private String weight;

        public static SizeAndWeightBuilder builder() {
            return new SizeAndWeightBuilder();
        }
        private SizeAndWeightBuilder() {}

        public SizeAndWeightBuilder dimensions(List<String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public SizeAndWeightBuilder weight(String weight) {
            this.weight = weight;
            return this;
        }

        public SizeAndWeight build() {
            return new SizeAndWeight(this.dimensions, this.weight);
        }
    }
}
