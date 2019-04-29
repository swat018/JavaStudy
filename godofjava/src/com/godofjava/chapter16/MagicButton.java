package com.godofjava.chapter16;

public class MagicButton {
	public MagicButton() {
		
	}
	private EventListener listener;
	public void setListener(EventListener listener) {
		this.listener = listener;
	}
	public void onClickProcess() {
		if(listener!=null) {
			listener.onClick();
		}
	}
}
