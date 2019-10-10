package com.alibet.creational.abstractfactory;

import com.alibet.creational.abstractfactory.model.Ball;
import com.alibet.creational.abstractfactory.model.Magazine;
import com.alibet.creational.abstractfactory.model.Soccer;
import com.alibet.creational.abstractfactory.model.SoccerMagazine;

public class SoccerFactory implements BallFactory {

    @Override
    public Ball createBall() {
        return new Soccer();
    }

    @Override
    public Magazine createMagazine() {
        return new SoccerMagazine();
    }

}
