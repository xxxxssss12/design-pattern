package xs.design.prototype.bean.impl;

import xs.design.prototype.bean.Shape;

/**
 * Created by hasee on 2017/2/21.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}