package model;

public class Battery {
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

    public static class BatteryBuilder
    {
        private String standbyTime;
        private String talkTime;
        private String type;

        //fabric static method:
        public static BatteryBuilder newInstance() {
            return new BatteryBuilder();
        }
        private BatteryBuilder() {}

        //public BatteryBuilder() {}
        public BatteryBuilder standbyTime(String standbyTime) {
            this.standbyTime = standbyTime;
            return this;
        }
        public BatteryBuilder talkTime(String talkTime) {
            this.talkTime = talkTime;
            return this;
        }
        public BatteryBuilder type(String type) {
            this.type = type;
            return this;
        }

        public Battery build() {
            return new Battery(this.standbyTime, this.talkTime, this.type);
        }
    }
}