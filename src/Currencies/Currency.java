package Currencies;
import Converts.ConvertToEUR;
import Converts.ConvertToGBP;
import Converts.ConvertToPEN;
import Converts.ConvertToUSD;
import Converts.ConvertToYEN;

public abstract class Currency {
	
	protected ConvertToUSD dolar;
	protected ConvertToYEN yen;
	protected ConvertToPEN pen;
	protected ConvertToEUR eur;
	protected ConvertToGBP gbp;
	
	public double convertUSDPerformance(double quantity) {
		try{
			return dolar.convert(quantity);
		}catch(NullPointerException ex) {
			return quantity;
		}
		
	}
	
	public double convertYENPerformance(double quantity) {
		try {
			return yen.convert(quantity);
		}catch(NullPointerException ex) {
			return quantity;
		}
		
	}
	
	public double convertPENPerformance(double quantity) {
		try {
			return pen.convert(quantity);
		}catch(NullPointerException ex) {
			return quantity;
		}
		
	}
	
	public double convertEURPerformance(double quantity) {
		try {
			return eur.convert(quantity);
		}catch(NullPointerException ex) {
			return quantity;
		}
	}
	
	public double convertGBPPerformance(double quantity) {
		try {
			return gbp.convert(quantity);
		}catch(NullPointerException ex) {
			return quantity;
		}
	}
	
}
