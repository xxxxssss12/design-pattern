package xs.design.observer;

import java.util.EventListener;

/**
 * Created by hasee on 2017/2/18.
 */
public interface DemoListener {
    /**
     * EventListener是所有事件侦听器接口必须扩展的标记接口、因为它是无内容的标记接口、
     * 所以事件处理方法由我们自己声明如下：
     */
    void handleEvent(DemoEvent dm);
}
