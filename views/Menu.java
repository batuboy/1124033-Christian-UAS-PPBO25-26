package views;

import controller.DeviceController;
import java.util.List;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import models.Device;
import util.*;
public class Menu {
    private DeviceController devCon;

    private void validateEmptyList(List<Device> devList) throws EmptyListException{
        if(devList.size() == 0){
            throw new EmptyListException();
        }
    }

    private void validateMenuChoi(int input) throws InvalidInputException{
        if(input > 3 && input < 0){
            throw new InvalidInputException("Salah Menu: " + input);
        }
    }

    private void validateOsInput(int input) throws InvalidInputException{
        if (input > 3 && input < 0) {
            throw new InvalidInputException("Salah Pilih operating system: " + input);
        }
    }

    public int render() throws InvalidInputException{
        System.out.println("Menu: ");
        System.out.println("1. Tambah Device");
        System.out.println("2. Tampilkan Semua Device");
        System.out.println("3. Tampilkan Semua device terurut berdasarkan OS");
        System.out.println("0. Keluar");
        int input = CliUtil.getInt();
        return input;
    }

    public void processUserInput(int input) throws Exception{
        switch (input) {
            case 1:
                addNewDevice();
                break;
            case 2:
                printAll();
                break;
            case 3:

                break;
            case 0:
                break;
            default:
                throw new InvalidInputException("Salah menu" + input);
        }
    }

    public void addNewDevice() throws InvalidInputException{
        System.out.println("Masukan Nama Pengguna: ");
        String nama = CliUtil.getString();

        System.out.println("Pilih Os: ");
        System.out.println("1. Windows, 2. Ubuntu, 3. Fedora");
        int input = CliUtil.getInt();

        CliUtil.getNext();

        System.out.println("Masukan Versi: ");
        String version = CliUtil.getString();

        switch (input) {
            case 1:
                devCon.addDevice(nama, devCon.initWindows(version));
                break;
            case 2:
                System.out.println("Masukan default Environment: (spasi kalo mau default)");
                String den = CliUtil.getString();

                if(den == ""){
                    devCon.addDevice(nama, devCon.initUbuntu(version));
                }else{
                    devCon.addDevice(nama, devCon.initUbuntu(version, den));
                }
                
                break;
            case 3:
                System.out.println("Masukan default Environment: (spasi kalo mau default)");
                String den1 = CliUtil.getString();

                if(den1 == ""){
                    devCon.addDevice(nama, devCon.initFedora(version));
                }else{
                    devCon.addDevice(nama, devCon.initFedora(version, den1));
                }
            default:
                throw new InvalidInputException("Salah operating System: " + input);
        }
    }

    public void printAll() throws EmptyListException{
        validateEmptyList(devCon.getList());
        for (int i = 0; i < devCon.getList().size(); i++) {
            System.out.println(devCon.getList().get(i).getUsername() + "booted: " + devCon.getList().get(i).getOs().getBootInfo() + " " + devCon.getList().get(i).getOs().getVersion());
        }
    }
}
