/*
 * 멤버는 static에 연결할 수 있으나,
 * static은 멤버에 연결할 수 없다, 주소를 이용해서 멤버에 연결할 수 있다.
 * 스태틱은 멤버에 접근 x 생성이안됬음
 *	멤버는 스태틱에 접근 o 이미 메모리에올라와 있음
 * 멤버, 멤버메소드는 항상 주소가 필요함
 */
public class StaticInnerClassDemo {
	public static void main(String[] args) {
//		OuterClass.print();
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		System.out.println(inner.avg);
//		System.out.println(OuterClass.InnerClass.flag);
		inner.show();
	}
}
