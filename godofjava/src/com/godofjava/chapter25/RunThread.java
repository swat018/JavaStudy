package com.godofjava.chapter25;

public class RunThread {

	public static void main(String[] args) {
		RunThread sample = new RunThread();
		sample.runBasic();
	}
	public void runBasic() {
		RunnableSample runnable = new RunnableSample();
		new Thread(runnable).start();
		
		ThreadSample thread = new ThreadSample();
		thread.start();
		System.out.println("RunThrad.runBasic() method is ended.");
	}

}
