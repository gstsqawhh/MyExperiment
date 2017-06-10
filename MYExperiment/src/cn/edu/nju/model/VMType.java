package cn.edu.nju.model;

public class VMType {

	private int capabilities;//number of cores

	private int bandwidth;//int or double
	
	private double cost;//cost per use
		
	public VMType(){
		
	}
	
	public VMType(int cp,int bw,double cost){
		this.capabilities = cp;
		this.bandwidth = bw;
		this.cost = cost;
	}
	
	public int getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(int capabilities) {
		this.capabilities = capabilities;
	}

	public int getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
