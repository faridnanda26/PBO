package week8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh GUI");
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JLabel label = new JLabel("Hallo dunia", JLabel.CENTER);
        label.setBounds(50,30,150,30);
        JButton button = new JButton("Klik saya");
        button.setBounds(80,70,100,30);
        frame.add(label);
        frame.add(button, "South");

        button.addActionListener(e -> {
            JDialog dialog = new JDialog();
            dialog.setTitle("Contoh dialog");
            dialog.setSize(200,100);
            JLabel dialogLabel = new JLabel("Tombol di klik", JLabel.CENTER);
            dialog.add(dialogLabel);
            dialog.setLocationRelativeTo(frame);
            dialog.setVisible(true);
        });
        
        frame.setVisible(true);
    }
}
