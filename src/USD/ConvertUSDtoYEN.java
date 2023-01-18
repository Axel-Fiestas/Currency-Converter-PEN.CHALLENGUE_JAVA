package USD;

import Converts.ConvertToYEN;

public class ConvertUSDtoYEN implements ConvertToYEN {

	@Override
	public double convert(double quantity) {
		return quantity*128.22;
	}

}
