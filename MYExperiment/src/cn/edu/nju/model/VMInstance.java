package cn.edu.nju.model;

import java.util.LinkedList;

public class VMInstance {
	
	private VMType vmType;
	
	private LinkedList<Task> waitTaskQueue = new LinkedList<>();
	
	public VMInstance(){
		
	}
	
	public VMInstance(VMType vmType){
		this.vmType = vmType;
	}
	
	public LinkedList<Task> getWaitTaskQueue() {
		return waitTaskQueue;
	}

	public void setWaitTaskQueue(LinkedList<Task> waitTaskQueue) {
		this.waitTaskQueue = waitTaskQueue;
	}

	public VMType getVmType() {
		return vmType;
	}

	public void setVmType(VMType vmType) {
		this.vmType = vmType;
	}
	

}
