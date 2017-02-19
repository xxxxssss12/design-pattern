package xs.design.builder.bean;

/**
 * 食物条目
 * Created by hasee on 2017/2/19.
 */
public interface Item {
    String name();
    Packing packing();
    Double price();
}
