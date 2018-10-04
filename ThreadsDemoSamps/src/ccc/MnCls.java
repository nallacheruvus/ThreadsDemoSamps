package ccc;

public class MnCls {
	public static void main(String[] args) {
		MyThread thr=new MyThread();
		for(int i=0;i<10;i++){
		thr.start();
		}
		new Runnable() {
			@Override
			public void run() {
				System.out.println("This is a sample thread");
			}
		}.run();
		for (int i = 0; i <10; i++) {
			new Runnable() {
				@Override
				public void run() {
					System.out.println("Thread running");
				}
			}.run();
		}
	}
}