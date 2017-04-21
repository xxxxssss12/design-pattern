package xs.design.bridge.impl;

import xs.design.bridge.DrawApi;
import xs.design.bridge.Shape;

/**
 * Created by xs on 2017/4/21.
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
