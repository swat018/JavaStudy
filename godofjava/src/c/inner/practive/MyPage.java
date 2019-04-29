package c.inner.practive;

public class MyPage {
	InputBox input;														// input이라는 이름의 InputBox 클래스 변수 선언
	
	public static void main(String[] args) {
		MyPage page = new MyPage();
		page.setUI();
		page.pressKey();
	}
	
	public void setUI() {												// setUI()라는 리턴값이 없는 메소드
		input = new InputBox();											// intput 객체 초기화
		KeyEventListener listener  = new KeyEventListener() {			// KeyEventListener 인터페이스를 구현한 익명클래스
			public void onKeyDown() {
				System.out.println("Key Down");
			}
			public void onKeyUp() {
				System.out.println("Key Up");
			}
		};
		input.setKeyListener(listener);									// 생성한 listener를 input 객체의 setKeyListener() 메소드에 매개변수로 넣어준다.	
	}
	
	public void pressKey() {											
		input.listenerCalled(InputBox.KEY_DOWN);
		input.listenerCalled(InputBox.KEY_UP);
	}
	
}
