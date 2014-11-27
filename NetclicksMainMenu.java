
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
			mMFrame.add(new JLabel(new ImageIcon("NetclicksLogo.png")));
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
        				
        			}
        		
        		if(optionSelected.equals("Create a Profile"))
        			{
        				//Instanciate "CreateAProfile" class
        			}
        			
        		if(optionSelected.equals("Delete a Profile"))
        			{
        				
        			}
        		
        		if(optionSelected.equals("Quit Netclicks"))
        			{
           				System.exit(0);
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
       		 	
       		 	proMenu = new JMenuItem("Delete a Profile");       
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
       		 			
       		 			JMenuItem lethalWeapon = new JMenuItem("Lethal Weapon");
       		 			actionMovMenu.add(lethalWeapon);
       		 			
       		 			JMenuItem pointBreak = new JMenuItem("Point Break");
       		 			actionMovMenu.add(pointBreak);
       		 			
       		 			JMenuItem theMatrix = new JMenuItem("The Matrix");
       		 			actionMovMenu.add(theMatrix);
       		 			
       		 			JMenuItem theBourneIdentidy = new JMenuItem("The Bourne Identidy");
       		 			actionMovMenu.add(theBourneIdentidy);
       		 			
       		 		//End "Action" Submenu
       		 	
       		 	horrorMovMenu = new JMenu("Horror");
       		 	horrorMovMenu.addActionListener(this);
       		 	movieMenu.add(horrorMovMenu);
       		 	
       		 		//"Horror" Submenu
       		 			
       		 			JMenuItem theShining = new JMenuItem("The Shining");
       		 			horrorMovMenu.add(theShining);
       		 			
       		 			JMenuItem fridayThe13 = new JMenuItem("Friday the 13th");
       		 			horrorMovMenu.add(fridayThe13);
       		 			
       		 			JMenuItem saw = new JMenuItem("Saw");
       		 			horrorMovMenu.add(saw);
       		 		
       		 			JMenuItem theExorcist = new JMenuItem("The Exorcist");
       		 			horrorMovMenu.add(theExorcist);
       		 			
       		 			JMenuItem evilDead = new JMenuItem("Evil Dead");
       		 			horrorMovMenu.add(evilDead);
       		 			
       		 		//End of "Horror" Submenu	
       		 	
       		 	comedyMovMenu = new JMenu("Comedies");
       		 	comedyMovMenu.addActionListener(this);
       		 	movieMenu.add(comedyMovMenu);
       		 	
       		 		//"Comedies" SubMenu
       		 	
       		 			JMenuItem theHangover = new JMenuItem("The Hangover");
       		 			comedyMovMenu.add(theHangover);
       		 			
       		 			JMenuItem anchorman = new JMenuItem("Anchorman");
       		 			comedyMovMenu.add(anchorman);
       		 			
       		 			JMenuItem dumbAndDumber = new JMenuItem("Dumb and Dumber");
       		 			comedyMovMenu.add(dumbAndDumber);
       		 			
       		 			JMenuItem superbad = new JMenuItem("Superbad");
       		 			comedyMovMenu.add(superbad);
       		 			
       		 			JMenuItem shaunOfTheDead = new JMenuItem("Shaun of the Dead");
       		 			comedyMovMenu.add(shaunOfTheDead);
       		 			
       		 		//End of "Comedies" SubMenu
       		 	
       		 	dramaMovMenu = new JMenu("Drama");
       		 	dramaMovMenu.addActionListener(this);
       		 	movieMenu.add(dramaMovMenu);
       		 	
       		 		//"Drama" SubMenu
       		 	
       		 			JMenuItem shawshankRedemption = new JMenuItem("Shawshank Redemption");
       		 			dramaMovMenu.add(shawshankRedemption);
       		 			
       		 			JMenuItem forestGump = new JMenuItem("Forest Gump");
       		 			dramaMovMenu.add(forestGump);
       		 			
       		 			JMenuItem captainPhilips = new JMenuItem("Captain Philips");
       		 			dramaMovMenu.add(captainPhilips);
       		 			
       		 			JMenuItem shindlersList = new JMenuItem("Shindler's List");
       		 			dramaMovMenu.add(shindlersList);
       		 			
       		 			JMenuItem fightClub = new JMenuItem("Fight Club");
       		 			dramaMovMenu.add(fightClub);
       		 		
       		 		//End of "Drama" SubMenu
       		 	
       		 	romanceMovMenu = new JMenu("Romance");
       		 	romanceMovMenu.addActionListener(this);
       		 	movieMenu.add(romanceMovMenu);
       		 	
       		 		//"Romance" SubMenu
       		 	
       		 			JMenuItem titanic = new JMenuItem("Titanic");
       		 			romanceMovMenu.add(titanic);
       		 			
       		 			JMenuItem theNotebook = new JMenuItem("The Notebook");
       		 			romanceMovMenu.add(theNotebook);
       		 			
       		 			JMenuItem dirtyDancing = new JMenuItem("dirtyDancing");
       		 			romanceMovMenu.add(dirtyDancing);
       		 			
       		 			JMenuItem silverLiningsPlaybook = new JMenuItem("Silver Linings Playbook");
       		 			romanceMovMenu.add(silverLiningsPlaybook);
       		 			
       		 			JMenuItem forgettingSarahMarshall = new JMenuItem("Forgetting Sarah Marshall");
       		 			romanceMovMenu.add(forgettingSarahMarshall);
       		 			
       		 		//End of "Romance" SubMenu
       		 	
       		 	sciFiMovMenu = new JMenu("Science Fiction");
       		 	sciFiMovMenu.addActionListener(this);
       		 	movieMenu.add(sciFiMovMenu);
       		 	
       		 		//"Science Fiction" SubMenu
       		 	
       		 			JMenuItem alien = new JMenuItem("Alien");
       		 			sciFiMovMenu.add(alien);
       		 			
       		 			JMenuItem planetOfTheApes = new JMenuItem("Planet Of The Apes");
       		 			sciFiMovMenu.add(planetOfTheApes);
       		 			
       		 			JMenuItem starWars = new JMenuItem("Star Wars");
       		 			sciFiMovMenu.add(starWars);
       		 			
       		 			JMenuItem backToTheFuture = new JMenuItem("Back To The Future");
       		 			sciFiMovMenu.add(backToTheFuture);
       		 			
       		 			JMenuItem avatar = new JMenuItem("Avatar");
       		 			sciFiMovMenu.add(avatar);
       		 			
       		 		//End of "Science Fiction" SubMenu
       		 	
       		 	kidsMovMenu = new JMenu("Kids");
       		 	kidsMovMenu.addActionListener(this);
       		 	movieMenu.add(kidsMovMenu);
       		 	
       		 		//"Kids" SubMenu
       		 	
       		 			JMenuItem toyStory = new JMenuItem("Toy Story");
       		 			kidsMovMenu.add(toyStory);
       		 			
       		 			JMenuItem findingNemo = new JMenuItem("Finding Nemo");
       		 			kidsMovMenu.add(findingNemo);
       		 			
       		 			JMenuItem theLionKing = new JMenuItem("The Lion King");
       		 			kidsMovMenu.add(theLionKing);
       		 			
       		 			JMenuItem iceAge = new JMenuItem("Ice Age");
       		 			kidsMovMenu.add(iceAge);
       		 			
       		 			JMenuItem frozen = new JMenuItem("Frozen");
       		 			kidsMovMenu.add(frozen);
       		 			
       		 		//End of "Kids" Submenu
        		
			}//End of "createNetclicksMainMenu" Method		 
		
}//End of "NetclicksMainMenu" class.