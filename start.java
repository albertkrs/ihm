package javaSwing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;

public class start{

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.getContentPane().setBackground(new Color(0x383838));
		frame.setTitle("Muslim podcast");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	 
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0x383838));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel title = new JLabel("MUSLIM PODCAST",JLabel.CENTER);
		title.setEnabled(true);
		title.setFont(new Font("Tahoma", Font.BOLD, 45));
		title.setForeground(Color.WHITE);
		title.setBounds(495, 257, 420, 118);
		panel.add(title);
		title.setVisible(true);
		 
		JButton button = new JButton("GET STARTED");
		button.setBounds(593, 445, 225, 43);
		button.setBorder(null);
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0x17F24B));
		panel.add(button);
		
		JLabel title2 = new JLabel("A product app that contain a very caeruly");
		title2.setEnabled(true);
		title2.setFont(new Font("Tahoma", Font.BOLD, 25));
		title2.setForeground(Color.WHITE);
		title2.setBounds(448, 353, 537, 43);
		panel.add(title2);
		
		JLabel title3 = new JLabel("chosen audios in the islam topic");
		title3.setEnabled(true);
		title3.setFont(new Font("Tahoma", Font.BOLD, 25));
		title3.setBounds(505, 393, 516, 31);
		title3.setForeground(Color.WHITE);
		panel.add(title3);
		button.setVisible(true);

	}}