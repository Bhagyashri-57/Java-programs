import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class StudentRegistration extends JFrame implements ActionListener {

    JLabel title, nameLabel, usnLabel, branchLabel, genderLabel;

    JTextField nameField, usnField;

    JComboBox<String> branchBox;

    JRadioButton male, female;

    ButtonGroup genderGroup;

    JButton submit, reset;

    StudentRegistration() {

        setTitle("Student Registration Form");

        setLayout(null);

        title = new JLabel("Student Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(100, 20, 300, 30);
        add(title);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 80, 100, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 80, 180, 30);
        add(nameField);

        usnLabel = new JLabel("USN:");
        usnLabel.setBounds(50, 130, 100, 30);
        add(usnLabel);

        usnField = new JTextField();
        usnField.setBounds(150, 130, 180, 30);
        add(usnField);

        branchLabel = new JLabel("Branch:");
        branchLabel.setBounds(50, 180, 100, 30);
        add(branchLabel);

        String branches[] = {
            "CSE",
            "ISE",
            "ECE",
            "EEE",
            "MECH",
            "CIVIL"
        };

        branchBox = new JComboBox<>(branches);
        branchBox.setBounds(150, 180, 180, 30);
        add(branchBox);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 230, 100, 30);
        add(genderLabel);

        male = new JRadioButton("Male");
        male.setBounds(150, 230, 80, 30);

        female = new JRadioButton("Female");
        female.setBounds(240, 230, 100, 30);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        add(male);
        add(female);

        submit = new JButton("Submit");
        submit.setBounds(80, 300, 100, 40);
        submit.addActionListener(this);
        add(submit);

        reset = new JButton("Reset");
        reset.setBounds(220, 300, 100, 40);
        reset.addActionListener(this);
        add(reset);

        setSize(420, 430);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == submit) {

            String name = nameField.getText();
            String usn = usnField.getText();
            String branch = (String) branchBox.getSelectedItem();

            String gender = "";

            if(male.isSelected()) {
                gender = "Male";
            }
            else if(female.isSelected()) {
                gender = "Female";
            }

            JOptionPane.showMessageDialog(this,
                    "Registration Successful!\n\n"
                    + "Name: " + name
                    + "\nUSN: " + usn
                    + "\nBranch: " + branch
                    + "\nGender: " + gender);
        }

        if(e.getSource() == reset) {

            nameField.setText("");
            usnField.setText("");
            branchBox.setSelectedIndex(0);
            genderGroup.clearSelection();
        }
    }

    public static void main(String[] args) {

        new StudentRegistration();
    }
}