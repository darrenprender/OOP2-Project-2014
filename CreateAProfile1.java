
import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CreateAProfile1 implements Serializable {
	
	public static void main(String args[]) throws Exception
		{
			String profileName;
			String actionMov;
			String horrorMov;
			String dramaMov;
			String romanceMov;
			String sciFiMov;
			String kidsMov;
			
				profileName = JOptionPane.showInputDialog("Please enter your Profile Name");
			
				actionMov = JOptionPane.showInputDialog("Do you like Action Movies? Please enter Yes or No.");
					while(!actionMov.equalsIgnoreCase ("Yes") && !actionMov.equalsIgnoreCase("No"))
							{
								actionMov = JOptionPane.showInputDialog("You did not enter yes or no. Try again.");
							}
				
		}
}