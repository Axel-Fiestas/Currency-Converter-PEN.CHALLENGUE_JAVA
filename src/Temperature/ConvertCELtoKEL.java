package Temperature;

public class ConvertCELtoKEL implements ConvertToKEL{

	@Override
	public double convert(double quantity) {
		return quantity+ 273.15;
	}

}
