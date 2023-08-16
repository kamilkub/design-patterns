package pl.designs.structural.adapter;

public class SquarePegAdapter implements Radius {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public int getRadius(){
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
