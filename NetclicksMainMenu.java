
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class NetclicksMainMenu extends JFrame implements ActionListener {
	
	JMenu profileMenu;
	JMenu movieMenu;
	JLabel startupMessage;
	Container contentPane;
	
	public static void main(String args[])
		{
			NetclicksMainMenu mMFrame = new NetclicksMainMenu();
			mMFrame.setVisible(true);
			mMFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			
		}//End of Main
		
	public NetclicksMainMenu()
		{
			setTitle("Netclicks - Main Menu");
			setSize(400,200);
			setResizable(true);
			setLocation(500,300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			contentPane = getContentPane();
        	contentPane.setLayout(new FlowLayout());
        	
        	createNetclicksMainMenu();
        	
        	JMenuBar menuBar = new JMenuBar();
        	setJMenuBar(menuBar);
        	
        	menuBar.add(profileMenu);
        	menuBar.add(movieMenu);
        	
        	startupMessage = new JLabel("No Profile Selected");
        	startupMessage.setSize(250,50);
        	contentPane.add(startupMessage);
			
		}//End of "mMFrame" Method
		
	public void actionPerformed(ActionEvent event)
		{
        	String  profileSelected;
        	profileSelected = event.getActionCommand();
        		
        		if(profileSelected.equals("Quit Netclicks"))
        			{
           				System.exit(0);
           				
        			}//End of "if" statement.
       
		}//End of "actionPerformed" Method.	
		
	private void createNetclicksMainMenu() 
			{
			
			//Creating the "Profiles" JMenu
			
				JMenuItem proMenu;
        		profileMenu = new JMenu("Profiles");
        		
        		proMenu = new JMenuItem("Select a Profile");       
       		 	proMenu.addActionListener(this);
       		 	profileMenu.add(proMenu);
        		
        		proMenu = new JMenuItem("Create a Profile");       
       		 	proMenu.addActionListener(this);
       		 	profileMenu.add(proMenu);
       		 	
       		 	proMenu = new JMenuItem("Edit a Profile");       
       		 	proMenu.addActionListener(this);
       		 	profileMenu.add(proMenu);
       		 	
       		 	proMenu = new JMenuItem("Delete Profile");       
       		 	proMenu.addActionListener(this);
       		 	profileMenu.add(proMenu);
       		 	
       		 	profileMenu.addSeparator();
       		 	
       		 	proMenu = new JMenuItem("Quit Netclicks");       
       		 	proMenu.addActionListener(this);
       		 	profileMenu.add(proMenu);
       		 	
       		 //End Of "Profiles" JMenu
       		 
       		 //Creating the "Movies" JMenu
       		 	
       		 	JMenuItem movMenu;
       		 	movieMenu = new JMenu("Movies");
       		 	
       		 	movMenu = new JMenu("Action");
       		 	movMenu.addActionListener(this);
       		 	movieMenu.add(movMenu);
       		 		
       		 		//"Action" SubMenu
       		 		
       		 			JMenuItem dieHard = new JMenuItem("Die Hard");
       		 			movMenu.add(dieHard);
       		 			
       		 			JMenuItem lethalWeapon = new JMenuItem("Lethal Weapon");
       		 			movMenu.add(lethalWeapon);
       		 			
       		 			JMenuItem pointBreak = new JMenuItem("Point Break");
       		 			movMenu.add(pointBreak);
       		 			
       		 			JMenuItem theMatrix = new JMenuItem("The Matrix");
       		 			movMenu.add(theMatrix);
       		 			
       		 			JMenuItem theBourneIdentidy = new JMenuItem("The Bourne Identidy");
       		 			movMenu.add(theBourneIdentidy);
       		 			
       		 		//End "Action" Submenu
       		 	
       		 	movMenu = new JMenuItem("Horror");
       		 	movMenu.addActionListener(this);
       		 	movieMenu.add(movMenu);
       		 	
       		 	movMenu = new JMenuItem("Comedies");
       		 	movMenu.addActionListener(this);
       		 	movieMenu.add(movMenu);
       		 	
       		 	movMenu = new JMenuItem("Drama");
       		 	movMenu.addActionListener(this);
       		 	movieMenu.add(movMenu);
       		 	
       		 	movMenu = new JMenuItem("Romance");
       		 	movMenu.addActionListener(this);
       		 	movieMenu.add(movMenu);
       		 	
       		 	movMenu = new JMenuItem("Science Fiction");
       		 	movMenu.addActionListener(this);
       		 	movieMenu.add(movMenu);
       		 	
       		 	movMenu = new JMenuItem("Kids");
       		 	movMenu.addActionListener(this);
       		 	movieMenu.add(movMenu);
        		
			}//End of "createNetclicksMainMenu" Method		 
		
}//End of "NetclicksMainMenu" class.