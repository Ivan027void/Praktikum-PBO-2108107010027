// Java program to illustrate the BorderLayout
import java.awt.*;
import javax.swing.*;

// class extends JFrame
class BoderLayout extends JFrame {

	BoderLayout()
	{
		
		// Creating Object of Jpanel class
		JPanel pa = new JPanel();

		// set the layout
		pa.setLayout(new BorderLayout());

		// add a new JButton with name "one" and it is
		// lie top of the container
		pa.add(new JButton("One"), BorderLayout.NORTH);

		// add a new JButton with name "five" and it is
		// lie button of the container
		pa.add(new JButton("Five"), BorderLayout.SOUTH);

		// add a new JButton with name "four" and it is
		// lie left of the container
		pa.add(new JButton("Four"), BorderLayout.EAST);

		// add a new JButton with name "two" and it is
		// lie right of the container
		pa.add(new JButton("Two"), BorderLayout.WEST);

		// add a new JButton with name "three" and it is
		// lie center of the container
		pa.add(new JButton("Three"), BorderLayout.CENTER);

		// add the pa object which refer to the Jpanel
		add(pa);

		// Function to close the operation of JFrame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Function to set size of JFrame.
		setSize(240, 200);

		// Function to set visible status of JFrame.
		setVisible(true);
	}
}

class MainFrame {

	// Driver code
	public static void main(String[] args)
	{
		
		// calling the constructor
		new BoderLayout();
	}
}
