package model;

import java.util.Objects;

public class Connectivity {
    private String bluetooth;
    private String cell;
    private Boolean gps;
    private Boolean infrared;
    private String wifi;

    public Connectivity(String bluetooth, String cell, Boolean gps, Boolean infrared, String wifi) {
        this.bluetooth = bluetooth;
        this.cell = cell;
        this.gps = gps;
        this.infrared = infrared;
        this.wifi = wifi;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public String getCell() {
        return cell;
    }
    public Boolean isGps() {
        return gps;
    }

    public Boolean isInfrared() {
        return infrared;
    }

    public String getWifi() {
        return wifi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Connectivity that = (Connectivity) o;
        return Objects.equals(bluetooth, that.bluetooth) &&
                Objects.equals(cell, that.cell) &&
                Objects.equals(gps, that.gps) &&
                Objects.equals(infrared, that.infrared) &&
                Objects.equals(wifi, that.wifi);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bluetooth, cell, gps, infrared, wifi);
    }

    public static class ConnectivityBuilder
    {
        private String bluetooth;
        private String cell;
        private Boolean gps;
        private Boolean infrared;
        private String wifi;

//fabric static method:
        public static ConnectivityBuilder newInstance() {
            return new ConnectivityBuilder();
        }
        private ConnectivityBuilder() {}

        //public ConnectivityBuilder() {}
        public ConnectivityBuilder bluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }
        public ConnectivityBuilder cell(String cell) {
            this.cell = cell;
            return this;
        }
        public ConnectivityBuilder gps(Boolean gps) {
            this.gps = gps;
            return this;
        }
        public ConnectivityBuilder infrared(Boolean infrared) {
            this.infrared = infrared;
            return this;
        }
        public ConnectivityBuilder wifi(String wifi) {
            this.wifi = wifi;
            return this;
        }

        public Connectivity build() {
            return new Connectivity(this.bluetooth, this.cell, this.gps, this.infrared, this.wifi);
        }
    }
}
