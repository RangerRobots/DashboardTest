package main;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class NetworkTableClient {
	static NetworkTable table;
	
	public static void start(){
		NetworkTable.setClientMode();
		NetworkTable.setIPAddress("10.30.15.2");
		table = NetworkTable.getTable("datatable");
	}
	
	public static void putNumber(String key, double value){
		table.putNumber(key, value);
	}
	
	public static void putBoolean(String key, boolean bool){
		table.putBoolean(key, bool);
	}
	
	public static double getNumber(String key, double defaultValue){
		return table.getNumber(key, defaultValue);
	}
	
	public static boolean getBoolean(String key, boolean defaultValue){
		return table.getBoolean(key, defaultValue);
	}
}
