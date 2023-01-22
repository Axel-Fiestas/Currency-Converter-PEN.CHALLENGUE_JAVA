package program;

import javax.swing.*;

public class MainMenuWindow{
	

	String electedOption;
	
	public MainMenuWindow(){
		String options[]= {
		"Conversor de moneda",
		"Conversor de temperatura"
		};
		
	     electedOption= (String)JOptionPane.showInputDialog(null, "Elije la opcion que deseas", 
	                "I like", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	     
	     if(electedOption!=null) {
	 	 	switch(electedOption){
	 			case "Conversor de moneda":
	 				new InputWindowQuantity();
	 				break;
	 			case "Conversor de temperatura":
	 				new InputTemperatureQuantity();
	 				break;
	 		}
	     }
	}
	

}
