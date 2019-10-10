package com.alibet.creational.abstractfactory;

import com.alibet.creational.abstractfactory.model.Ball;
import com.alibet.creational.abstractfactory.model.Basketball;
import com.alibet.creational.abstractfactory.model.BasketballMagazine;
import com.alibet.creational.abstractfactory.model.Magazine;

public class BasketballFactory implements BallFactory {

    @Override
    public Ball createBall() {
        return new Basketball();
    }

    @Override
    public Magazine createMagazine() {
        return new BasketballMagazine();
    }

}
