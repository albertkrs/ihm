package javaSwing;



import java.awt.*;

import java.awt.event.*;
import javax.swing.*;


public class SignUp extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.getContentPane().setBackground(new Color(0x383838));
		frame.setTitle("Muslim podcast");		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	 
		
		JLabel skip = new JLabel("SKIP >");
		skip.setBounds(1250,20,225,43);
		skip.setForeground(Color.WHITE);
		skip.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.add(skip);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0x383838));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBounds(500,350,350,48);
		
		JLabel welcome = new JLabel("Sign up and start listening to our");
		welcome.setBounds(500, 170, 400, 43);
		welcome.setForeground(Color.WHITE);
		welcome.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel.add(welcome);
		 
		JLabel welcome3 = new JLabel("podcasts anytime");
		welcome3.setBounds(575, 200, 350, 43);
		welcome3.setForeground(Color.WHITE);
		welcome3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(welcome3);
		 
		 
		 
		JTextField email = new JTextField();
		email.setBorder(null);
		email.setBounds(494, 255, 350, 48);
		email.setEnabled(true);
		panel.add(email);

		JTextField userName = new JTextField();
		userName.setBorder(null);
		userName.setBounds(494, 315, 350,48);
		userName.setEnabled(true);
		panel.add(userName);
		
		JPasswordField  password= new JPasswordField ();
		password.setBorder(null);
		password.setBounds(494, 375, 350, 48);
		password.setEnabled(true);
		panel.add(password);
		
		JPasswordField  cPassword= new JPasswordField ();
		cPassword.setBorder(null);
		cPassword.setBounds(494, 435, 350, 48);
		cPassword.setEnabled(true);
		panel.add(cPassword);

		
		JButton login = new JButton("SIGN UP");
		login.setBorder(null);
		login.setBounds(494, 505, 350, 48);
		login.setForeground(Color.WHITE);
		login.setBackground(Color.GREEN);
		login.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(login);
		
		JPanel message = new JPanel();
		message.setBackground(new Color(0x383838));
		panel.add(message);
		message.setBounds(468, 555, 400, 48);
		message.setLayout(new FlowLayout());
		
		JLabel account = new JLabel("You don't have an account ?");
		account.setForeground(Color.WHITE);
		account.setFont(new Font("Tahoma", Font.BOLD, 17));
		message.add(account);
		
		JLabel register = new JLabel("register here");
		register.setForeground(Color.GREEN);
		register.setFont(new Font("Tahoma", Font.BOLD, 17));
		message.add(register);
		
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
