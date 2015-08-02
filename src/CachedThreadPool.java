import java.util.concurrent.*;
public class CachedThreadPool {
	public static void main(String[] args) {
		ExecutorService exes=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			exes.execute(new LiftOff(10));
		exes.shutdown();
	}

}
