import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LayoutTester extends JFrame{
    private JFrame a,b,c;
    JButton a1 = new JButton("One");
    JButton a2 = new JButton("Two");
    JButton a3 = new JButton("Three");
    JButton a4 = new JButton("Four");
    JButton a5 = new JButton("Five");
    JButton b1 = new JButton("One");
    JButton b2 = new JButton("Two");
    JButton b3 = new JButton("Three");
    JButton b4 = new JButton("Four");
    JButton b5 = new JButton("Five");
    JButton c1 = new JButton("One");
    JButton c2 = new JButton("Two");
    JButton c3 = new JButton("Three");
    JButton c4 = new JButton("Four");
    JButton c5 = new JButton("Five");
   
    public LayoutTester(){
        a= new JFrame();
        // add button
        a.setLayout(new BorderLayout());
        a.add(a1,BorderLayout.NORTH);
        a.add(a2,BorderLayout.WEST);
        a.add(a3,BorderLayout.CENTER);
        a.add(a4,BorderLayout.EAST);
        a.add(a5,BorderLayout.SOUTH);

        // setting flow layout of 3 rows and 3 columns
        
        a.setSize(300, 180);
        a.setVisible(true);

        b= new JFrame();
        // add button
        b.add(b1);
        b.add(b2);
        b.add(b3);
        b.add(b4);
        b.add(b5);
        // setting flow layout of 3 rows and 3 columns
        b.setLayout(new FlowLayout());
        b.setSize(400, 100);
        b.setVisible(true);

        c = new JFrame();
        // add button
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);

        // setting flow layout of 3 rows and 3 columns
        c.setLayout(new GridLayout(3,2));
        c.setSize(300, 300);
        c.setVisible(true);
    }

    
    public static void main(String[] args) {
        new LayoutTester();
    }
}