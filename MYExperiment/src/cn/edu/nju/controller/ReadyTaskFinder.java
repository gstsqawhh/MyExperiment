package cn.edu.nju.controller;


import java.util.List;
import java.util.Map;

import cn.edu.nju.model.Application;
import cn.edu.nju.model.CloudNet;
import cn.edu.nju.model.ReadyTaskPool;
import cn.edu.nju.model.Task;

public class ReadyTaskFinder implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		List<Application> applicationPool = CloudNet.getApplicationPool();
		for(Application app : applicationPool){
			List<Task> tasksOfApp = app.getWorkflow();
			for(Task task : tasksOfApp){
				List<Task> preTasks = task.getPreTasks();
				boolean isReady = true;
				for(Task preTask : preTasks){
					if(preTask.getFinishTime()<0){//比如：将task的初始完成时间设为-1
						isReady = false;
						break;
					}
				}
				if(isReady){
					Map<String,List<Task>> readyPool = ReadyTaskPool.getReadyTaskPool();
					if(readyPool.containsKey(app.getAppId())){
						readyPool.get(app.getAppId()).add(task);						
					}
					
				}
				
			}
			
			
		}
	}

}
