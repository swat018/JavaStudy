package com.godofjava.chapter6;

public class ControlWhile {

	public static void main(String[] args) {
		ControlWhile control = new ControlWhile();
		control.whileLoop1();
		control.whileLoop2();
		control.whileBreak();
		control.whileContinue();
	}
	
	public void whileLoop1() {
		ControlSwitch control = new ControlSwitch();
		int loop = 0;
		while(loop < 12) {
			loop++;
			control.switchCalendar(loop);
		}
	}
	public void whileLoop2() {
		ControlSwitch control = new ControlSwitch();
		int loop = 0;
		while(loop < 12) {
			loop++;
			control.switchCalendar(loop);
			if(loop == 6) loop=100;
		}
	}
	public void whileBreak() {
		ControlSwitch control = new ControlSwitch();
		int loop = 0;
		while(loop < 12) {
			loop++;
			control.switchCalendar(loop);
			if(loop == 6) break;
		}
	}
	public void whileContinue() {
		ControlSwitch control = new ControlSwitch();
		int loop = 0;
		while(loop < 12) {
			loop++;
			if(loop==6) continue;
			control.switchCalendar(loop);
			
		}
	}
}
