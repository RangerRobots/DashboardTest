package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class Dashboard {
	public static void main(String[] args){
		new Dashboard().run();
	}
	
	public void run(){
		NetworkTable.setClientMode();
		NetworkTable.setIPAddress("10.30.15.2");
		NetworkTable table = NetworkTable.getTable("datatable");
		
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, e);
			}
			
			double test = table.getNumber("test", 3.3);
			System.out.println("Test: " + test);
		}
	}
}
