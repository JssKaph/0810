import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnnonymousInnerClassDemo1 {
	public static void main(String[] args) { 
		List<Product> list =
				Arrays.asList(new Product("볼펜", 200),
						new Product("키보드", 10000),
						new Product("연필", 100),
						new Product("마우스", 5000));
		
		//새로운 방법
		Collections.sort(list, new Comparator<Product>() {
			@Override
			public int compare(Product front, Product back) {
				return front.price - back.price;
				
			} // 괄호 안에 클래스 넣기 Comparator 익명 클래스
		}); // sort 메소드 끝
		System.out.println(list);
	}
}