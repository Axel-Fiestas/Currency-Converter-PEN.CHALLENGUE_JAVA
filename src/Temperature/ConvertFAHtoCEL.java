package Temperature;

public class ConvertFAHtoCEL implements ConvertToCEL{

	@Override
	public double convert(double quantity) {
		return (quantity-32)/ 1.8;
	}

}
