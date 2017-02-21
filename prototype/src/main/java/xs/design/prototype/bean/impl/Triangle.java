package xs.design.prototype.bean.impl;

import xs.design.prototype.bean.Shape;

/**
 * Created by hasee on 2017/2/21.
 */
public class Triangle  extends Shape {

    public Triangle(){
        type = "Triangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Triangle::draw() method.");
    }
}
