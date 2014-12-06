
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
//Instructions on how to add a JLabel found at: http://stackoverflow.com/questions/18027833/adding-image-to-jframe	
			mMFrame.add(new JLabel(new ImageIcon("../Images/NetclicksLogo.png")));
//
			mMFrame.setVisible(true);	
			
		}//End of Main
		
	public NetclicksMainMenu()
		{
			setTitle("Netclicks - Main Menu");
			setSize(1024,768);
			setResizable(false);
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
        	String  optionSelected;
        	optionSelected = event.getActionCommand();
        		
        		if(optionSelected.equals("Select a Profile"))
        			{
        				//Opens a drop down menu with Profiles
        			}
        		
        		else if(optionSelected.equals("Create a Profile"))
        			{
        				//Instanciate "CreateAProfile" class
        				CreateAProfile cap = new CreateAProfile();
        				cap.setVisible(true);
        			}
        		
        		else if(optionSelected.equals("Quit Netclicks"))
        			{
           				System.exit(0);
        			}
        			
        			//Instanciating Action Movie classes
        			
        				else if(optionSelected.equals("Die Hard"))
        					{
           						JOptionPane.showMessageDialog(null, "You picked Die Hard");
           						DieHard dh = new DieHard();
           						dh.setVisible(true);
        					}
        				
        				else if(optionSelected.equals("Lethal Weapon"))
        					{
           						JOptionPane.showMessageDialog(null, "You picked Lethal Weapon");
           						LethalWeapon lw = new LethalWeapon();
           						lw.setVisible(true);
        					}
        					
        				else if(optionSelected.equals("Point Break"))
        					{
           						JOptionPane.showMessageDialog(null, "You picked Point Break");
           						PointBreak pb = new PointBreak();
           						pb.setVisible(true);
        					}
        					
        				else if(optionSelected.equals("The Matrix"))
        					{
           						JOptionPane.showMessageDialog(null, "You picked The Matrix");
           						TheMatrix tm = new TheMatrix();
           						tm.setVisible(true);
        					}
        					
        				else if(optionSelected.equals("The Bourne Identidy"))
        					{
           						JOptionPane.showMessageDialog(null, "You picked The Bourne Identidy");
           						TheBourneIdentidy tbi = new TheBourneIdentidy();
           						tbi.setVisible(true);
        					}
        				
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
       		 	
       		 	profileMenu.addSeparator();
       		 	
       		 	proMenu = new JMenuItem("Quit Netclicks");       
       		 	proMenu.addActionListener(this);
       		 	profileMenu.add(proMenu);
       		 	
       		 //End Of "Profiles" JMenu
       		 
       		 //Creating the "Movies" JMenu
       		 	
       		 	JMenuItem actionMovMenu;
       		 	JMenuItem horrorMovMenu;
       		 	JMenuItem comedyMovMenu;
       		 	JMenuItem dramaMovMenu;
       		 	JMenuItem romanceMovMenu;
       		 	JMenuItem sciFiMovMenu;
       		 	JMenuItem kidsMovMenu;
       		 	movieMenu = new JMenu("Movies");
       		 	
       		 	actionMovMenu = new JMenu("Action");
       		 	actionMovMenu.addActionListener(this);
       		 	movieMenu.add(actionMovMenu);
       		 		
       		 		//"Action" SubMenu
       		 		
       		 			JMenuItem dieHard = new JMenuItem("Die Hard");
       		 			actionMovMenu.add(dieHard);
       		 			dieHard.addActionListener(this);
       		
       		 			JMenuItem lethalWeapon = new JMenuItem("Lethal Weapon");
       		 			actionMovMenu.add(lethalWeapon);
       		 			lethalWeapon.addActionListener(this);
       		 			
       		 			JMenuItem pointBreak = new JMenuItem("Point Break");
       		 			actionMovMenu.add(pointBreak);
       		 			pointBreak.addActionListener(this);
       		 			
       		 			JMenuItem theMatrix = new JMenuItem("The Matrix");
       		 			actionMovMenu.add(theMatrix);
       		 			theMatrix.addActionListener(this);
       		 			
       		 			JMenuItem theBourneIdentidy = new JMenuItem("The Bourne Identidy");
       		 			actionMovMenu.add(theBourneIdentidy);
       		 			theBourneIdentidy.addActionListener(this);
       		 			
       		 		//End "Action" Submenu
       		 	
       		 	horrorMovMenu = new JMenu("Horror");
       		 	horrorMovMenu.addActionListener(this);
       		 	movieMenu.add(horrorMovMenu);
       		 	
       		 		//"Horror" Submenu
       		 			
       		 			JMenuItem theShining = new JMenuItem("The Shining");
       		 			horrorMovMenu.add(theShining);
       		 			theShining.addActionListener(this);
       		 			
       		 			JMenuItem fridayThe13 = new JMenuItem("Friday the 13th");
       		 			horrorMovMenu.add(fridayThe13);
       		 			fridayThe13.addActionListener(this);
       		 			
       		 			JMenuItem saw = new JMenuItem("Saw");
       		 			horrorMovMenu.add(saw);
       		 			saw.addActionListener(this);
       		 		
       		 			JMenuItem theExorcist = new JMenuItem("The Exorcist");
       		 			horrorMovMenu.add(theExorcist);
       		 			theExorcist.addActionListener(this);
       		 			
       		 			JMenuItem evilDead2 = new JMenuItem("Evil Dead 2");
       		 			horrorMovMenu.add(evilDead2);
       		 			evilDead2.addActionListener(this);
       		 			
       		 		//End of "Horror" Submenu	
       		 	
       		 	comedyMovMenu = new JMenu("Comedies");
       		 	comedyMovMenu.addActionListener(this);
       		 	movieMenu.add(comedyMovMenu);
       		 	
       		 		//"Comedies" SubMenu
       		 	
       		 			JMenuItem theHangover = new JMenuItem("The Hangover");
       		 			comedyMovMenu.add(theHangover);
       		 			theHangover.addActionListener(this);
       		 			
       		 			JMenuItem anchorman = new JMenuItem("Anchorman");
       		 			comedyMovMenu.add(anchorman);
       		 			anchorman.addActionListener(this);
       		 			
       		 			JMenuItem dumbAndDumber = new JMenuItem("Dumb and Dumber");
       		 			comedyMovMenu.add(dumbAndDumber);
       		 			dumbAndDumber.addActionListener(this);
       		 			
       		 			JMenuItem superbad = new JMenuItem("Superbad");
       		 			comedyMovMenu.add(superbad);
       		 			superbad.addActionListener(this);
       		 			
       		 			JMenuItem shaunOfTheDead = new JMenuItem("Shaun of the Dead");
       		 			comedyMovMenu.add(shaunOfTheDead);
       		 			shaunOfTheDead.addActionListener(this);
       		 			
       		 		//End of "Comedies" SubMenu
       		 	
       		 	dramaMovMenu = new JMenu("Drama");
       		 	dramaMovMenu.addActionListener(this);
       		 	movieMenu.add(dramaMovMenu);
       		 	
       		 		//"Drama" SubMenu
       		 	
       		 			JMenuItem shawshankRedemption = new JMenuItem("Shawshank Redemption");
       		 			dramaMovMenu.add(shawshankRedemption);
       		 			shawshankRedemption.addActionListener(this);
       		 			
       		 			JMenuItem forestGump = new JMenuItem("Forest Gump");
       		 			dramaMovMenu.add(forestGump);
       		 			forestGump.addActionListener(this);
       		 			
       		 			JMenuItem captainPhilips = new JMenuItem("Captain Philips");
       		 			dramaMovMenu.add(captainPhilips);
       		 			captainPhilips.addActionListener(this);
       		 			
       		 			JMenuItem shindlersList = new JMenuItem("Shindler's List");
       		 			dramaMovMenu.add(shindlersList);
       		 			shindlersList.addActionListener(this);
       		 			
       		 			JMenuItem fightClub = new JMenuItem("Fight Club");
       		 			dramaMovMenu.add(fightClub);
       		 			fightClub.addActionListener(this);
       		 		
       		 		//End of "Drama" SubMenu
       		 	
       		 	romanceMovMenu = new JMenu("Romance");
       		 	romanceMovMenu.addActionListener(this);
       		 	movieMenu.add(romanceMovMenu);
       		 	
       		 		//"Romance" SubMenu
       		 	
       		 			JMenuItem titanic = new JMenuItem("Titanic");
       		 			romanceMovMenu.add(titanic);
       		 			titanic.addActionListener(this);
       		 			
       		 			JMenuItem theNotebook = new JMenuItem("The Notebook");
       		 			romanceMovMenu.add(theNotebook);
       		 			theNotebook.addActionListener(this);
       		 			
       		 			JMenuItem dirtyDancing = new JMenuItem("Dirty Dancing");
       		 			romanceMovMenu.add(dirtyDancing);
       		 			dirtyDancing.addActionListener(this);
       		 			
       		 			JMenuItem silverLiningsPlaybook = new JMenuItem("Silver Linings Playbook");
       		 			romanceMovMenu.add(silverLiningsPlaybook);
       		 			silverLiningsPlaybook.addActionListener(this);
       		 			
       		 			JMenuItem forgettingSarahMarshall = new JMenuItem("Forgetting Sarah Marshall");
       		 			romanceMovMenu.add(forgettingSarahMarshall);
       		 			forgettingSarahMarshall.addActionListener(this);
       		 			
       		 		//End of "Romance" SubMenu
       		 	
       		 	sciFiMovMenu = new JMenu("Science Fiction");
       		 	sciFiMovMenu.addActionListener(this);
       		 	movieMenu.add(sciFiMovMenu);
       		 	
       		 		//"Science Fiction" SubMenu
       		 	
       		 			JMenuItem alien = new JMenuItem("Alien");
       		 			sciFiMovMenu.add(alien);
       		 			alien.addActionListener(this);
       		 			
       		 			JMenuItem planetOfTheApes = new JMenuItem("Planet Of The Apes");
       		 			sciFiMovMenu.add(planetOfTheApes);
       		 			planetOfTheApes.addActionListener(this);
       		 			
       		 			JMenuItem starWars = new JMenuItem("Star Wars");
       		 			sciFiMovMenu.add(starWars);
       		 			starWars.addActionListener(this);
       		 			
       		 			JMenuItem backToTheFuture = new JMenuItem("Back To The Future");
       		 			sciFiMovMenu.add(backToTheFuture);
       		 			backToTheFuture.addActionListener(this);
       		 			
       		 			JMenuItem avatar = new JMenuItem("Avatar");
       		 			sciFiMovMenu.add(avatar);
       		 			avatar.addActionListener(this);
       		 			
       		 		//End of "Science Fiction" SubMenu
        		
			}//End of "createNetclicksMainMenu" Method		 
		
}//End of "NetclicksMainMenu" class.