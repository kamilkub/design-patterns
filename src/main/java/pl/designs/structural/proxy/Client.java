package pl.designs.structural.proxy;

import java.awt.geom.Point2D;

public class Client {

    public static void main(String[] args) {
        Image image = ImageFactory.getImage("plain.txt");
        image.setLocation(new Point2D.Double(10, 10));



    }
}
