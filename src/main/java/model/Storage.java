package model;

public class Storage {
    private String flash;
    private String ram;

    public Storage(String flash, String ram) {
        this.flash = flash;
        this.ram = ram;
    }

    public Storage() {
    }
    public String getFlash() {
        return flash;
    }

    public String getRam() {
        return ram;
    }

    public static class StorageBuilder
    {
        private String flash;
        private String ram;

        //fabric static method:
        public static StorageBuilder newInstance() {
            return new StorageBuilder();
        }
        private StorageBuilder() {}
        //public StorageBuilder() {}
        public StorageBuilder flash(String flash) {
            this.flash = flash;
            return this;
        }
        public StorageBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Storage build() {
            return new Storage(this.flash, this.ram);
        }
    }
}
