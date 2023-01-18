package EUR;

import Converts.ConvertToKRW;

public class ConvertEURtoKRW implements ConvertToKRW {

	@Override
	public double convert(double quantity) {
		return quantity*1335.31;
	}

}
