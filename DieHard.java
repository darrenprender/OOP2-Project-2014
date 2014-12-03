
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class DieHard extends JFrame {
	
	Container contentPane;

		public DieHard() 
			{
				setTitle("Netclicks - Die Hard");
				setSize(1024,768);
				setResizable(false);
				setLocation(500,300);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
			
				contentPane = getContentPane();
        		contentPane.setLayout(new FlowLayout());
        	//Instructions on how to add a JLabel found at: http://stackoverflow.com/questions/18027833/adding-image-to-jframe
        		contentPane.add(new JLabel(new ImageIcon("diehard.png")));
        	//
        	
        	
			}
	}