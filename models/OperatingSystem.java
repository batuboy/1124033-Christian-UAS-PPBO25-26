package models;

public abstract class OperatingSystem {
    private String osName;
    private String version;

    public OperatingSystem(String osName, String version) {
        this.osName = osName;
        this.version = version;
    }

    public abstract String getBootInfo();

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
