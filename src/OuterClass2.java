// 지역변수 안의 이너클래스
/*
 * 1. 생성방법
 *  -지역클래스가 속해있는 메소드가 호출되어야 하고,
 *  -해당 메소드 내에서 클래스 선언이 먼저, 그 다음 생성자로 생성
 * 2. 제한 사항
 *  1) 접근제한자를 사용할 수 없다. 지역변수와 동일
 *  2) static 사용 불가. 지역변수와 동일
 *  3) static 변수/ static 메소드를 가질 수 없다.
 */

public class OuterClass2 {
	private String name = "한지민"; // Outter 클래스의 멤버 변수
	private static int age = 26; // Outter 클래스의 스태틱변수

	public void display() { // 아우터클래스의 멤버 메소드

	}

	public static void print() { // 아우터클래스 스태틱 메소드

	}

	public void mymethod() { // 아우터 클래스의 멤버 메소드
		boolean flag = true; // 지역변수
		class InnerClass2 { // 이너 클래스
			private double avg = 89.5; // 이너클래스 멤버변수
//			private static char grade = 'C'; // 이너클래스 스태틱변수 (사용불가)

			public void repair() {
				// System.out.println("나는 로컬 이너 클래스의 멤버 메소드"); // 이너클래스 멤버 메소드
				// System.out.println("나이 = "+ age); // 멤버이기 때문에 바깥쪽에 접근 가능
				// System.out.println("flag = " + flag); // 지역변수에도 접근 가능
			}
//			public static void sort() {} // 이너클래스 스태틱 메소드 (사용불가)
		}
		InnerClass2 inner = new InnerClass2();
		inner.repair();
	}
}
