package edu.miu.cs544.temesgen.service;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: BeanInitializationSetterInjectionJavaConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

@Component
public class Car implements Vehicle{
    private int year;

    @Override
    public void move() {
        System.out.println("Car moves at 50 mph");
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                '}';
    }
}
