package pl.designs.creational.prototype;


public class CostlyObject implements Cloneable {

    private String cost;

    private Price price;

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public CostlyObject clone() throws CloneNotSupportedException {
        return  (CostlyObject) super.clone();
    }

}
