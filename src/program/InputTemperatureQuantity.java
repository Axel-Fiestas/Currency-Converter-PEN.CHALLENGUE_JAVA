package program;

import javax.swing.JOptionPane;

public class InputTemperatureQuantity {
	
	public InputTemperatureQuantity(){
        String inputNumber = JOptionPane.showInputDialog("Ingrese la cantidad de temperatura que desea convertir", 0);
        
        if(inputNumber!=null) {
        	try{
        		double number= Double.parseDouble(inputNumber);
        		new ElectionTemperatureDegrees(number);
        	}catch(Exception ex) {
        		JOptionPane.showMessageDialog(null,
        			    "Valor  no válido.",
        			    "Error",
        			    JOptionPane.ERROR_MESSAGE);
        	}
        }	
	}
}
