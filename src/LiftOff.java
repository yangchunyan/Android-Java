
public class LiftOff implements Runnable{
	protected int countDown;
	private static int taskCount=0;
	private  int id=taskCount++;
	public LiftOff(int countDown){
		this.countDown=countDown;
	}
	public String status(){
		return "#"+id+"("+(countDown>0?countDown:"Liftoff")+")";
	}

	@Override
	public void run() {
		while(countDown-->0){
			System.out.println(status());
			Thread.yield();
		}
	}

}
