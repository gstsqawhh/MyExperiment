package cn.edu.nju.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CloudNet {
	
	Map<VMType,List<VMInstance>> vmPool = new HashMap<>();
	
	private static List<Application> applicationPool = new LinkedList<>();
	
	private int totalBandwidth;

	private Location location;
	
	public int getTotalBandwidth() {
		return totalBandwidth;
	}

	public void setTotalBandwidth(int totalBandwidth) {
		this.totalBandwidth = totalBandwidth;
	} 
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public static synchronized  List<Application> getApplicationPool() {
		return applicationPool;
	}

//	public void setApplicationPool(List<Application> applicationPool) {
//		this.applicationPool = applicationPool;
//	}

}
