package USD;

import Converts.ConvertToEUR;

public class ConvertUSDtoEUR implements ConvertToEUR{

	@Override
	public double convert(double quantity) {
		return quantity*0.93;
	}

}
