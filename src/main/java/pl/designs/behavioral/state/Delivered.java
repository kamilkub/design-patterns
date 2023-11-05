package pl.designs.behavioral.state;

public class Delivered implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Order has been delivered");
        return 0;
    }
}
