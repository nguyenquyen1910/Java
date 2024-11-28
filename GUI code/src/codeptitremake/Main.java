package codeptitremake;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CodePtit codePtit = new CodePtit();
            codePtit.setVisible(true);
        });
    }
}
