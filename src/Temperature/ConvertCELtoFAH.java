package Temperature;

public class ConvertCELtoFAH implements ConvertToFAH{

	@Override
	public double convert(double quantity) {
		return (quantity*1.8)+32;
	}
	
}
