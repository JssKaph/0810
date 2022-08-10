
public class AnnonymousInnerClassDemo2 {
	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("나는 쓰레드");
			}
		}; //세미콜론 주의
		t.run();
	}
}

// 기존의 클래스이기 때문에 익명

//class MyThread extends Thread{
//	@Override
//}