// Interface representing a messaging service
interface MessageService {
    void sendMessage(String message);
}

// Concrete implementation of MessageService for email
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
        // Code to send email
    }
}

// Concrete implementation of MessageService for SMS
class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
        // Code to send SMS
    }
}

// High-level module that depends on MessageService abstraction
class MessageSender {
    private final MessageService messageService;

    // Constructor injection
    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        messageService.sendMessage(message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of concrete implementations
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        // Creating high-level module instance by injecting dependencies
        MessageSender sender1 = new MessageSender(emailService);
        MessageSender sender2 = new MessageSender(smsService);

        // Using high-level module to send messages
        sender1.sendMessage("Hello, this is an email!");
        sender2.sendMessage("Hi, this is an SMS!");
    }
}