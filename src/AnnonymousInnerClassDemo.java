//익명클래스, Car.java 연동

public class AnnonymousInnerClassDemo {
	public static void main(String[] args) {
		// 기존의 방법
//		Car car = new Car();
//		car.print();

		// 첫번째 방법, 상속을 받지 않으면서 재정의 할 수 있다.
//		Car car = new Car() {  // private와 public, static 사용 불가능
//			@Override // 메인 메소드 안에서 기존의 CarClass를 재정의 (자식을 만들지 않음)
//			public void print() {
//				System.out.println("Hello, Java World!!!");
//			}
//		}; // 세미콜론을 까먹지 말자. 
//		car.print(); // 재정의 된 "Hello, Java World!!! 나옴.

		
		MyInterface mi = new MyInterface() {
			@Override // 재정의
			public int calculate(int a, int b) {
				return a + b;
			}
		};
		int result = mi.calculate(5, 7);
		System.out.println("result = " + result);
		mi = new MyInterface() { // 기존의 있던 MyInterface를 재정의 (익명)
			@Override
			public int calculate (int a, int b) {
				return a*b;
			}
		};
		result = mi.calculate(5, 7);
		System.out.println("result = " + result);
	}
}
