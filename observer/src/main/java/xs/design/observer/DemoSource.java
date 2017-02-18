package xs.design.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by hasee on 2017/2/18.
 */
public class DemoSource {
    private Vector repository = new Vector();//监听自己的监听器队列
    public DemoSource(){}
    public void addDemoListener(DemoListener dl) {
        repository.addElement(dl);
    }
    public void removeDemoListener(DemoListener dl) {
        repository.remove(dl);
    }
    private void notifyDemoEvent() {//通知所有的监听器
        Enumeration enums = repository.elements();
        while(enums.hasMoreElements()) {
            DemoListener dl = (DemoListener)enums.nextElement();
            dl.handleEvent(new DemoEvent(this));
        }
    }
    public void doSth() {
        System.out.println("do Sth...");
        notifyDemoEvent();
    }
}
