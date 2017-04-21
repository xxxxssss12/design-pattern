package xs.design.bridge.impl;

import xs.design.bridge.DrawApi;

/**
 * Created by xs on 2017/4/21.
 */
public class RedCircle implements DrawApi {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
