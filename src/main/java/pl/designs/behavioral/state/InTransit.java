package pl.designs.behavioral.state;

public class InTransit implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Order is in transit");
        System.out.println("Informing courier to return the parcel");
        System.out.println("Contacting payment gateway for money payback");
        return 0;
    }
}
