
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class NetclicksMainMenu extends JFrame implements ActionListener {
	
	JMenu menuBar;
	JLabel startupMessage;
	Container contentPane;
	
	public static void main(String args[])
		{
			NetclicksMainMenu mMFrame = new NetclicksMainMenu();
			mMFrame.setVisible(true);
			mMFrame.setExtendedState(JFrame.MAXISMIZED_BOTH);
			
		}//End of Main
		
	public NetclicksMainMenu()
		{
			setTitle("NETCLICKS - Main Menu");
			setSize(400,200);
			setResizable(true);
			setLocation(500,300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			contentPane = getContentPane();
        	contentPane.setLayout(new FlowLayout());
        	
        	createNetclicksMainMenu();
        	
        	response = new JLabel("No Profile Selected");
        	response.setSize(250,50);
        	contentPane.add(response);
			
		}//End of "mMFrame" Method
		
	public void actionPerformed(ActionEvent event)
		{
        	String  profileSelected;
        	profileSelected = event.getActionCommand();
        		
        		if(profileSelected.equals("Quit"))
        			{
           				System.exit(0);
           				
        			}//End of "if" statement
        		
        		else if(menuName.equals("Friend 1 - John Lad"))
        			{
        				response.setText("Menu Item '" + menuName + "' is selected.");
        				contentPane.setBackground(Color.orange);
        				
        			}//End of "else if" statement			 
		
}//End of "NetclicksMainMenu" class.