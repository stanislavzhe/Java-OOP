package com.stas.JavaOOP.HomeWork.Lection4.FileSystem;

/**
 * Created by stanislavz on 04-Jul-17.
 */
public class File implements Object {
    private String fileName;
    private double fileSize;

    public File(String fileName, double fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public String getName() {
        return fileName;
    }

    @Override
    public double getSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}
