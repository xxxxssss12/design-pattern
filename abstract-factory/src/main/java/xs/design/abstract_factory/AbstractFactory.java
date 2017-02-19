package xs.design.abstract_factory;

/**
 * Created by hasee on 2017/2/19.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(Integer sideNum) ;
}
