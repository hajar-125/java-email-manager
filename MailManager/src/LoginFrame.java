import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    JTextField emailField;
    JPasswordField passwordField;

    public LoginFrame() {
        setTitle("Login");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        emailField = new JTextField();
        passwordField = new JPasswordField();

        JButton loginBtn = new JButton("Login");

        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(loginBtn);

        loginBtn.addActionListener(e -> {
            new DashboardFrame(emailField.getText(), new String(passwordField.getPassword()));
            dispose();
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
