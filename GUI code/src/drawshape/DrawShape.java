package drawshape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawShape extends JFrame implements ActionListener {
    private JComboBox<String> shapeSelector;
    private JCheckBox filledCheckBox;
    private JButton colorButton;
    private JButton okButton;
    private JPanel drawPanel;
    private Color selectedColor = Color.BLACK;

    public DrawShape() {
        setTitle("Basic Shapes Drawer");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        shapeSelector = new JComboBox<>(new String[]{"Square", "Rectangle", "Circle", "Polygon"});
        shapeSelector.addActionListener(e -> drawPanel.repaint());
        controlPanel.add(new JLabel("Shape:"));
        controlPanel.add(shapeSelector);

        filledCheckBox = new JCheckBox("Filled");
        filledCheckBox.addActionListener(e -> drawPanel.repaint());
        controlPanel.add(filledCheckBox);

        colorButton = new JButton("Choose Color");
        colorButton.addActionListener(this);
        controlPanel.add(colorButton);

        add(controlPanel, BorderLayout.NORTH);
        drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawShape(g);
            }
        };
        drawPanel.setBackground(Color.WHITE);
        add(drawPanel, BorderLayout.CENTER);
    }

    private void drawShape(Graphics g) {
        g.setColor(selectedColor);
        String selectedShape = (String) shapeSelector.getSelectedItem();
        boolean isFilled = filledCheckBox.isSelected();

        int shapeSize = 150;
        int x = (drawPanel.getWidth() - shapeSize) / 2;
        int y = (drawPanel.getHeight() - shapeSize) / 2;

        switch (selectedShape) {
            case "Square":
                if (isFilled) {
                    g.fillRect(x, y, shapeSize, shapeSize);
                } else {
                    g.drawRect(x, y, shapeSize, shapeSize);
                }
                break;
            case "Rectangle":
                if (isFilled) {
                    g.fillRect(x, y, shapeSize+50, shapeSize);
                } else {
                    g.drawRect(x, y, shapeSize+50, shapeSize);
                }
                break;
            case "Circle":
                if (isFilled) {
                    g.fillOval(x, y, shapeSize, shapeSize);
                } else {
                    g.drawOval(x, y, shapeSize, shapeSize);
                }
                break;
            case "Polygon":
                int[] xPoints = {x + shapeSize/2, x + shapeSize, x + shapeSize/2, x, x + shapeSize/2};
                int[] yPoints = {y, y + shapeSize/2, y + shapeSize, y + shapeSize/2, y};
                int nPoints = 5;
                if (isFilled) {
                    g.fillPolygon(xPoints, yPoints, nPoints);
                } else {
                    g.drawPolygon(xPoints, yPoints, nPoints);
                }
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == colorButton) {
            Color chosenColor = JColorChooser.showDialog(this, "Choose Shape Color", selectedColor);
            if (chosenColor != null) {
                selectedColor = chosenColor;
                drawPanel.repaint();
            }
        }
    }
}
