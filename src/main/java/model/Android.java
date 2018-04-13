package model;

import java.util.Objects;

public class Android {
    private String os;
    private String ui;

    public Android() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Android android = (Android) o;
        return Objects.equals(os, android.os) &&
                Objects.equals(ui, android.ui);
    }

    @Override
    public int hashCode() {

        return Objects.hash(os, ui);
    }

    public static class AndroidBuilder {
        private String os;
        private String ui;

        //fabric static method:
        public static AndroidBuilder builder() {
            return new AndroidBuilder();
        }

        private AndroidBuilder() {
        }

        public AndroidBuilder os(String os) {
            this.os = os;
            return this;
        }

        public AndroidBuilder ui(String ui) {
            this.ui = ui;
            return this;
        }

        //Return the finally constructed Android object
        public Android build() {
            return new Android(this.os, this.ui);
        }
    }
}
