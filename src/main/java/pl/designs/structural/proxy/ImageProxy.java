package pl.designs.structural.proxy;

import java.awt.geom.Point2D;

public class ImageProxy implements Image {

    private String name;
    private BitmapImage image;

    private Point2D location;

    public ImageProxy(String filename) {
        this.name = filename;
    }

    @Override
    public void render() {
        if(this.image == null) {
            this.image = new BitmapImage(this.name);

            if(location != null) {
                this.image.setLocation(this.location);
            }
        }

        this.image.render();
    }

    @Override
    public Point2D getLocation() {
        if(image != null) {
            return this.image.getLocation();
        } else {
            return this.location;
        }
    }

    @Override
    public void setLocation(Point2D location) {
        if(image != null) {
            this.image.setLocation(location);
        } else {
            this.location = location;
        }
    }
}
