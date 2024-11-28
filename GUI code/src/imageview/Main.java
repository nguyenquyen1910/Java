package imageview;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageView view = new ImageView();
            view.setVisible(true);
        });
    }
}
