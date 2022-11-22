import javax.swing.*;
import java.awt.BorderLayout;

/**
 * setBorderLayout
 */
public class Border {
    public Border() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn1 = new JButton("One");
        JButton btn2 = new JButton("Five");
        JButton btn3 = new JButton("Three");
        JButton btn4 = new JButton("Two");
        JButton btn5 = new JButton("Four");

        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.SOUTH);
        frame.add(btn3, BorderLayout.CENTER);
        frame.add(btn4, BorderLayout.WEST);
        frame.add(btn5, BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);
    }
}