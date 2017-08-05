package com.stas.JavaOOP.HomeWork.Lection3.Computer;

/**
 * Created by stanislavz on 05-Jul-17.
 */
public class Computer {
    private Processor processor;
    private Ram ram;
    private HardDrive hardDrive;
    private CD_ROM cd_rom;
    private boolean onStatus;

    public Computer(Processor processor, Ram ram, HardDrive hardDrive) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public void addCDRom (CD_ROM cd_rom){
        this.cd_rom = cd_rom;
    }

    public void turnComputerON(){
        onStatus = true;
    }
    public void turnComputerOFF(){
        onStatus = false;
    }

    public void printHdSize(){
        System.out.println("HDD size: " + hardDrive.getHdSize() + " GB");
    }

    public boolean virusOnHd(){
        return hardDrive.getVirusStatus();
    }

    public boolean getStatus() {
        return onStatus;
    }
}
