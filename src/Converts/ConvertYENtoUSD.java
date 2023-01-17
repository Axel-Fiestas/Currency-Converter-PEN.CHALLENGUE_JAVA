package Converts;

public class ConvertYENtoUSD implements ConvertToUSD {
	@Override
	public double convert(double quantity) {
		return quantity*0.0078;
	}

}
