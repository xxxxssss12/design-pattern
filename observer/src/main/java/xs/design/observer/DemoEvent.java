package xs.design.observer;

import java.io.Serializable;
import java.util.EventObject;

/**
 * Created by hasee on 2017/2/18.
 */
public class DemoEvent implements Serializable {
    private static Object source;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DemoEvent(Object source) {
        /**
         * 所有 Event 在构造时都引用了对象 "source"，在逻辑上认为该对象是最初发生有关 Event 的对象
         * source—事件源对象—如在界面上发生的点击按钮事件中的按钮
         */
        super();
        this.source = source;
    }

    public static Object getSource() {
        return source;
    }

    public void say() {
        System.out.println("This is say method...");
    }
}
