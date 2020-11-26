package homework_1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class BingFa {
	public static void main(String[] args) {
		Task task = new Task();
		FutureTask<String> futureTask = new FutureTask<>(task);
		Thread a = new Thread(futureTask);
		a.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e1){
			e1.printStackTrace();
		}
		
		try {
			System.out.println("运行结果："+futureTask.get());
		}catch(InterruptedException e){
			e.getStackTrace();
		}catch(ExecutionException e){
			e.getStackTrace();
		}
	}
}
class Task implements Callable<String>{//带返回值的线程
	@Override
	public String call() throws Exception {
		Thread.sleep(300);
		int sum=0;
		for(int i=0;i<100;i++)
			sum+=1;
		return "运行进度: "+sum;
	}
}
