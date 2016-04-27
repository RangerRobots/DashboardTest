package main;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Frame extends JFrame{
	private static final long serialVersionUID = 4887525192006201710L;
	public static Dimension window = new Dimension(1000, 500);
	
	public Frame(){
		Container c = this.getContentPane();
		Toolkit kit = this.getToolkit();
		Dimension screen = kit.getScreenSize();
		this.setBounds(screen.width/2-window.width/2, screen.height/3-window.height/2, window.width, window.height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("3015 Dashboard");
		this.setResizable(false);
		try{
			this.setIconImage(ImageIO.read(getClass().getResourceAsStream("32.png")));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		c.add(new UI());
		
		this.setVisible(true);
	}
}
