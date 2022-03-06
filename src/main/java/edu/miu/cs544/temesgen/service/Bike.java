package edu.miu.cs544.temesgen.service;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: BeanInitializationSetterInjectionJavaConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

@Component
public class Bike implements Vehicle{

    private int tireSize;
    private String brand;

    @Override
    public void move() {
        System.out.println("Bike moves at 10 mph");
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "tireSize=" + tireSize +
                ", brand='" + brand + '\'' +
                '}';
    }
}
