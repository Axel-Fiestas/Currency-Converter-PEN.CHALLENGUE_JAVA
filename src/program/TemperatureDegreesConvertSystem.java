package program;

import Temperature.*;

public class TemperatureDegreesConvertSystem {
	
	Degrees cel=new Celsius();
	Degrees fah=new Fahrenheit();
	Degrees kel=new Kelvin();
	
	public double converterQuantity(String electedOption,double quantity) {

		double newValue;
		
		switch(electedOption){
 	 	
 	 	case "Grados Celcius a Grados Farenheit":
 	 		newValue=cel.convertToFahrenheitPerformance(quantity);
 	 		break;
 	 		
 	 	case "Grados Celcius a Grados Kelvin":
 	 		newValue=cel.convertToKelvinPerformance(quantity);
 	 		break;
 	 		
 	 	case "Grados Farenheit a Grados Celcius":
 	 		newValue=fah.convertToCelsiusPerformance(quantity);
 	 		break;
 	 		
 	 	case "Grados Farenheit a Grados Kelvin":
 	 		newValue=fah.convertToKelvinPerformance(quantity);
 	 		break;
 	 		
 	 	case "Grados Kelvin a Grados Celcius":
 	 		newValue=kel.convertToCelsiusPerformance(quantity);
 	 		break;
 	 		
 	 	case "Grados Kelvin a Grados Farenheit":
 	 		newValue=kel.convertToFahrenheitPerformance(quantity);
 	 	default:
 	 		newValue=0;
 	 		
 	 	}
		return newValue;
	}
	
	
	public String getNameOfElectedCurrent(String electedOption) {
		
		String nameCurrency="Grados";
		
		
//		"Grados Celcius a Grados Farenheit",
//		"Grados Celcius a Grados Kelvin",
//		"Grados Farenheit a Grados Celcius",
//		"Grados Farenheit a Grados Kelvin",
//		"Grados Kelvin a Grados Celcius",
//		"Grados Kelvin a Grados Farenheit",
		
		if (electedOption.contains("a Grados Celcius")){
			nameCurrency="Grados Celcius";
		}else if(electedOption.contains("a Grados Kelvin")){
			nameCurrency="Grados Kelvin";	
		}else if(electedOption.contains("a Grados Farenheit")){
			nameCurrency="Grados Farenheit";
		}
		
		return nameCurrency;
		
	}
}
