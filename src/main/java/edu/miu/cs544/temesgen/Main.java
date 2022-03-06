package edu.miu.cs544.temesgen;

import edu.miu.cs544.temesgen.config.SpringConfig;
import edu.miu.cs544.temesgen.service.Bike;
import edu.miu.cs544.temesgen.service.Game;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ProjectName: BeanInitializationSetterInjectionJavaConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Start....");
        AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Bike bike = springContext.getBean(Bike.class);
//        bike.setBrand("DMX");
//        bike.setTireSize(16);
//
//        Game game = springContext.getBean(Game.class);
//        game.setVehicle(bike);
//        System.out.println(game);


        Game game = springContext.getBean(Game.class);
        game.play();

        System.out.println();
        System.out.println(game);

        System.out.println("End....");
    }
}
