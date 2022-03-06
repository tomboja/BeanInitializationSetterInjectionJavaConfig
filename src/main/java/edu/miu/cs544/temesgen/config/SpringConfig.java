package edu.miu.cs544.temesgen.config;

import edu.miu.cs544.temesgen.service.Bike;
import edu.miu.cs544.temesgen.service.Car;
import edu.miu.cs544.temesgen.service.Game;
import edu.miu.cs544.temesgen.service.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: BeanInitializationSetterInjectionJavaConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

@Configuration
//@ComponentScan(basePackages = "edu.miu.cs544.temesgen.service")
public class SpringConfig {
    @Bean
    public Game game(Vehicle bike) {
        Game game = new Game();
        game.setVehicle(bike);
        return game;
    }

    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
    public Bike bike() {
        Bike bike = new Bike();
        bike.setTireSize(16);
        bike.setBrand("DMX");
        return bike;
    }

}
