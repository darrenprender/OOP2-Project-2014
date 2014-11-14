
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class NetclicksMainMenu extends JFrame implements ActionListener {
	
	JMenu mainMenu;
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
        	
        	menuBar.add(mainMenu);
        	
        	startupMessage = new JLabel("No Profile Selected");
        	startupMessage.setSize(250,50);
        	contentPane.add(startupMessage);
			
		}//End of "mMFrame" Method
		
	public void actionPerformed(ActionEvent event)
		{
        	String  profileSelected;
        	profileSelected = event.getActionCommand();
        		
        		if(profileSelected.equals("Quit"))
        			{
           				System.exit(0);
           				
        			}//End of "if" statement.
       
		}//End of "actionPerformed" Method.	
		
	private void createNetclicksMainMenu() 
			{
				JMenuItem    item;
        		mainMenu = new JMenu("Profiles");
        		
			}//End of "		 
		
}//End of "NetclicksMainMenu" class.