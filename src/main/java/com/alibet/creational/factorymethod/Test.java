package com.alibet.creational.factorymethod;

import com.alibet.creational.factorymethod.model.Ball;

public class Test {

    public static void main(String[] args) {
        BallFactory ballFactory = new BasketballFactory();
        Ball ball = ballFactory.createBall();
        System.out.println(ball); // Basketball

        ballFactory = new SoccerFactory();
        Ball ball2 = ballFactory.createBall();
        System.out.println(ball2); // Soccer
    }

}
