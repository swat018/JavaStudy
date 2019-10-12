package com.godofjava.chapter25;

public class TimerMain {

	public static void main(String[] args) {
		TimerThread thread = new TimerThread();
		thread.start();
	}

}
