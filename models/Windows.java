package models;

public class Windows extends OperatingSystem {

    public Windows(String version) {
        super("Windows", version);
    }

    public String getBootInfo(){
        return "Booting " + super.getOsName();
    }
}
