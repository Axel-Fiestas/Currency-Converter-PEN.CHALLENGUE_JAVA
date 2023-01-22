package Temperature;

public class Degrees {
	protected ConvertToCEL celsius;
	protected ConvertToFAH fahrenheit;
	protected ConvertToKEL kelvin;
	
	public double convertToCelsiusPerformance(double quantity) {
		
		try{
			return celsius.convert(quantity);
		}catch(NullPointerException ex) {
			return quantity;
		}
	}
	
	public double convertToFahrenheitPerformance(double quantity){
		try{
			return fahrenheit.convert(quantity);
		}catch(NullPointerException ex) {
			return quantity;
		}
	}
	
	public double convertToKelvinPerformance(double quantity) {
		try{
			return kelvin.convert(quantity);
		}catch(NullPointerException ex) {
			return quantity;
		}
	}
	
	
	
}
