
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class EvilDead2 extends JFrame {
	
	Container contentPane;

		public EvilDead2()
			{
				setTitle("Netclicks - Evil Dead 2");
				setSize(1024,768);
				setResizable(false);
				setLocation(500,300);
			
				contentPane = getContentPane();
        		contentPane.setLayout(new FlowLayout());
        	//Instructions on how to add a JLabel found at: http://stackoverflow.com/questions/18027833/adding-image-to-jframe
        		contentPane.add(new JLabel(new ImageIcon("evildead2.jpg")));
        	//
        	
        	
			}
	}