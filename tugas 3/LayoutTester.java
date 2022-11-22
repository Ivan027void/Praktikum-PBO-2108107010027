import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutTester extends JFrame{
    private JFrame a;
    JButton b1 = new JButton("One");
    JButton b2 = new JButton("Two");
    JButton b3 = new JButton("Three");
    JButton b4 = new JButton("Four");
    JButton b5 = new JButton("Five");
   
    public LayoutTester(){
        a= new JFrame();
    }

    public Void setBorderLayout(){
        JPanel panel  = (JPanel)a.getContentPane();
        // add button
        a.add(b1,BorderLayout.NORTH);
        a.add(b2,BorderLayout.WEST);
        a.add(b3,BorderLayout.CENTER);
        a.add(b4,BorderLayout.EAST);
        a.add(b5,BorderLayout.SOUTH);

        // setting flow layout of 3 rows and 3 columns
        a.setLayout(new BorderLayout());
        a.setSize(300, 180);
        a.setVisible(true);
    }

    public void setFlowLayout(){
       
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
    }

    public Void setGridLayout(){
        JFrame c = new JFrame();
        // add button
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        // setting flow layout of 3 rows and 3 columns
        c.setLayout(new GridLayout(3,2));
        c.setSize(300, 300);
        c.setVisible(true);
    }
    
    public static void main(String[] args) {
        new LayoutTester();
    }
}