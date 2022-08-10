/* 
 * 1. 생성법 : 바깥클래스의 주소.new 안쪽클래스 생성자()
 * 2. 재한사항 : MemberInnerClass는 static 변수와 static method를 가질 수 없다.
 */
public class OuterClass1 {
	private String name = "한지민"; // outer class의 멤버변수
	private static int age = 26; // outer class의 스태틱변수

	public void display() { // outer class의 멤버메소드
		System.out.println("name =" + this.name);
	}

	public static void print() { // 바깥쪽이라 super와 this 못씀
		System.out.println("age = " + age);
	}

	public static class InnerClass1 { // static inner class
		public double avg = 89.5; // InnerClass의 멤버변수
//		public static boolean flag = true; // InnerClass의 static 변수
		public void show() { // InnerClass의 멤버 메소드;
//			display();
//			print();  
//			System.out.println("age = "+age);
//			System.out.println("이름 = " + name);		
		}
//		public static void 출력하다() { // Inner Class Static Method]
//			System.out.println("나이 = " + name );
//		}
	}
}
