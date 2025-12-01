package models;

public class Linux extends OperatingSystem {
    private String desktopEnvironmentName;
    
    public Linux(String osName, String version, String den) {
        super(osName, version);
        this.desktopEnvironmentName = den;
    }

    @Override
    public String getBootInfo(){
        return "Booting " + super.getOsName();
    }
    
    public String getDesktopEnvironmentName() {
        return desktopEnvironmentName;
    }
    public void setDesktopEnvironmentName(String desktopEnvironmentName) {
        this.desktopEnvironmentName = desktopEnvironmentName;
    }
    
    
}
