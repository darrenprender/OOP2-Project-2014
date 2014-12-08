
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class PointBreak extends JFrame {
	
	Container contentPane;

		public PointBreak()
			{
				setTitle("Netclicks - Point Break");
				setSize(1024,768);
				setResizable(false);
				setLocation(500,300);
			
				contentPane = getContentPane();
        		contentPane.setLayout(new FlowLayout());
        	//Instructions on how to add a JLabel found at: http://stackoverflow.com/questions/18027833/adding-image-to-jframe
        		contentPane.add(new JLabel(new ImageIcon("../Images/pointbreak.jpg")));
        	//End of [non-original or refactored] code
        	
        	
			}
	}