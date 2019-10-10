package com.alibet.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Subject subject = new StepSubject();

        WeChatObserver weChatObserver = new WeChatObserver();
        DingTalkObserver dingTalkObserver = new DingTalkObserver();

        subject.attach(weChatObserver);
        subject.attach(dingTalkObserver);
        subject.notifyStep(100);

        System.out.println("----------------");
        subject.detach(weChatObserver);
        subject.notifyStep(200);
    }
}
