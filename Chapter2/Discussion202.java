package chapter2;
import java.awt.*;
import javax.swing.*;

public class Discussion202 extends JFrame {

    public Discussion202() {
        setTitle("JPanel Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Welcome to BankCorp!");
        JButton button = new JButton("Check Balance");
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Your balance is $1000.00");
        });
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Discussion202();
    }
}