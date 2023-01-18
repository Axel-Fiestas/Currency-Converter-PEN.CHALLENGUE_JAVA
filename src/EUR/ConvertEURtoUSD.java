package EUR;

import Converts.ConvertToUSD;

public class ConvertEURtoUSD implements ConvertToUSD {

	@Override
	public double convert(double quantity) {
		// TODO Auto-generated method stub
		return quantity*1.08;
	}

}
