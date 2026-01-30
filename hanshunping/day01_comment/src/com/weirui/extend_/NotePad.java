package com.weirui.extend_;

public class NotePad extends Computer {
    private String color;

    public NotePad(String CPU, int memory, int hardDrive, String color) {
        super(CPU, memory, hardDrive);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void info() {
        System.out.println("==NotePad的详细信息：==");
        System.out.println(getDetails() + " " + "颜色：" + getColor());
    }
}
