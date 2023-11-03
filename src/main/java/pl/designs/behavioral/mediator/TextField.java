package pl.designs.behavioral.mediator;

public class TextField implements UIControl {

    private String value;

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
