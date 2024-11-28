package caculatorgui;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Caculator caculator = new Caculator();
            caculator.setVisible(true);
        });
    }
}
