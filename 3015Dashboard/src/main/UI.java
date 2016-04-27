package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;

public class UI extends JPanel{
	private static final long serialVersionUID = -7156837893685441474L;

	public UI(){
		JTabbedPane tabs = new JTabbedPane();
		
		JPanel driver = new JPanel();
		driver.setBackground(Color.DARK_GRAY);
		JLabel l1 = new JLabel("Driver Panel");
		l1.setBackground(Color.DARK_GRAY);
		l1.setForeground(Color.WHITE);
		driver.add(l1);
		driver.add(Box.createHorizontalStrut(900));
		JPanel values = new JPanel();
		values.setBackground(Color.DARK_GRAY);
		JLabel l2 = new JLabel("Values Panel");
		l2.setBackground(Color.DARK_GRAY);
		l2.setForeground(Color.WHITE);
		values.add(l2);
		values.add(Box.createHorizontalStrut(900));
		
		tabs.addTab("Driver", driver);
		tabs.addTab("Values", values);
		tabs.setBackground(Color.GRAY);
		tabs.setForeground(new Color(230, 230, 230));
		tabs.setFocusable(false);
		tabs.setBorder(BorderFactory.createEmptyBorder());
		tabs.setTabPlacement(JTabbedPane.BOTTOM);
		
		this.add(tabs);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.DARK_GRAY);
	}
}
