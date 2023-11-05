package pl.designs.behavioral.state;

public class Paid implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment gateway for rollback transaction");
        return 0;
    }
}
