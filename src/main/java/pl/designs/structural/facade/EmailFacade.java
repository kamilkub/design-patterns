package pl.designs.structural.facade;

public class EmailFacade {

    public boolean sendEmail(EmailOrder emailOrder) {
        EmailMessage message = EmailTemplateFactory.create(emailOrder.getEmailType());

        MailSender mailSender = new MailSender();

        return mailSender.send(message);
    }

}
