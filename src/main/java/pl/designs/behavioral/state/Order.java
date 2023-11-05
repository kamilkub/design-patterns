package pl.designs.behavioral.state;

public class Order {

    private OrderState currentState;

    public Order() {
        this.currentState = new New();
    }

    public void paymentSuccessful(){
        this.currentState = new Paid();
    }
    public void dispatched(){
        this.currentState = new InTransit();
    }

    public double cancel(){
        double charges = currentState.handleCancellation();
        this.currentState = new Cancelled();
        return charges;
    }

    public void delivered(){
        this.currentState = new Delivered();
    }

    public OrderState getState() {
        return this.currentState;
    }

}



