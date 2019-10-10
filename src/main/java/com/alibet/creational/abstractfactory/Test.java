package com.alibet.creational.abstractfactory;

import com.alibet.creational.abstractfactory.model.Ball;
import com.alibet.creational.abstractfactory.model.Magazine;

public class Test {

    public static void main(String[] args) {
        // Basketball
        BallFactory ballFactory = new BasketballFactory();
        Ball ball = ballFactory.createBall();
        System.out.println(ball);
        Magazine magazine = ballFactory.createMagazine();
        System.out.println(magazine);

        // Soccer
        ballFactory = new SoccerFactory();
        Ball ball2 = ballFactory.createBall();
        System.out.println(ball2);
        Magazine magazine2 = ballFactory.createMagazine();
        System.out.println(magazine2);
    }

}
