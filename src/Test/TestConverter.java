package Test;
import Currencies.Currency;
import Currencies.*;

public class TestConverter {
	public static void main(String[] args) {
		Currency example=new PEN();
		
		System.out.println("The following Prices are converts of PEN with others Currencies: ");
		System.out.println("The cash is: 100 soles");
		
		System.out.println("In dollars: "+example.convertUSDPerformance(100));
		System.out.println("In Yens: "+example.convertYENPerformance(100));
		System.out.println("In Euros: "+example.convertEURPerformance(100));
		System.out.println("In Pound sterlings: "+example.convertGBPPerformance(100));
		System.out.println("In South Korean Wons: "+example.convertKRWPerfomance(100));
		
		
	}
	
	
}
