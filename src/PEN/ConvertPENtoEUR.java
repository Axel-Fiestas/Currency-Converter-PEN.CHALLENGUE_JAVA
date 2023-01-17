package PEN;

import Converts.ConvertToEUR;

public class ConvertPENtoEUR implements ConvertToEUR{
	@Override
	public double convert(double quantity) {
		return quantity*0.24;
	}
}
