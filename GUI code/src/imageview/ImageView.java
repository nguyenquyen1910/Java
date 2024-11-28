package imageview;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ImageView extends JFrame {
    private JLabel imageLabel;

    public ImageView() {
        setTitle("Image View");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        JButton btnChoose = new JButton("Choose Image");
        btnChoose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseImage();
            }
        });
        add(btnChoose, BorderLayout.SOUTH);
    }

    private void chooseImage() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Image file", "jpg", "jpeg", "png", "gif"));

        int resultVal = chooser.showOpenDialog(this);
        if (resultVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            displayImage(imageIcon);
        }
    }
    private void displayImage(ImageIcon imageIcon){
        Image image = imageIcon.getImage();
        Image resizedImage = image.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(resizedImage));
    }

    private Icon resize(ImageIcon imageIcon, int width, int height) {
        Image image = imageIcon.getImage();
        Image resized = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resized);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(imageLabel.getIcon() != null){
            displayImage((ImageIcon) imageLabel.getIcon());
        }
    }
}
