package pl.designs.structural.proxy;

import java.awt.geom.Point2D;

public class BitmapImage implements Image {

    private Point2D location;
    private String name;

    public BitmapImage(String fileName) {
        System.out.printf("\nLoaded from disk %s", fileName);
        this.name = fileName;
    }

    @Override
    public void render() {
        System.out.printf("\nRendering image %s", this.name);
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }
}
