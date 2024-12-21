package chapter2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ct2 extends JFrame implements ActionListener {
    private JTextField balanceField;
    private JButton depositButton, withdrawButton, exitButton;
    private JPanel panel;
    private double balance;

    public ct2() {
        super("Bank Balance");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        balanceField = new JTextField(10);
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        exitButton = new JButton("Exit");
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Balance:"));
        panel.add(balanceField);
        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(exitButton);
        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        exitButton.addActionListener(this);
        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == depositButton) {
            double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter deposit amount:"));
            balance += amount;
            balanceField.setText(String.format("%.2f", balance));
        } else if (e.getSource() == withdrawButton) {
            double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter withdrawal amount:"));
            if (amount <= balance) {
                balance -= amount;
                balanceField.setText(String.format("%.2f", balance));
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient funds!");
            }
        } else if (e.getSource() == exitButton) {
            JOptionPane.showMessageDialog(null, "Your final balance is: $" + String.format("%.2f", balance));
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ct2();
    }
}