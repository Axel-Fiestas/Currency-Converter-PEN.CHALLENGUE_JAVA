package Temperature;

public class ConvertKELtoFAH implements ConvertToFAH{

	@Override
	public double convert(double quantity) {
		return (1.8*(quantity-273.15))+ 32;
	}

}
