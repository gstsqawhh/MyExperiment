package cn.edu.nju.model;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ReadyTaskPool {
	
	private static Map<String,List<Task>> readyTaskPool = new ConcurrentHashMap<>();

	public static Map<String,List<Task>> getReadyTaskPool() {
		return readyTaskPool;
	}

	public static void setReadyTaskPool(Map<String,List<Task>> readyTaskPool) {
		ReadyTaskPool.readyTaskPool = readyTaskPool;
	}
	
	
	
}
