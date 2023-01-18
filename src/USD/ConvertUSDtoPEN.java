package USD;

import Converts.ConvertToPEN;

public class ConvertUSDtoPEN implements ConvertToPEN{

	@Override
	public double convert(double quantity) {
		return quantity*3.83;
	}

}
