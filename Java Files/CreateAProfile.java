
import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CreateAProfile extends JFrame implements ItemListener, ActionListener {
	
	Container cPane;
	JCheckBox actionBox;
	JCheckBox horrorBox;
	JCheckBox romanceBox;
	JCheckBox dramaBox;
	JCheckBox comedyBox;
	JCheckBox sciFiBox;
	
	String profile = "";
	String profileName;
	
	//Profile [] profo; 
		
	public  CreateAProfile()
		{
			profileName = JOptionPane.showInputDialog("Please enter your Profile Name");
	
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
    		
    		horrorBox = new JCheckBox("Horror");
    		horrorBox.setMnemonic(KeyEvent.VK_C); 
    		horrorBox.setSelected(false);
    		horrorBox.addItemListener(this);
    		
    		comedyBox = new JCheckBox("Comedy");
    		comedyBox.setMnemonic(KeyEvent.VK_C); 
    		comedyBox.setSelected(false);
    		comedyBox.addItemListener(this);
    		
    		dramaBox = new JCheckBox("Drama");
    		dramaBox.setMnemonic(KeyEvent.VK_C); 
    		dramaBox.setSelected(false);
    		dramaBox.addItemListener(this);
    		
    		romanceBox = new JCheckBox("Romance");
    		romanceBox.setMnemonic(KeyEvent.VK_C); 
    		romanceBox.setSelected(false);
    		romanceBox.addItemListener(this);
    		
    		sciFiBox = new JCheckBox("Sci-Fi");
    		sciFiBox.setMnemonic(KeyEvent.VK_C); 
    		sciFiBox.setSelected(false);
    		sciFiBox.addItemListener(this);
    		
    		JButton saveButton = new JButton("Save");
    		saveButton.setSize(50, 50);
    		
    //Instructions on how to use an action listener with a JButton found at: http://stackoverflow.com/questions/17511789/button-actionlistener
    																  //and: 
    		saveButton.addActionListener(new ActionListener()
    			{
            			@Override
            		
            			public void actionPerformed(ActionEvent event)
							{
        						String  actionPerformed;
        						actionPerformed = event.getActionCommand();
        		
        						if(actionPerformed.equals("Save"))
        							{
        								JOptionPane.showMessageDialog(null, "This profile has been saved");
        								System.exit(0);
        							}
							}
    			});
    		
    		JLabel jLabel = new JLabel("Please tick what movie genres you like:");
        	cPane.add(jLabel);

    		JPanel checkPanel = new JPanel(new GridLayout(4, 3));
        	checkPanel.add(jLabel);
        	checkPanel.add(actionBox);
        	checkPanel.add(horrorBox);
        	checkPanel.add(comedyBox);
        	checkPanel.add(dramaBox);
        	checkPanel.add(romanceBox);
        	checkPanel.add(sciFiBox);
        	checkPanel.add(saveButton);
       
        	cPane.add(checkPanel);
        	
		}
		
		public void actionPerformed(ActionEvent event)
		{
        	String  actionPerformed;
        	actionPerformed = event.getActionCommand();
        		
        		if(actionPerformed.equals("Save"))
        			{
        				JOptionPane.showMessageDialog(null, "This profile has been saved");
        			}
		}
		
		
		public void itemStateChanged(ItemEvent event)
			{
				ItemSelectable  checkBoxSelected;
        		checkBoxSelected = event.getItemSelectable();
        		
        			if(checkBoxSelected == actionBox)
        				{
        					profile = "You picked Action Movies";
        					JOptionPane.showMessageDialog(null, profile);			
        				}
        				
        				else if(checkBoxSelected == sciFiBox)
        					{
        						profile = "You picked Sci-Fi Movies";
        						JOptionPane.showMessageDialog(null, profile);			
        					}
        					
        				else if(checkBoxSelected == horrorBox)
        					{
        						profile = "You picked Horror Movies";
        						JOptionPane.showMessageDialog(null, profile);			
        					}
        					
        				else if(checkBoxSelected == dramaBox)
        					{
        						profile = "You picked Dramatic Movies";
        						JOptionPane.showMessageDialog(null, profile);			
        					}
        					
        				else if(checkBoxSelected == romanceBox)
        					{
        						profile = "You picked Romantic Movies";
        						JOptionPane.showMessageDialog(null, profile);			
        					}
        					
        				else if(checkBoxSelected == comedyBox)
        					{
        						profile = "You picked Comedy Movies";
        						JOptionPane.showMessageDialog(null, profile);			
        					}
        					
        //Bicycle.java and BicycleFrame.java used as an example for this next bit involving arrays
        					
       /* 	public void newSystem()
        		{
      				profo = new Profile[1];
			    }
			    
			public void save() throws IOException
				{
      				ObjectOutputStream oos;
      				oos = new ObjectOutputStream(new FileOutputStream ("profo1.dat"));
      				oos.writeObject(profo1);
      				oos.close();
      			}
      			
      		public void open()
      			{
      	  			try
      	  				{
      	  					ObjectInputStream ois;
      	  					ois = new ObjectInputStream(new FileInputStream ("profo1.dat"));
         					bikes  = (Bicycle []) is.readObject();
      	  					ois.close();
      	  				} 
      			}
      			
      				catch(Exception e)
      					{
      						JOptionPane.showMessageDialog(null,"open didn't work");
      						e.printStackTrace();
      					}
      					
      }*/
	}
}
