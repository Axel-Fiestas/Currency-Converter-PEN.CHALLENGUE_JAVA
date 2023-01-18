package USD;

import Converts.ConvertToKRW;

public class ConvertUSDtoKRW implements ConvertToKRW {

	@Override
	public double convert(double quantity) {
		return quantity*1237.34;
	}

}
