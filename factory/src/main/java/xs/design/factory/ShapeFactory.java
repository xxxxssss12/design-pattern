package xs.design.factory;

import xs.design.factory.impl.Circle;
import xs.design.factory.impl.Rectangle;
import xs.design.factory.impl.Triangle;

/**
 * Created by hasee on 2017/2/19.
 */
public class ShapeFactory {

    public Shape getShape(Integer sideNum) {
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
