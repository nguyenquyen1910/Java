package colorgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColorExam {
    private JFrame frame;
    private JComboBox<String> comboBox;
    private List<String> colors = new ArrayList<>(Arrays.asList("RED","GREEN","BLUE","YELLOW","ORANGE","WHITE","BLACK"));
    private Color[] colorValues = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.WHITE, Color.BLACK};

    public ColorExam(){
        frame = new JFrame("Color Exam");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        comboBox = new JComboBox<>(colors.toArray(new String[0]));
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboBox.getSelectedIndex();
                frame.getContentPane().setBackground(colorValues[selectedIndex]);
            }
        });
        frame.add(comboBox);
        frame.setVisible(true);
    }
}
