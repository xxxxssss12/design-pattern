package xs.design.observer.impl;

import xs.design.observer.DemoEvent;
import xs.design.observer.DemoListener;

/**
 * Created by hasee on 2017/2/18.
 */
public class DemoListenerImpl implements DemoListener {
    public void handleEvent(DemoEvent de) {
        System.out.println("Inside listener1...");
        de.say();//回调
    }
}
