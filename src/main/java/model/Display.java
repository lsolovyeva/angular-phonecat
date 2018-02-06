package model;

import java.util.Objects;

public class Display {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Display display = (Display) o;
        return Objects.equals(screenResolution, display.screenResolution) &&
                Objects.equals(screenSize, display.screenSize) &&
                Objects.equals(touchScreen, display.touchScreen);
    }

    @Override
    public int hashCode() {

        return Objects.hash(screenResolution, screenSize, touchScreen);
    }

    public static class DisplayBuilder
    {
        private String screenResolution;
        private String screenSize;
        private Boolean touchScreen;

        //fabric static method:
        public static DisplayBuilder newInstance() {
            return new DisplayBuilder();
        }
        private DisplayBuilder() {}

        //public DisplayBuilder() {}
        public DisplayBuilder screenResolution(String screenResolution) {
            this.screenResolution = screenResolution;
            return this;
        }
        public DisplayBuilder screenSize(String screenSize) {
            this.screenSize = screenSize;
            return this;
        }
        public DisplayBuilder touchScreen(Boolean touchScreen) {
            this.touchScreen = touchScreen;
            return this;
        }

        public Display build() {
            return new Display(this.screenResolution, this.screenSize, this.touchScreen);
        }
    }
}
