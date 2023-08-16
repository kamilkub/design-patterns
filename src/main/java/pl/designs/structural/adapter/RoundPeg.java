package pl.designs.structural.adapter;

public class RoundPeg implements Radius {

    private int radius;

    public RoundPeg() {
    }

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    @Override
    public int getRadius() {
        return radius;
    }
}
