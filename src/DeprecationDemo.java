import java.util.Date;

public class DeprecationDemo {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.getYear()); // getYear는 옛날 것이기 때문에 Deprecation을 건다.
	}
}
