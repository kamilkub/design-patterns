package pl.designs.behavioral.state;

public class New implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Cancellation on order - No processing");
        return 0;
    }
}
