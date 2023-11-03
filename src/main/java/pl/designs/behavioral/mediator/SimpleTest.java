package pl.designs.behavioral.mediator;


public class SimpleTest {

    public static void main(String[] args) {
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();

        UIMediator uiMediator = new UIMediator(textField1, textField2);

        uiMediator.setControlValue(textField1, "Test value");

    }
}
