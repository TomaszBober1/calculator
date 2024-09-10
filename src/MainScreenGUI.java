import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.util.Objects;

public class MainScreenGUI extends JFrame{


    /* TODO
    *   add result operation
    *   finish current operation before starting the next one, currently: we entered two numbers for example 10 and 5 and current operation is add, but next operation we want to do is subtraction, so we click - button the result should be
    *       15 in enteredHistory JTextField and operation set to -, but now we get the result 5 (calculator doesn't check which sign was entered before and starts new operation immediately
    *   add the rest of methods: divide, change sign etc.
    * */
    public MainScreenGUI() {


        Dimension minWindowSize = new Dimension(340,500);
        setMinimumSize(minWindowSize);
        setSize(280, 380);

        setLocation(960,0);
        setTitle("Calculator");

        setLayout(new GridLayout(2, 1));
        JPanel display = new JPanel(new GridLayout(3, 1));
        add(display);

        JTextField enteredHistory = new JTextField();
        display.add(enteredHistory);
        JTextField operation = new JTextField();
        display.add(operation);
        JTextField entered = new JTextField();
        display.add(entered);


        JPanel keyboard = new JPanel();
        add(keyboard);

        keyboard.setLayout(new FlowLayout());
        JButton oneButton = new JButton("1");
        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");
        JButton fourButton = new JButton("4");
        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");
        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");
        JButton zeroButton = new JButton("0");

        JButton sumButton = new JButton("+");
        JButton substractButton = new JButton("-");
        JButton multiplyButton = new JButton("x");
        JButton divideButton = new JButton("/");
        JButton equalsButton = new JButton("=");
        JButton clearEnteredButton = new JButton("CE");

        oneButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                entered.setText(temp + "1");
            }
        });

        twoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                entered.setText(temp + "2");
            }
        });

        threeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                entered.setText(temp + "3");
            }
        });

        fourButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                entered.setText(temp + "4");
            }
        });

        fiveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                entered.setText(temp + "5");
            }
        });

        sixButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                entered.setText(temp + "6");
            }
        });

        sevenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                entered.setText(temp + "7");
            }
        });

        eightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                entered.setText(temp + "8");
            }
        });

        nineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                entered.setText(temp + "9");

            }
        });

        zeroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                entered.setText(temp + "0");
            }
        });

        sumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                if(Objects.equals((temp), "")){
                    operation.setText("+");
                } else if(Objects.equals(enteredHistory.getText(), "")){
                    enteredHistory.setText(temp);
                    operation.setText("+");
                    entered.setText(null);
                } else {
                    double result = SimpleCalculusOperations.add(Double.parseDouble(temp), Double.parseDouble(enteredHistory.getText()));
                    enteredHistory.setText(result + "");
                    operation.setText("+");
                    entered.setText(null);
                }

            }
        });

        substractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                if(Objects.equals((temp), "")){
                    operation.setText("-");
                } else if(Objects.equals(enteredHistory.getText(), "")){
                    enteredHistory.setText(temp);
                    operation.setText("-");
                    entered.setText(null);
                } else {
                    double result = SimpleCalculusOperations.substract(Double.parseDouble(enteredHistory.getText()), Double.parseDouble(temp));
                    enteredHistory.setText(result + "");
                    operation.setText("-");
                    entered.setText(null);
                }

            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp = entered.getText();
                if(Objects.equals((temp), "")){
                    operation.setText("x");
                } else if(Objects.equals(enteredHistory.getText(), "")){
                    enteredHistory.setText(temp);
                    operation.setText("x");
                    entered.setText(null);
                } else {
                    double result = SimpleCalculusOperations.multiplicate(Double.parseDouble(enteredHistory.getText()), Double.parseDouble(temp));
                    enteredHistory.setText(result + "");
                    operation.setText("x");
                    entered.setText(null);
                }

            }
        });

        keyboard.add(oneButton);
        keyboard.add(twoButton);
        keyboard.add(threeButton);
        keyboard.add(fourButton);
        keyboard.add(fiveButton);
        keyboard.add(sixButton);
        keyboard.add(sevenButton);
        keyboard.add(eightButton);
        keyboard.add(nineButton);
        keyboard.add(zeroButton);

        keyboard.add(sumButton);
        keyboard.add(substractButton);
        keyboard.add(multiplyButton);
        keyboard.add(divideButton);
        keyboard.add(equalsButton);
        keyboard.add(clearEnteredButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);




    }
}
