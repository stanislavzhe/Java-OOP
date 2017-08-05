package com.stas.JavaOOP.HomeWork.Lection3.Computer;

/**
 * Created by stanislavz on 05-Jul-17.
 * Методы: включить, выключить, проверить на вирусы, вывести на консоль размер винчестера.
 */
public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i5-4670K",3.7);
        Ram ram = new Ram("Kingston",16);
        HardDrive hardDrive = new HardDrive("WD",500);

        Computer computer = new Computer(processor,ram,hardDrive);

        computer.turnComputerON();
        computer.turnComputerOFF();
        hardDrive.setVirusStatus(true);

        System.out.println("Viruses on PC: " + computer.virusOnHd());

        computer.printHdSize();

    }
}
