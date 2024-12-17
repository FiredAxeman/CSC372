package chapter2;
import java.awt.*;
import javax.swing.*;

public class Discussion201 extends JFrame {

    public Discussion201() {
        setTitle("Discussion 2-1");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to BankCorp!");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        add(label, BorderLayout.CENTER);
        JLabel label2 = new JLabel("Your balance is $1000.00");
        label2.setFont(new Font("Arial", Font.PLAIN, 18));
        add(label2, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Discussion201();
    }
}
