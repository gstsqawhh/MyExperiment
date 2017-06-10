package cn.edu.nju.model;

import java.util.LinkedList;
import java.util.List;

public class Application {

	private String appId;
	
	private int type;//实时和非实时
	
	private int arrivalTime;
	
	private int finishTime;
	
	private int deadline;//非实时为0
	
	private List<Task> workflow = new LinkedList<>();//广度遍历该workflow找出ready的tasks

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}

	public int getDeadline() {
		return deadline;
	}

	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}

	public List<Task> getWorkflow() {
		return workflow;
	}

	public void setWorkflow(List<Task> workflow) {
		this.workflow = workflow;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	
	
}
