package xs.design.singleton;

/**
 * 懒汉式 需考虑线程安全
 * Created by hasee on 2017/2/18.
 */
public class LazySingleton {
    private LazySingleton() {}
    /**
     * 一旦一个共享变量（类的成员变量、类的静态成员变量）被volatile修饰之后，那么就具备了两层语义：
     *  1）保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
     *  2）禁止进行指令重排序。
     * synchronized虽然保证了原子性，但却没有保证指令重排序的正确性，
     * 会出现A线程执行初始化，但可能因为构造函数里面的操作太多了，所以
     * A线程的instance实例还没有造出来，但已经被赋值了。而B线程这时
     * 过来了，错以为uniqueInstance已经被实例化出来，一用才发现instance
     * 尚未被初始化。要知道我们的线程虽然可以保证原子性，但程序可能是
     * 在多核CPU上执行。
     */
    private volatile static LazySingleton instance = null;
    public static LazySingleton getInstance() {
        //双重锁判断
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
