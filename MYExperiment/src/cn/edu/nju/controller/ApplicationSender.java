package cn.edu.nju.controller;

import cn.edu.nju.model.Application;
import cn.edu.nju.model.CloudNet;

public class ApplicationSender implements Runnable {
	private int time = 0;
	@Override
	public void run() {
		
		while(true){//或者判断文件中是否还有文件
			try {
				Thread.sleep(1000);
				time++;
				//遍历文件发现是否有到达时间为当前time的Application
				//如果有，首先通过列表构建该workflow Application，将该Application加入ApplicationPool中
				Application application = new Application();
				CloudNet.getApplicationPool().add(application);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
