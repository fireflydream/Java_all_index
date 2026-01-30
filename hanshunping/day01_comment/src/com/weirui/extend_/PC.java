package com.weirui.extend_;

public class PC extends Computer {
    // 特有属性
    private String brand;

    public PC(String CPU, int memory, int hardDrive, String brand) {
        super(CPU, memory, hardDrive);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void info() {
        System.out.println("==PC的详细信息：==");
        System.out.println(getDetails() + " " + "品牌:" + getBrand());


    }
}
