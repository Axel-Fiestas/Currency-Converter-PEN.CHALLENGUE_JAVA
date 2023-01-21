package program;

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;    

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
	 				System.out.println("Elegiste un conversor de monedas");
	 				InputWindowQuantity myWindown= new InputWindowQuantity();
	 				break;
	 			case "Conversor de temperatura":
	 				System.out.println("Elegiste un conversor de temperatura");
	 				break;
	 		}
	     }
	}
	

}
