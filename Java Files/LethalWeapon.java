
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class LethalWeapon extends JFrame {
	
	Container contentPane;

		public LethalWeapon()
			{
				setTitle("Netclicks - Lethal Weapon");
				setSize(1024,768);
				setResizable(false);
				setLocation(500,300);
			
				contentPane = getContentPane();
        		contentPane.setLayout(new FlowLayout());
        	//Instructions on how to add a JLabel found at: http://stackoverflow.com/questions/18027833/adding-image-to-jframe
        		contentPane.add(new JLabel(new ImageIcon("../Images/lethalweapon.png")));
        	//
        	
        	
			}
	}