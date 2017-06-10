package cn.edu.nju.model;

import java.util.ArrayList;
import java.util.List;

public class Cloud {
	
	List<VMType> allTypes = new ArrayList<>();
	
	private Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
}
