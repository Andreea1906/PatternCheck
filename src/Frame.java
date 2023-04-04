import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Frame extends JFrame implements ActionListener {
    JButton button1, button2, button3;
    Scanner scanner = new Scanner(System.in);


    Frame() {
        button1 = new JButton();
        button1.setBounds(200, 100, 700, 50);
        button1.addActionListener(this);
        button1.setText("Check if a string contains only digits");

        button2 = new JButton();
        button2.setBounds(200, 200, 700, 50);
        button2.addActionListener(this);
        button2.setText("Check if a string contains only letters (uppercase or lowercase)");

        button3 = new JButton();
        button3.setBounds(200, 300, 700, 50);
        button3.addActionListener(this);
        button3.setText("Check if a string matches a specific date format (YYYY-MM-DD)");



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000, 500);
        this.setVisible(true);
        this.add(button1);
        this.add(button2);
        this.add(button3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            String pattern = "^[0-9]+$";
            System.out.println("The pattern is: " + pattern);
            System.out.println("Type the string to check: ");
            String string = scanner.nextLine();

            if (string.matches(pattern)) {
                System.out.println("The input string matches the pattern.");
            } else {
                System.out.println("The input string does not match the pattern.");
            }
        } else if (e.getSource() == button2) {
            String pattern2 = "^[a-zA-Z]+$";
            System.out.println("The pattern is: " + pattern2);
            System.out.println("Type the string to check: ");
            String string2 = scanner.nextLine();
            if (string2.matches(pattern2)) {
                System.out.println("The input string matches the pattern.");
            } else {
                System.out.println("The input string does not match the pattern.");
            }

        }else if (e.getSource() == button3) {
            String pattern3 = "^\\d{4}-\\d{2}-\\d{2}$";
            System.out.println("The pattern is: " + pattern3);
            System.out.println("Type the string to check: ");
            String string3 = scanner.nextLine();
            if (string3.matches(pattern3)) {
                System.out.println("The input string matches the pattern.");
            } else {
                System.out.println("The input string does not match the pattern.");
            }

            }
        }
    }


