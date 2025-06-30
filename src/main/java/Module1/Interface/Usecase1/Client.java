package Module1.Interface.Usecase1;

public class Client {
    public static void main(String[] args) {
        // Email Notification Demo
        Notifier emailNotifier = new EmailNotifier();
        NotificationService emailService = new NotificationService(emailNotifier);
        emailService.notifyUser("Welcome to the platform!");

        // SMS Notification Demo
        Notifier smsNotifier = new SMSNotifier();
        NotificationService smsService = new NotificationService(smsNotifier);
        smsService.notifyUser("Your OTP is 123456");

        // Anonymous Class Demo
        Notifier pushNotifier = new Notifier() {
            @Override
            public void send(String message) {
                System.out.println("Sending Push Notification: " + message);
            }
        };
        NotificationService pushService = new NotificationService(pushNotifier);
        pushService.notifyUser("You have a new friend request");
    }
}
