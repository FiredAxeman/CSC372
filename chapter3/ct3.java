package chapter3;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Date;
import javax.swing.*;

public class ct3 extends JFrame implements ActionListener {

  private JTextField textField;
  private JMenuBar menuBar;
  private JMenu menu;
  private int randomHue;

  public ct3() {
    super("Menu Example");

    menuBar = new JMenuBar();
    menu = new JMenu("Menu");


    menuBar.add(menu);
    JMenuItem menuItem1 = new JMenuItem("Show Date and Time");
    menuItem1.addActionListener(this);
    menu.add(menuItem1);

    JMenuItem menuItem2 = new JMenuItem("Save to File");
    menuItem2.addActionListener(this);
    menu.add(menuItem2);

    JMenuItem menuItem3 = new JMenuItem("Change Background Color");
    menuItem3.addActionListener(this);
    menu.add(menuItem3);

    JMenuItem menuItem4 = new JMenuItem("Exit");
    menuItem4.addActionListener(this);
    menu.add(menuItem4);

    textField = new JTextField(20);

    setJMenuBar(menuBar);
    add(textField, BorderLayout.CENTER);

    randomHue = (int) (Math.random() * 360);

    setSize(300, 200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    menuBar.setBackground(Color.green);
    
    
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JMenuItem menuItem = (JMenuItem) e.getSource();
    String text = menuItem.getText();

    if (text.equals("Show Date and Time")) {
      Date date = new Date();
      String dateTime = date.toString();

      textField.setText(dateTime);
    } else if (text.equals("Save to File")) {

      String textToSave = textField.getText();

      try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
        writer.write(textToSave);
        writer.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    } else if (text.equals("Change Background Color")) {

      Color randomColor = Color.getHSBColor(randomHue, 1.0f, 1.0f);
      setBackground(randomColor);

      randomHue = (int) (Math.random() * 360);
    } else if (text.equals("Exit")) {
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    new ct3();
  }
}