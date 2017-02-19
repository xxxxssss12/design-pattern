package xs.design.builder.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2017/2/19.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item) {
        items.add(item);
    }
    public Double getCost(){
        Double cost = 0.0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Name : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
