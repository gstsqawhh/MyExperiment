package cn.edu.nju.model;

import java.util.ArrayList;
import java.util.List;

public class Task {
	
	private int startTime;
	
	private int finishTime;
	
	private int inputDataSize;
	
	private int workload;
	
	private int deadline;
	
	private int arrivalTime;
	
	private boolean hasAllocated;
	
	private int type;
	
	TaskStatue taskStatue;
	
	private List<Task> preTasks = new ArrayList<>();

	private List<Task> postTasks = new ArrayList<>();

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}

	public boolean isHasAllocated() {
		return hasAllocated;
	}

	public void setHasAllocated(boolean hasAllocated) {
		this.hasAllocated = hasAllocated;
	}

	public List<Task> getPreTasks() {
		return preTasks;
	}

	public void setPreTasks(List<Task> preTasks) {
		this.preTasks = preTasks;
	}

	public List<Task> getPostTasks() {
		return postTasks;
	}

	public void setPostTasks(List<Task> postTasks) {
		this.postTasks = postTasks;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getInputDataSize() {
		return inputDataSize;
	}

	public void setInputDataSize(int inputDataSize) {
		this.inputDataSize = inputDataSize;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	public int getDeadline() {
		return deadline;
	}

	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
}
