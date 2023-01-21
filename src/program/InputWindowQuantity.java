package program;

import javax.swing.*;

public class InputWindowQuantity {
	
	
	public InputWindowQuantity() {
			 
		
        String inputNumber = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir", 0);
        
        if(inputNumber!=null) {
        	try{
        		double number= Double.parseDouble(inputNumber);
        		new ElectionWindowCurrency(number);
        	}catch(Exception ex) {
        		JOptionPane.showMessageDialog(null,
        			    "Valor  no válido.",
        			    "Error",
        			    JOptionPane.ERROR_MESSAGE);
        	}
        }	
	}
}
