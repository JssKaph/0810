/**
 * 
 * @author <font size='7' color='green'>JSS<font>
 * @version <b>1.O</b>
 * @since <i>2022-08-01</i>
 * 
 * 
 */

 
public enum Season {
	SPRING(100), SUMMER(500), FALL(1000), WINTER(10000);
	
	private int value;
	Season(int value){ //생성자라고 public을 사용하면 오류가 생김
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
}
