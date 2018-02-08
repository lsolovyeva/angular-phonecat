package model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return Objects.equals(flash, storage.flash) &&
                Objects.equals(ram, storage.ram);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flash, ram);
    }

    public static class StorageBuilder
    {
        private String flash;
        private String ram;

        public static StorageBuilder builder() {
            return new StorageBuilder();
        }
        private StorageBuilder() {}
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
