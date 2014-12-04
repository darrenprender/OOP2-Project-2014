
import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CreateAProfile extends JFrame implements ItemListener {
	
	Container cPane;
	JCheckBox actionBox;
	JCheckBox sciFiBox;
	
	String profile="";
	public static void main(String args[]) throws Exception
		{
			String profileName;
			
			profileName = JOptionPane.showInputDialog("Please enter your Profile Name");
		
			CreateAProfile proFrame = new CreateAProfile();
			proFrame.setVisible(true);
			
		}
		
	public  CreateAProfile()
		{
			setTitle("Netclicks - Create A Profile Menu");
			setSize(500,400);
			//setResizable(true);
			setLocation(200,300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			cPane = getContentPane();
			
		//Instructions on how to add checkboxes to a Java Program found at: https://docs.oracle.com/javase/tutorial/uiswing/components/button.html
																//And here: https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/CheckBoxDemoProject/src/components/CheckBoxDemo.java
		
        	 actionBox = new JCheckBox("Action");
    		actionBox.setMnemonic(KeyEvent.VK_C); 
    		actionBox.setSelected(false);
    		actionBox.addItemListener(this);
    		
    		JCheckBox horrorBox = new JCheckBox("Horror");
    		horrorBox.setMnemonic(KeyEvent.VK_C); 
    		horrorBox.setSelected(false);
    		horrorBox.addItemListener(this);
    		
    		JCheckBox comedyBox = new JCheckBox("Comedy");
    		comedyBox.setMnemonic(KeyEvent.VK_C); 
    		comedyBox.setSelected(false);
    		comedyBox.addItemListener(this);
    		
    		JCheckBox dramaBox = new JCheckBox("Drama");
    		dramaBox.setMnemonic(KeyEvent.VK_C); 
    		dramaBox.setSelected(false);
    		dramaBox.addItemListener(this);
    		
    		JCheckBox romanceBox = new JCheckBox("Romance");
    		romanceBox.setMnemonic(KeyEvent.VK_C); 
    		romanceBox.setSelected(false);
    		romanceBox.addItemListener(this);
    		
    		sciFiBox = new JCheckBox("Sci-Fi");
    		sciFiBox.setMnemonic(KeyEvent.VK_C); 
    		sciFiBox.setSelected(false);
    		sciFiBox.addItemListener(this);
    		
    		JPanel checkPanel = new JPanel(new GridLayout(3, 3));
        	checkPanel.add(actionBox);
        	checkPanel.add(horrorBox);
        	checkPanel.add(comedyBox);
        	checkPanel.add(dramaBox);
        	checkPanel.add(romanceBox);
        	checkPanel.add(sciFiBox);
        	
        	JLabel jLabel = new JLabel("Please tick what movie genres you like:");
        	cPane.add(jLabel);
        	
        	cPane.add(checkPanel);
        	
		}
		
		
		public void itemStateChanged(ItemEvent event)
			{
				ItemSelectable  actionBoxSelected;
        		actionBoxSelected = event.getItemSelectable();
        		
        			if(actionBoxSelected == actionBox)
        				{
        					profile+="Action \n";
        					JOptionPane.showMessageDialog(null, profile);			
        				}
        				
        				else if(actionBoxSelected == sciFiBox)
        				{
        					profile+="SciFi \n";
        					JOptionPane.showMessageDialog(null, profile);			
        				}
			}
}