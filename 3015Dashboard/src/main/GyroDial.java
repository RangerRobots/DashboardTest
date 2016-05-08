package main;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;

public class GyroDial extends JPanel{
	private static final long serialVersionUID = -8273261551863916521L;
	private double rotation = 0;
	BufferedImage needle;

	public GyroDial(){
		this.add(Box.createHorizontalStrut(236));
		this.add(Box.createVerticalStrut(241));
		load();
	}
	
	public void load(){
		try {
			needle = ImageIO.read(getClass().getResourceAsStream("needle.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		this.setBackground(Color.DARK_GRAY);
		g.setColor(new Color(180,180,180));
		g.setFont(new Font("arial", 0, 20));
		g.fillOval(0, 0, 250, 250);
		g.setColor(Color.BLACK);
		g.drawString("0", 120, 40);
		g.drawString("90", 200, 130);
		g.drawString("180", 110, 220);
		g.drawString("270", 30, 130);
		g.drawOval(0, 0, 250, 250);
		g.fillOval(121, 121, 8, 8);
		g.drawLine(125, 0, 125, 20);
		g.drawLine(125, 250, 125, 230);
		g.drawLine(0, 125, 20, 125);
		g.drawLine(230, 125, 250, 125);
		g2.rotate(Math.toRadians(rotation), 125, 125);
		g2.drawImage(needle, 0, 0, null);
//		setRotation(NetworkTableClient.getNumber("Gyro", 0));
		setRotation(rotation + 0.1);
		this.repaint();
	}
	
	public void setRotation(double degrees){
		rotation = degrees;
		if(rotation >= 360){
			rotation = 0;
		}
	}
}