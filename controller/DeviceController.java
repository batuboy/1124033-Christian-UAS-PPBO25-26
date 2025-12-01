package controller;

import java.util.ArrayList;
import java.util.List;
import models.Device;
import models.Fedora;
import models.OperatingSystem;
import models.Ubuntu;
import models.Windows;
import models.Linux;

public class DeviceController implements IDeviceController{
    private List<Device> deviceList;

    public DeviceController() {
        deviceList = new ArrayList<>();
    }

    public void addDevice(String name, OperatingSystem os){
        deviceList.add(new Device(name, os));
    }    

    public Windows initWindows(String version){
        return new Windows(version);
    }

    public Ubuntu initUbuntu(String version){
        return new Ubuntu(version, "Gnome");
    }

    public Ubuntu initUbuntu(String version, String den){
        return new Ubuntu(version, den);
    }

    public Fedora initFedora(String version){
        return new Fedora(version, "KDE Plasma");
    }

    public Fedora initFedora(String version, String den){
        return new Fedora(version, den);
    }

    public List<Device> getList(){
        return this.deviceList;
    }
}

