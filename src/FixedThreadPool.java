import java.util.concurrent.*;
public class FixedThreadPool {
	public static void main(String[] args) {
		ExecutorService exes=Executors.newFixedThreadPool(1);
		for(int i=0;i<5;i++)
			exes.execute(new LiftOff(10));
		exes.shutdown();
//		String string="eeee";
//		int id=6;
//		System.out.println(string+id);
	}

}
