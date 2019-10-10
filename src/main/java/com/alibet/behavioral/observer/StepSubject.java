package com.alibet.behavioral.observer;

public class StepSubject extends Subject{

    private Integer step;

    public Integer getStep() {
        return step;
    }

    public StepSubject setStep(Integer step) {
        this.step = step;
        return this;
    }

}
