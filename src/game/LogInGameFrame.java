package game;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class LogInGameFrame extends JFrame
{
	public static void main(String[] args)
	{
		new LogInGameFrame();
	}
	
	private JLabel userName;
	private JTextField userNameEntry;
	private JLabel password;
	private JPasswordField passwordEntry;
	private JLabel ipAddress;
	private JTextField ipAddressEntry;
	private JButton login;
	
	public LogInGameFrame()
	{
		setLocationRelativeTo(null);
		
		add(setupNorthJPanel(), BorderLayout.NORTH);
		add(setupMiddleJPanel(), BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(gameFrame.EXIT_ON_CLOSE);
		this.setSize(350, 200);
		this.setResizable(false);
		setVisible(true);
		
	}
	
	public JPanel setupNorthJPanel()
	{
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(3,2));
		
		Font font = new Font ("Calibri", Font.PLAIN, 20);
		
		userName = new JLabel("Username: ");
		userName.setFont(font);
		
		userNameEntry = new JTextField();
		userNameEntry.setFont(font);
		
		password = new JLabel("Password: ");
		password.setFont(font);
		
		passwordEntry = new JPasswordField();
		passwordEntry.setFont(font);
		
		ipAddress = new JLabel("IP Address: ");
		ipAddress.setFont(font);
		
		ipAddressEntry = new JTextField();
		ipAddressEntry.setFont(font);
		
		northPanel.add(userName);
		northPanel.add(userNameEntry);
		northPanel.add(password);
		northPanel.add(passwordEntry);
		northPanel.add(ipAddress);
		northPanel.add(ipAddressEntry);
		
		return northPanel;
	}
	
	public JPanel setupMiddleJPanel()
	{
		JPanel middlePanel = new JPanel();
		middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.X_AXIS));
		middlePanel.add(Box.createHorizontalGlue());

		login = new JButton("Log In");
		login.setPreferredSize(new Dimension(150, 100));
		
		login.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == login)
				{
					new gameFrame();
					setVisible(false);
					dispose();
				}
				
			}
		});
		
		middlePanel.add(login);
		
		return middlePanel;
	}
}
