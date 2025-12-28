import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentResultGUI extends JFrame implements ActionListener {

    // Declare components
    JTextField txtRoll, txtName, txtM1, txtM2, txtM3;
    JTextArea resultArea;
    JButton btnCalculate, btnClear;

    public StudentResultGUI() {

        setTitle("Student Result Management System");
        setSize(400, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        JLabel lblRoll = new JLabel("Roll Number:");
        lblRoll.setBounds(30, 30, 100, 25);
        add(lblRoll);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(30, 70, 100, 25);
        add(lblName);

        JLabel lblM1 = new JLabel("Mark 1:");
        lblM1.setBounds(30, 110, 100, 25);
        add(lblM1);

        JLabel lblM2 = new JLabel("Mark 2:");
        lblM2.setBounds(30, 150, 100, 25);
        add(lblM2);

        JLabel lblM3 = new JLabel("Mark 3:");
        lblM3.setBounds(30, 190, 100, 25);
        add(lblM3);

        // Text fields
        txtRoll = new JTextField();
        txtRoll.setBounds(150, 30, 180, 25);
        add(txtRoll);

        txtName = new JTextField();
        txtName.setBounds(150, 70, 180, 25);
        add(txtName);

        txtM1 = new JTextField();
        txtM1.setBounds(150, 110, 180, 25);
        add(txtM1);

        txtM2 = new JTextField();
        txtM2.setBounds(150, 150, 180, 25);
        add(txtM2);

        txtM3 = new JTextField();
        txtM3.setBounds(150, 190, 180, 25);
        add(txtM3);

        // Buttons
        btnCalculate = new JButton("Calculate Result");
        btnCalculate.setBounds(40, 240, 140, 30);
        btnCalculate.addActionListener(this);
        add(btnCalculate);

        btnClear = new JButton("Clear");
        btnClear.setBounds(200, 240, 100, 30);
        btnClear.addActionListener(this);
        add(btnClear);

        // Result area
        resultArea = new JTextArea();
        resultArea.setBounds(30, 290, 300, 140);
        resultArea.setEditable(false);
        add(resultArea);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCalculate) {

            try {
                int m1 = Integer.parseInt(txtM1.getText());
                int m2 = Integer.parseInt(txtM2.getText());
                int m3 = Integer.parseInt(txtM3.getText());

                int total = m1 + m2 + m3;
                float average = total / 3.0f;
                char grade;

                if (average >= 90)
                    grade = 'A';
                else if (average >= 75)
                    grade = 'B';
                else if (average >= 60)
                    grade = 'C';
                else if (average >= 40)
                    grade = 'D';
                else
                    grade = 'F';

                resultArea.setText(
                        "Roll Number : " + txtRoll.getText() + "\n" +
                        "Name        : " + txtName.getText() + "\n" +
                        "Total Marks : " + total + "\n" +
                        "Average     : " + average + "\n" +
                        "Grade       : " + grade
                );

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid marks");
            }
        }

        if (e.getSource() == btnClear) {
            txtRoll.setText("");
            txtName.setText("");
            txtM1.setText("");
            txtM2.setText("");
            txtM3.setText("");
            resultArea.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentResultGUI();
    }
}