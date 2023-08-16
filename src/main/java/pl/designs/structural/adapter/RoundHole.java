package pl.designs.structural.adapter;

public class RoundHole implements Radius {

    private int radius;


    public RoundHole(int radius) {
        this.radius = radius;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg){
        return this.getRadius() >= peg.getRadius();
    }
}
