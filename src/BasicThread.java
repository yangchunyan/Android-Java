
public class BasicThread {
	public static void main(String[] args) {
		Thread thread=new Thread(new LiftOff(10));
		thread.start();
		System.out.println("waiting...");
	}

}
