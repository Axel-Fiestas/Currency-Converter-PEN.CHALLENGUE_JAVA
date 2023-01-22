package program;

import javax.swing.JOptionPane;

public class ElectionTemperatureDegrees {
	
	String electedOption;
	public ElectionTemperatureDegrees(double quantity) {
		
		String options[]= {
		"Grados Celcius a Grados Farenheit",
		"Grados Celcius a Grados Kelvin",
		"Grados Farenheit a Grados Celcius",
		"Grados Farenheit a Grados Kelvin",
		"Grados Kelvin a Grados Celcius",
		"Grados Kelvin a Grados Farenheit",
		};
		
	     electedOption= (String)JOptionPane.showInputDialog(null, "Elije una opcion de grados en temperatura", 
	                "Choose Your Temperature Degrees", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	     
	     if(electedOption!=null) {
	    	 
	 	 	quantity=new TemperatureDegreesConvertSystem().converterQuantity(electedOption, quantity);
	 	 	
	 	 	quantity=Math.round(quantity*100.0)/100.0;
	 	 	
	 	 	JOptionPane.showMessageDialog(null,
	 	 		    "Tienes: "+quantity + " "+new TemperatureDegreesConvertSystem().getNameOfElectedCurrent(electedOption));
	     }
	}
}
