package pl.designs.structural.proxy;


import java.awt.geom.Point2D;

public interface Image {

    void render();
    Point2D getLocation();
    void setLocation(Point2D location);


}
