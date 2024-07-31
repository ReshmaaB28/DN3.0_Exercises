package Decorator_Pattern;

public class NotifierDecoratorTest {
    public static void main(String[] args) {
        // Create a basic EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS and Slack decorators
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send a message using all decorators
        slackNotifier.send("Hello, World!");
    }
}
