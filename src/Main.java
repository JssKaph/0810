/*
 * 1.package
 * 	 -생성된 클래스나 인터페이스나 enum -> 참조형 타입객체들을 분류해서 저장하는 방법 
 *  -javac -d <path> : package의 시작 폴더는 -d 옵션의 경로에 생성된다.
 * 2.import
 *  -com을 찾는 위치 : 
 *  1) 현재의 디렉토리 ,같은 폴더
 *  2) Referenced library에서 찾고 
 *  3) classpath에서 찾고  못건듦
 *  4) Class Not Found
 */ 


//import com.example.libs.Car; //.*; 을 사용하기 위해선 마지막 하위폴더에서 찍어줘야한다.
import com.example.finance.Money;
import com.example.product.Ballpen;

public class Main{
    public static void main(String args[]){
//        Car sonata = new Car("Silver Sonata");
    	com.example.libs.Car sonata = new com.example.libs.Car("Silver Sonata"); // 한번에 불러오기도 가능 FQDN (전체경로)
        System.out.println(sonata); //sonata.toString()
        
        Ballpen monami = new Ballpen();
        System.out.println(monami.name);
        
        com.example.finance.Money money = new com.example.finance.Money();
        System.out.println(money.balance);
    }
}
