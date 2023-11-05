package pl.designs.behavioral.state;

public class Cancelled implements OrderState {
    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Unable to cancel single order twice.");
    }
}
