package pl.designs.behavioral.observer;

public class OrderObserver implements Observer<Order> {
    @Override
    public void update(Order subject) {
        if(subject.getCount() > 3) {
            subject.setDiscount(50);
        }
    }
}
