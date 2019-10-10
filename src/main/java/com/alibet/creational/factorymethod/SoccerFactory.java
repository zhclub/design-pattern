package com.alibet.creational.factorymethod;

import com.alibet.creational.factorymethod.model.Ball;
import com.alibet.creational.factorymethod.model.Soccer;

public class SoccerFactory implements BallFactory {

    @Override
    public Ball createBall() {
        return new Soccer();
    }

}
