package ar.com.unpaz.hilos;

public class Hilo3 extends Thread {
	
	public synchronized void run() {
		for (int i=0; i<10; i++) {
			System.out.print("E");
			try {
				Hilo3.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
