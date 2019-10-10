package com.alibet.behavioral.observer;

public class WeChatObserver extends Observer {

    private Integer step;

    public Integer getStep() {
        return step;
    }

    @Override
    public void update(Integer step) {
        this.step = step;

        System.out.println("微信现在的步数是" + this.step);
    }
}
