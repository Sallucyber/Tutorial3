
interface Notification {
    void sendNotification(String recipient, String message);
}

class EmailNotification implements Notification {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("[EMAIL] To: " + recipient + "@mail.com");
        System.out.println("        Message: " + message);
    }
}

class SMSNotification implements Notification {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("[SMS]   To: " + recipient);
        System.out.println("        Message: " + message);
    }
}

public class Q8Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        email.sendNotification("ram.sharma", "Your admission is confirmed.");
        sms.sendNotification("+977-9800000001", "Your admission is confirmed.");
    }
}