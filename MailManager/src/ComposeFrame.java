import javax.swing.*;
import java.awt.*;

public class ComposeFrame extends JFrame {

    public ComposeFrame(String email, String password) {

        setTitle("Compose Email");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));

        JTextField toField = new JTextField();
        JTextField subjectField = new JTextField();
        JTextArea messageArea = new JTextArea();

        JButton sendBtn = new JButton("Send Now");
        JButton scheduleBtn = new JButton("Send in 10 sec");

        add(new JLabel("To:"));
        add(toField);
        add(new JLabel("Subject:"));
        add(subjectField);
        add(new JLabel("Message:"));
        add(messageArea);
        add(sendBtn);
        add(scheduleBtn);

        sendBtn.addActionListener(e -> {
            EmailSender.sendEmail(email, password,
                    toField.getText(),
                    subjectField.getText(),
                    messageArea.getText());
        });

        scheduleBtn.addActionListener(e -> {
            SchedulerService.scheduleEmail(email, password,
                    toField.getText(),
                    subjectField.getText(),
                    messageArea.getText(),
                    10000);
        });

        setVisible(true);
    }
}
