import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame(String email, String password) {

        setTitle("Dashboard");
        setSize(400, 200);
        setLayout(new FlowLayout());

        JButton readBtn = new JButton("Read Inbox");
        JButton composeBtn = new JButton("Compose Email");

        add(readBtn);
        add(composeBtn);

        readBtn.addActionListener(e -> {
            EmailReceiver.readInbox(email, password);
        });

        composeBtn.addActionListener(e -> {
            new ComposeFrame(email, password);
        });

        setVisible(true);
    }
}
