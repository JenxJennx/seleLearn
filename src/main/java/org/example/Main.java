package org.example;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.setGPU("Nvidia");
        computer1.setRAM(16);
        System.out.println(computer1.getRAM());
        System.out.println(computer1.getGPU());


    }
}