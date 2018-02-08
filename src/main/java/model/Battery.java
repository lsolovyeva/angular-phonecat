package model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battery battery = (Battery) o;
        return Objects.equals(standbyTime, battery.standbyTime) &&
                Objects.equals(talkTime, battery.talkTime) &&
                Objects.equals(type, battery.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(standbyTime, talkTime, type);
    }

    public static class BatteryBuilder
    {
        private String standbyTime;
        private String talkTime;
        private String type;

        public static BatteryBuilder builder() {
            return new BatteryBuilder();
        }
        private BatteryBuilder() {}

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