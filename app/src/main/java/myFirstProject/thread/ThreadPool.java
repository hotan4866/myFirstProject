package myFirstProject.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {

	public void run() {
		// TODO Auto-generated method stub
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for(int i = 0;i<10;i++) {
			
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					ThreadPoolExecutor threadPoolExecutor 
						= (ThreadPoolExecutor)executorService;
					
					
				}
			};
			
		}
		
		
	}
	
	

}
