package Temperature;

public class ConvertKELtoCEL implements ConvertToCEL {

	@Override
	public double convert(double quantity) {
		return quantity+ 273.15;
	}
	
}
