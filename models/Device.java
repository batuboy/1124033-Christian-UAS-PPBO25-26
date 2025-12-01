package models;

public class Device {
    private String username;
    private OperatingSystem os;

    public Device(String username, OperatingSystem os) {
        this.username = username;
        this.os = os;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public OperatingSystem getOs() {
        return os;
    }

    public void setOs(OperatingSystem os) {
        this.os = os;
    }

}
