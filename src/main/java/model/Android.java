package model;

public class Android {
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


    public static class AndroidBuilder
    {
        private String os;
        private String ui;

        public AndroidBuilder() {}
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
