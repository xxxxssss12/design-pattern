package xs.design.prototype;

import xs.design.prototype.bean.Shape;
import xs.design.prototype.bean.impl.Circle;
import xs.design.prototype.bean.impl.Rectangle;
import xs.design.prototype.bean.impl.Triangle;

import java.util.Hashtable;

/**
 * Created by hasee on 2017/2/21.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Triangle triangle = new Triangle();
        triangle.setId("2");
        shapeMap.put(triangle.getId(),triangle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
