package com.weirui.extend_;
// 公共类
public class Computer {
    // 共有属性
    private String CPU;
    private int memory;
    private int hardDrive;
    int age;

    public Computer() {
    }

    public Computer(String CPU, int memory, int hardDrive) {
        this.CPU = CPU;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    // 共有方法
    public String getDetails() {
        return "CPU:" + CPU + " " + "memory:" + memory + " " + "hardDrive:" + hardDrive;
    }
}
