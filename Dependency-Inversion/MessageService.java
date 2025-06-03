//This example demonstrates the dependency inversion principle (DIP) in Java.
//We intend to minimize the dependency between objects by introducing an abstraction layer.
// The `MessageService` interface defines the contract for sending messages.
/* The `EmailService` class implements this interface, allowing for different message services to be
used without modifying the dependent code. */

public interface MessageService {
    void sendMessage(String message, String recipient);
}

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Email sent to " + recipient + " with message: " + message);
    }
}

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("SMS sent to " + recipient + " with message: " + message);
    }
}

/* in this case, there is little to no dependency between the `MessageService` interface and its implementations. */