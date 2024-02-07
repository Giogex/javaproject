package utils;

import javax.swing.*;
import java.awt.*;

public class Map extends JFrame {

    public Map() {
        setTitle("Map");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel boardPanel = createBoardPanel();
        getContentPane().add(boardPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createBoardPanel() {
        JPanel boardPanel = new JPanel(new GridLayout(10, 10));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                JPanel cellPanel = createCellPanel();
                boardPanel.add(cellPanel);
            }
        }

        return boardPanel;
    }

    private JPanel createCellPanel() {
        JPanel cellPanel = new JPanel();
        cellPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cellPanel.setPreferredSize(new Dimension(50, 50)); // Adjust the size as needed

        // You can customize the appearance or add content to each cell as needed

        return cellPanel;
    }
}