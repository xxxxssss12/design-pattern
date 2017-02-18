package xs.design.singleton;

/**
 * Created by hasee on 2017/2/18.
 * 饿汉式,线程安全 但效率比较低
 */
public class HungerSingleton {
    private HungerSingleton(){}
    private static final HungerSingleton instance = new HungerSingleton();
    public static HungerSingleton getInstance() {
        return instance;
    }
}
