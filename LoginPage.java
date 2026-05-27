import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame implements ActionListener {

    JLabel title, userLabel, passLabel;

    JTextField userField;

    JPasswordField passField;

    JButton login, reset;

    JCheckBox showPassword;

    LoginPage() {

        setTitle("Login Page");

        setLayout(null);

        title = new JLabel("Login Form");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(130, 20, 200, 30);
        add(title);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 80, 100, 30);
        add(userLabel);

        userField = new JTextField();
        userField.setBounds(150, 80, 180, 30);
        add(userField);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 140, 100, 30);
        add(passLabel);

        passField = new JPasswordField();
        passField.setBounds(150, 140, 180, 30);
        add(passField);

        showPassword = new JCheckBox("Show Password");
        showPassword.setBounds(150, 180, 150, 30);
        showPassword.addActionListener(this);
        add(showPassword);

        login = new JButton("Login");
        login.setBounds(70, 250, 100, 40);
        login.addActionListener(this);
        add(login);

        reset = new JButton("Reset");
        reset.setBounds(220, 250, 100, 40);
        reset.addActionListener(this);
        add(reset);

        setSize(420, 380);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == showPassword) {

            if(showPassword.isSelected()) {
                passField.setEchoChar((char)0);
            }
            else {
                passField.setEchoChar('*');
            }
        }

        if(e.getSource() == login) {

            String username = userField.getText();
            String password = String.valueOf(passField.getPassword());

            if(username.equals("admin") && password.equals("1234")) {

                JOptionPane.showMessageDialog(this,
                        "Login Successful!");

            } else {

                JOptionPane.showMessageDialog(this,
                        "Invalid Username or Password");
            }
        }

        if(e.getSource() == reset) {

            userField.setText("");
            passField.setText("");
        }
    }

    public static void main(String[] args) {

        new LoginPage();
    }
}