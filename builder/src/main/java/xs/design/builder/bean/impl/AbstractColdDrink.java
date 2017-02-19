package xs.design.builder.bean.impl;

import xs.design.builder.bean.Item;
import xs.design.builder.bean.Packing;

/**
 * Created by hasee on 2017/2/19.
 */
public abstract class AbstractColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }
    public abstract Double price();
}
