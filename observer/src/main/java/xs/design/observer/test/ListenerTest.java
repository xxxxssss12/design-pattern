package xs.design.observer.test;

import xs.design.observer.DemoEvent;
import xs.design.observer.DemoListener;
import xs.design.observer.DemoSource;
import xs.design.observer.impl.DemoListenerImpl;

/**
 * Created by hasee on 2017/2/18.
 */
public class ListenerTest {
    public static void main(String[] args) {
        DemoSource ds;
        try{
            ds = new DemoSource();
            //将监听器在事件源对象中登记：
            DemoListener listener1 = new DemoListenerImpl();
            ds.addDemoListener(listener1);
            ds.addDemoListener(new DemoListener() {
                public void handleEvent(DemoEvent event) {
                    System.out.println("Method come from 匿名类...");
                    event.say();
                }
            });
            ds.doSth();//触发事件、通知监听器
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
