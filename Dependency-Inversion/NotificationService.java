//in this example we will violate the dependency inversion principle (DIP) in Java.
/* The `NotificationService` class directly depends on the `EmailService` class, 
making it difficult to change the message service without modifying the dependent code. */


public class NotificationService {
    private EmailService emailService;

    public NotificationService() {
        this.emailService = new EmailService(); // Direct dependency on EmailService
    }

    public void notifyUser(String message, String recipient) {
        emailService.sendMessage(message, recipient);
    }
}

//the NotificationService class is tightly coupled to the EmailService class.



