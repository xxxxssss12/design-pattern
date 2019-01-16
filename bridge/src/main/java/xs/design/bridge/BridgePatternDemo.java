package xs.design.bridge;

import xs.design.bridge.impl.Circle;
import xs.design.bridge.impl.GreenCircle;
import xs.design.bridge.impl.RedCircle;

/**
 * Created by xs on 2019/1/16
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
