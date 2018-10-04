package ccc;

public class ClassA extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			new Runnable() {
				
				@Override
				public void run() {
					System.out.println("hai");
				}
			}.run();
		}
		
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}

}
