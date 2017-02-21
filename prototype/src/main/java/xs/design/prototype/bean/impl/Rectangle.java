package xs.design.prototype.bean.impl;

import xs.design.prototype.bean.Shape;

/**
 * Created by hasee on 2017/2/21.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}