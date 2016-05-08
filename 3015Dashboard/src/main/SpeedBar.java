package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.JPanel;

public class SpeedBar extends JPanel{
	private static final long serialVersionUID = -4923593843080938846L;
	private double rectPct = 100;
	BufferedImage speed;
	
	public SpeedBar(){
		this.add(Box.createVerticalStrut(95));
		this.add(Box.createHorizontalStrut(15));
		load();
	}
	
	public void load(){
		try {
			speed = ImageIO.read(getClass().getResourceAsStream("speed.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		Graphics2D g2 = (Graphics2D) g;
		g.drawImage(speed, 0, 0, null);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		g2.drawRect(1, 1, 27, 102);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(3, 3, 24, (int) rectPct);
		this.repaint();
	}
	
	public void setSpeed(double speed){
		rectPct = -speed + 100;
	}
}
