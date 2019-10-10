package com.alibet.creational.abstractfactory;

import com.alibet.creational.abstractfactory.model.Ball;
import com.alibet.creational.abstractfactory.model.Magazine;

public interface BallFactory {

    Ball createBall();

    Magazine createMagazine();

}
