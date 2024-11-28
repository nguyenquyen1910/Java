package caculatorgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caculator extends JFrame implements ActionListener {
    private JTextField display;
    private double fNum;
    private String operator = "";

    public Caculator(){
        setTitle("Caculator in Java");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,4,5,5));

        String[] buttons = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0",".","=","+",
                "C","√","^",
        };
        for(String buttonText : buttons){
            JButton button = new JButton(buttonText);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private void caculator(double sNum){
        double res=0;
        switch (operator){
            case "+":
                res=sNum+fNum;
                break;
            case "-":
                res=fNum-sNum;
                break;
            case "*":
                res=fNum*sNum;
                break;
            case "/":
                if (sNum != 0) {
                    res = fNum / sNum;
                } else {
                    display.setText("Cannot divide by zero");
                    return;
                }
                break;
            case "^":
                res = Math.pow(fNum, sNum);
                break;
        }
        display.setText(String.valueOf(res));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try{
            switch (command){
                case "C":
                    display.setText("");
                    fNum = 0;
                    operator = "";
                    break;
                case "=":
                    caculator(Double.parseDouble(display.getText()));
                    operator = "";
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    fNum = Double.parseDouble(display.getText());
                    operator = command;
                    display.setText("");
                    break;
                case "√":
                    double res = Math.sqrt(Double.parseDouble(display.getText()));
                    display.setText(String.valueOf(res));
                    break;
                default:
                    display.setText(display.getText() + command);
                    break;
            }
        } catch (Exception ex){
            display.setText(ex.getMessage());
        }
    }
}
