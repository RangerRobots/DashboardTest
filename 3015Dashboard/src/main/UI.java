package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class UI extends JPanel{
	private static final long serialVersionUID = -7156837893685441474L;

	public UI(){
		this.setLayout(null);
		GyroDial gyro = new GyroDial();
		gyro.setBounds(740,5,251,251);
		this.add(gyro);
		SpeedBar leftSpeed = new SpeedBar();
		SpeedBar rightSpeed = new SpeedBar();
		leftSpeed.setBounds(830, 325, 30, 105);
		leftSpeed.setSpeed(50);
		this.add(leftSpeed);
		rightSpeed.setBounds(870, 325, 30, 105);
		rightSpeed.setSpeed(50);
		this.add(rightSpeed);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.DARK_GRAY);
		
		this.repaint();
	}
}
