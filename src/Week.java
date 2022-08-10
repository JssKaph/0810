
/*
 * 1. Class : 멤버변수, 멤버상수, 스태틱 변수, 스태틱 상수 다 가질 수 있다.
 * 2. Interface : 스태틱 상수 만 가진다. public static final이 생략된 상수
 * 3. enum : 타입을 쓰지 않는다.
 */

public class Week {
	public static void main(String[] args) {
		
	}
}
// x
enum Weekable{
	SUN("SUN", 0), MOM("MON", 1), TUE("TUE", 2), WED ,THU, FRI, SAT; // 타입이 없다.
}