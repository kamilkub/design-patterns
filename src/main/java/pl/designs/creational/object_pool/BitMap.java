package pl.designs.creational.object_pool;

import java.awt.geom.Point2D;

public class BitMap implements Image {

    private Point2D location;

    private String name;

    @Override
    public void draw() {
        System.out.println("Image is being drawn.");
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        this.location = null;
        System.out.println("Bitmap is reset");
    }
}
