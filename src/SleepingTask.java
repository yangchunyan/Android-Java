import java.util.concurrent.*;
public class SleepingTask extends LiftOff{
	public SleepingTask(int countDown) {
		super(countDown);
	}
	public void run(){
		
			try {
				while(countDown-->0){
					System.out.println(status());
				TimeUnit.MILLISECONDS.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.err.println("Interrupted");
			}
		
			}
	public static void main(String[] args) {
		ExecutorService exes=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			exes.execute(new SleepingTask(10));
		exes.shutdown();
		
	}
	
}
	

