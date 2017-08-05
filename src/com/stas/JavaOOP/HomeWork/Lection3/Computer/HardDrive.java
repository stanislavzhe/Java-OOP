package com.stas.JavaOOP.HomeWork.Lection3.Computer;

/**
 * Created by stanislavz on 05-Jul-17.
 */
public class HardDrive {
    private String hdModel;
    private int hdSize;
    private boolean virusStatus;

    public HardDrive(String hdModel, int hdSize) {
        if (hdSize <= 0) {
            throw new IllegalArgumentException("hdSize <= 0" + hdSize);
        }
        this.hdModel = hdModel;
        this.hdSize = hdSize;
    }

    public String getHdModel() {
        return hdModel;
    }

    public int getHdSize() {
        return hdSize;
    }

    public boolean getVirusStatus() {
        return virusStatus;
    }
    public void setVirusStatus(boolean virusStatus) {
        this.virusStatus = virusStatus;
    }
}
