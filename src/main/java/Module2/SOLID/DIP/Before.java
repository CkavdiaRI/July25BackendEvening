package Module2.SOLID.DIP;

public class Before {

    // Low level class
    class EmailService {
        public void sendEmail(String message) {
            System.out.println("Email sent: " + message);
        }
    }

    // High level class
    class NotificationService {
        private EmailService emailService = new EmailService();

        public void notifyUser(String message) {
            emailService.sendEmail(message);
        }
    }

    // High level module depends on low-level module, this violates the Dependency Inversion Principle (DIP)
    // EmailService is low-level module
    // NotificationService is high-level module
    // If tomorrow, we want to add SMS notification, we need to modify NotificationService class

}
