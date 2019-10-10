package com.alibet.creational.factorymethod;

import com.alibet.creational.factorymethod.model.Ball;
import com.alibet.creational.factorymethod.model.Basketball;

public class BasketballFactory implements BallFactory {

    @Override
    public Ball createBall() {
        return new Basketball();
    }

}
