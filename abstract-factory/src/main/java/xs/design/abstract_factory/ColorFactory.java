package xs.design.abstract_factory;

import xs.design.abstract_factory.impl.Blue;
import xs.design.abstract_factory.impl.Green;
import xs.design.abstract_factory.impl.Red;

/**
 * Created by hasee on 2017/2/19.
 */
public class ColorFactory extends AbstractFactory {
    Color getColor(String color) {
        if (null == color) return null;
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }
    Shape getShape(Integer sideNum) {
        return null;
    }
}
