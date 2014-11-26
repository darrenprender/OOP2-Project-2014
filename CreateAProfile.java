
package components;

import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CreateAProfile extends JFrame implements ItemListener {
	
	Container contentPane;
	
	public static void main(String args[]) throws Exception
		{
			String profileName;
			
			profileName = JOptionPane.showInputDialog("Please enter your Profile Name");
		
			CreateAProfile proFrame = new CreateAProfile();
			proFrame.setVisible(true);
			
			JLabel jLabel = new JLabel("Please tick what movie genres you like:");
        	proFrame.add(jLabel);
        	
   
		}
		
	public void CreateAProfile()
		{
			setTitle("Netclicks - Create A Profile Menu");
			setSize(1024,768);
			setResizable(true);
			setLocation(500,300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

        	JCheckBox actionBox = new JCheckBox("Action");
    		actionBox.setMnemonic(KeyEvent.VK_C); 
    		actionBox.setSelected(true);
    		actionBox.addItemListener(this);
    		
    		JCheckBox horrorBox = new JCheckBox("Horror");
    		horrorBox.setMnemonic(KeyEvent.VK_C); 
    		horrorBox.setSelected(true);
    		horrorBox.addItemListener(this);
    		
    		JCheckBox comedyBox = new JCheckBox("Comedy");
    		comedyBox.setMnemonic(KeyEvent.VK_C); 
    		comedyBox.setSelected(true);
    		comedyBox.addItemListener(this);
    		
    		JCheckBox dramaBox = new JCheckBox("Drama");
    		dramaBox.setMnemonic(KeyEvent.VK_C); 
    		dramaBox.setSelected(true);
    		dramaBox.addItemListener(this);
    		
    		JCheckBox romanceBox = new JCheckBox("Romance");
    		romanceBox.setMnemonic(KeyEvent.VK_C); 
    		romanceBox.setSelected(true);
    		romanceBox.addItemListener(this);
    		
    		JCheckBox sciFiBox = new JCheckBox("Sci-Fi");
    		sciFiBox.setMnemonic(KeyEvent.VK_C); 
    		sciFiBox.setSelected(true);
    		sciFiBox.addItemListener(this);
    		
    		JCheckBox kidsBox = new JCheckBox("Kids");
    		kidsBox.setMnemonic(KeyEvent.VK_C); 
    		kidsBox.setSelected(true);
    		kidsBox.addItemListener(this);
    		
    		JPanel checkPanel = new JPanel(new GridLayout(0, 1));
        	checkPanel.add(actionBox);
        	checkPanel.add(horrorBox);
        	checkPanel.add(comedyBox);
        	checkPanel.add(dramaBox);
        	checkPanel.add(romanceBox);
        	checkPanel.add(sciFiBox);
        	checkPanel.add(kidsBox);
        	
        	add(checkPanel);
        	
		}
		
		
		public void itemStateChanged(ItemEvent e)
			{
				
			}
}