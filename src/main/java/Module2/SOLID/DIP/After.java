package Module2.SOLID.DIP;

// Dependency Inversion Principle (DIP)
// No high level module should depend on low-level modules. Both should depend on abstractions.

// Dependency Injection (DIP) Example
// Types of dependency injection:
// 1. Constructor Injection
// 2. Setter Injection
// 3. Interface Injection

public class After {

    public interface MessageService {
        void sendMessage(String message, String recipient);
    }

    public static class EmailService implements MessageService {
        @Override
        public void sendMessage(String message, String recipient) {
            // Logic to send email
            System.out.println("Email sent to " + recipient + " with message: " + message);
        }
    }

    public static class SMSService implements MessageService {
        @Override
        public void sendMessage(String message, String recipient) {
            // Logic to send SMS
            System.out.println("SMS sent to " + recipient + " with message: " + message);
        }
    }

    public static class PushNotificationService implements MessageService {
        @Override
        public void sendMessage(String message, String recipient) {
            // Logic to send push notification
            System.out.println("Push notification sent to " + recipient + " with message: " + message);
        }
    }

    public static class NotificationManager {
        private MessageService messageService;

        // Constructor Injection
        public NotificationManager(MessageService messageService) {
            this.messageService = messageService;
        }

        // Setter Injection
        public void setMessageService(MessageService service) {
            this.messageService = service;
        }

        public void notifyUser(String message, String recipient) {
            messageService.sendMessage(message, recipient);
        }
    }

    public static void main(String[] args) {
        MessageService service = new EmailService(); // Can switch to SMSService
        NotificationManager notifier = new NotificationManager(service);

        notifier.notifyUser("Hello, User!", "Chirag");

        MessageService service2 = new SMSService();
        NotificationManager notifier2 = new NotificationManager(service2);
        notifier2.notifyUser("Hello, User!", "Chirag");

        MessageService service3 = new PushNotificationService();
        NotificationManager notifier3 = new NotificationManager(service3);
        notifier3.notifyUser("Hello, User!", "Chirag");
    }

    // HW : Interface Injection Example

}


