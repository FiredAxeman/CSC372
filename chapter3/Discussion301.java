package chapter3;

import java.awt.*;
import javax.swing.*;

public class Discussion301 extends JFrame {

    public Discussion301() {
        setTitle("Bank Center");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTextField bankCenter = new JTextField("Bank Center");
        JButton deposit = new JButton("Deposit");
        JButton withdraw = new JButton("Withdraw");
        JButton balance = new JButton("Balance");
        JButton exit = new JButton("Exit");
        bankCenter.setHorizontalAlignment(JTextField.CENTER);
        balance.setHorizontalAlignment(JButton.CENTER);
        panel.add(bankCenter, BorderLayout.NORTH);
        panel.add (deposit, BorderLayout.WEST);
        panel.add(withdraw, BorderLayout.EAST);
        panel.add(exit, BorderLayout.SOUTH);
        panel.add(balance, BorderLayout.CENTER);
        add(panel);
        setVisible(true);
        balance.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Your balance is $1000");
        });
        deposit.addActionListener(e -> {
            String depositAmount = JOptionPane.showInputDialog("Enter deposit amount");
            JOptionPane.showMessageDialog(null, "You have deposited $" + depositAmount);
        });
        withdraw.addActionListener(e -> {
            String withdrawAmount = JOptionPane.showInputDialog("Enter withdraw amount");
            JOptionPane.showMessageDialog(null, "You have withdrawn $" + withdrawAmount);
        });
        exit.addActionListener(e -> {
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Discussion301());
    }
}
