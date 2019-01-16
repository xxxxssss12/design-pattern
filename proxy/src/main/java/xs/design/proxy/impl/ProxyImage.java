package xs.design.proxy.impl;

import xs.design.proxy.Image;

/**
 * Created by xs on 2019/1/16
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
        afterDisplay();
    }

    private void afterDisplay() {
        System.out.println("i am proxy, after display handle....");
    }
}
