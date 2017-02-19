package xs.design.abstract_factory;

import xs.design.abstract_factory.impl.Circle;
import xs.design.abstract_factory.impl.Rectangle;
import xs.design.abstract_factory.impl.Triangle;

/**
 * Created by hasee on 2017/2/19.
 */
public class ShapeFactory extends AbstractFactory {
    Color getColor(String color) {
        return null;
    }

    Shape getShape(Integer sideNum) {
        if(sideNum == null){
            return null;
        }
        if(sideNum.equals(-1)) {
            return new Circle();
        } else if(sideNum.equals(4)) {
            return new Rectangle();
        } else if(sideNum.equals(3)) {
            return new Triangle();
        }
        return null;
    }
}
