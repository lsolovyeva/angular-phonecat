package model;

import java.util.List;

public class SizeAndWeight {
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
    }

    public static class SizeAndWeightBuilder
    {
        private List<String> dimensions;
        private String weight;

        //fabric static method:
        public static SizeAndWeightBuilder newInstance() {
            return new SizeAndWeightBuilder();
        }
        private SizeAndWeightBuilder() {}

        //public SizeAndWeightBuilder() {}

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
