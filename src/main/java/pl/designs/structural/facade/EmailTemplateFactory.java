package pl.designs.structural.facade;

public class EmailTemplateFactory {


    public static EmailMessage create(int emailType) {
        return new WelcomeClientEmailMessage();
    }
}
