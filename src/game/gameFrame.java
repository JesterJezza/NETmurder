package game;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class gameFrame extends JFrame 
{
	public static void main(String[] args)
	{
		new gameFrame();
	}
	
	private JTextArea gameLog;
	private JButton disconnectButton;
	private JLabel playerName;
	private JTextField playerNameEntry;
	private JLabel playerItems;
	private JTextArea playerItemsList;
	private JLabel playerAttributes;
	private JTextArea playerAttributeList;
	private JLabel playerLocation;
	private JTextField playerCurrentLocation;
	private JLabel playerEnemies;
	private JTextArea playerEnemyList;
	private JLabel blackMarket;
	private JTextArea blackMarketItemsList;
	private JLabel logName;

	public gameFrame()
	{
		setLocationRelativeTo(null);
		
		add(setupNothJPanel(), BorderLayout.NORTH);
		add(setupMiddleButtonJPanel(), BorderLayout.CENTER);
		add(setupSouthJPanel(), BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(gameFrame.EXIT_ON_CLOSE);
		this.setSize(400, 850);
		this.setResizable(false);
		setVisible(true);
	}
	
	private JPanel setupNothJPanel()
	{
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(6,2));
		
		playerName = new JLabel("Player Name is: ", SwingConstants.CENTER);
		playerNameEntry = new JTextField();
		
		playerItems = new JLabel("Player Items are: ", SwingConstants.CENTER);
		playerItemsList = new JTextArea();
		
		playerAttributes = new JLabel("Player Attributes are: ", SwingConstants.CENTER);
		playerAttributeList = new JTextArea();
		
		playerLocation = new JLabel("Player Current Location is: ", SwingConstants.CENTER);
		playerCurrentLocation = new JTextField();
		
		playerEnemies = new JLabel("Player's Enemies are: ",SwingConstants.CENTER);
	    playerEnemyList = new JTextArea();
		
		blackMarket = new JLabel("Black Market Items are: ", SwingConstants.CENTER);
		blackMarketItemsList = new JTextArea();
		
		northPanel.add(playerName);
		playerName.setPreferredSize(new Dimension(100, 100));
		
		northPanel.add(playerNameEntry);
		playerNameEntry.setPreferredSize(new Dimension(100, 100));

		northPanel.add(playerItems);
		playerItems.setPreferredSize(new Dimension(100, 100));
		
		northPanel.add(playerItemsList);
		playerItemsList.setPreferredSize(new Dimension(100, 100));
		
		northPanel.add(playerAttributes);
		playerAttributes.setPreferredSize(new Dimension(100, 100));
		
		northPanel.add(playerAttributeList);
		playerAttributeList.setPreferredSize(new Dimension(100, 100));
		
		northPanel.add(playerLocation);
		playerLocation.setPreferredSize(new Dimension(100, 100));
		
		northPanel.add(playerCurrentLocation);
		playerCurrentLocation.setPreferredSize(new Dimension(100, 100));
		
		northPanel.add(playerEnemies);
		playerEnemies.setPreferredSize(new Dimension(100, 100));
		
		northPanel.add(playerEnemyList);
		playerEnemyList.setPreferredSize(new Dimension(100, 100));
		
		northPanel.add(blackMarket);
		blackMarket.setPreferredSize(new Dimension(100, 100));
		
		northPanel.add(blackMarketItemsList);
		blackMarketItemsList.setPreferredSize(new Dimension(100, 100));
		
		return northPanel;
	}
	
	private JPanel setupMiddleButtonJPanel()
	{
		JPanel middlePanel = new JPanel();
		middlePanel.setLayout(new GridLayout(1,1));
		
		disconnectButton = new JButton("Disconnect from game");
		disconnectButton.setPreferredSize(new Dimension(50, 50));
		disconnectButton.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource() == disconnectButton)
				{
				}
			}});
		
		middlePanel.add(disconnectButton);
		
		return middlePanel;
	}
	
	private JPanel setupSouthJPanel()
	{
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.Y_AXIS));
		
		logName = new JLabel("The game log so far is: ", SwingConstants.CENTER);
		
		gameLog = new JTextArea();
		gameLog.setPreferredSize(new Dimension(100, 150));
		gameLog.setEditable(false);
		
		southPanel.add(logName);
		southPanel.add(gameLog);
		southPanel.add(Box.createHorizontalGlue());
				
		return southPanel;
	}
	
}
