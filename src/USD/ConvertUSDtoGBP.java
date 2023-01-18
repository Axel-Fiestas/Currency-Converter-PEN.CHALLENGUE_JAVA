package USD;

import Converts.ConvertToGBP;

public class ConvertUSDtoGBP implements ConvertToGBP {
	@Override
	public double convert(double quantity) {
		// TODO Auto-generated method stub
		return quantity*0.81;
	}

}
