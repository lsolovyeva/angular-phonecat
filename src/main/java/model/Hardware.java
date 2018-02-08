package model;

import java.util.Objects;

public class Hardware {
    private Boolean accelerometer;
    private String audioJack;
    private String cpu;
    private Boolean fmRadio;
    private Boolean physicalKeyboard;
    private String usb;

    public Hardware(Boolean accelerometer, String audioJack, String cpu, Boolean fmRadio, Boolean physicalKeyboard, String usb) {
        this.accelerometer = accelerometer;
        this.audioJack = audioJack;
        this.cpu = cpu;
        this.fmRadio = fmRadio;
        this.physicalKeyboard = physicalKeyboard;
        this.usb = usb;
    }

    public Boolean isAccelerometer() {
        return accelerometer;
    }

    public String getAudioJack() {
        return audioJack;
    }

    public String getCpu() {
        return cpu;
    }

    public Boolean isFmRadio() {
        return fmRadio;
    }

    public Boolean isPhysicalKeyboard() {
        return physicalKeyboard;
    }

    public String getUsb() {
        return usb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hardware hardware = (Hardware) o;
        return Objects.equals(accelerometer, hardware.accelerometer) &&
                Objects.equals(audioJack, hardware.audioJack) &&
                Objects.equals(cpu, hardware.cpu) &&
                Objects.equals(fmRadio, hardware.fmRadio) &&
                Objects.equals(physicalKeyboard, hardware.physicalKeyboard) &&
                Objects.equals(usb, hardware.usb);
    }

    @Override
    public int hashCode() {

        return Objects.hash(accelerometer, audioJack, cpu, fmRadio, physicalKeyboard, usb);
    }

    public static class HardwareBuilder
    {
        private Boolean accelerometer;
        private String audioJack;
        private String cpu;
        private Boolean fmRadio;
        private Boolean physicalKeyboard;
        private String usb;

        public static HardwareBuilder builder() {
            return new HardwareBuilder();
        }
        private HardwareBuilder() {}

        public HardwareBuilder accelerometer(Boolean accelerometer) {
            this.accelerometer = accelerometer;
            return this;
        }
        public HardwareBuilder audioJack(String audioJack) {
            this.audioJack = audioJack;
            return this;
        }
        public HardwareBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public HardwareBuilder fmRadio(Boolean fmRadio) {
            this.fmRadio = fmRadio;
            return this;
        }
        public HardwareBuilder physicalKeyboard(Boolean physicalKeyboard) {
            this.physicalKeyboard = physicalKeyboard;
            return this;
        }
        public HardwareBuilder usb(String usb) {
            this.usb = usb;
            return this;
        }
        public Hardware build() {
            return new Hardware(this.accelerometer, this.audioJack, this.cpu, this.fmRadio, this.physicalKeyboard, this.usb);
        }
    }
}