package xs.design.bridge;

/**
 * Created by xs on 2017/4/21.
 */
public abstract class Shape {
    protected DrawApi drawAPI;
    protected Shape(DrawApi drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
