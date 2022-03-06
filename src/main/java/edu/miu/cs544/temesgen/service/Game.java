package edu.miu.cs544.temesgen.service;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: BeanInitializationSetterInjectionJavaConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

@Component
public class Game {
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void play() {
        vehicle.move();
    }

    @Override
    public String toString() {
        return "Game{" +
                "vehicle=" + vehicle +
                '}';
    }
}
