package program;

import javax.swing.JOptionPane;

public class ElectionWindowCurrency {
	
	String electedOption;

	public ElectionWindowCurrency(double quantity) {
		
		String options[]= {
		"De Soles a Dolar",
		"De Soles a Yen",
		"De Soles a Euros",
		"De Soles a Won Koreano",
		"De Soles a Libras",
		
		"De Dolar a Soles",
		"De Dolar a Yen",
		"De Dolar a Euros",
		"De Dolar a Won Koreano",
		"De Dolar  a Libras",
		
		"De Euros a Soles",
		"De Euros a Yen",
		"De Euros a Dolar",
		"De Euros a Won Koreano",
		"De Euros a Libras",
		
		"De Yen a Soles",
		"De Yen a Euros",
		"De Yen a Dolar",
		"De Yen a Won Koreano",
		"De Yen a Libras",
		
		"De Libras a Soles",
		"De Libras a Euros",
		"De Libras a Dolar",
		"De Libras a Won Koreano",
		"De Libras a Yen",
		
		"De Won Koreano a Soles",
		"De Won Koreano a Euros",
		"De Won Koreano a Dolar",
		"De Won Koreano a Libras",
		"De Won Koreano a Yen",
		
		};
		
	     electedOption= (String)JOptionPane.showInputDialog(null, "Elije la moneda en que deseas convertir tu dinero", 
	                "Choose Your Convert Currency", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	     
	     if(electedOption!=null) {
	    	 
	 	 	quantity=new CurrencyConvertSystem().converterQuantity(electedOption, quantity);
	 	 	
	 	 	quantity=Math.round(quantity*100.0)/100.0;
	 	 	
	 	 	JOptionPane.showMessageDialog(null,
	 	 		    "Tienes: "+quantity + " "+new CurrencyConvertSystem().getNameOfElectedCurrent(electedOption));
	     }
	}
}
