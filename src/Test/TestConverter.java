package Test;
import Currencies.Currency;
import Currencies.PEN;

public class TestConverter {
	public static void main(String[] args) {
		Currency example=new PEN();
		
		System.out.println(example.convertUSDPerformance(89));
		
		System.out.println(example.convertPENPerformance(89));
			
	}
	
	
}
