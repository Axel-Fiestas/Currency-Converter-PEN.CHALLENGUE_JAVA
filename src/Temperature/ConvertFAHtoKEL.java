package Temperature;

public class ConvertFAHtoKEL implements ConvertToKEL{

	@Override
	public double convert(double quantity) {
		return ((5/9) *(quantity - 32)) + 273.15;
	}
	
}
