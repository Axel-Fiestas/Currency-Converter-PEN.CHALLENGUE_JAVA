package program;

import javax.swing.JOptionPane;

public class ExecutableProgram {
	public static void main(String[] args) {
		
		Boolean running=true;
		
		while(running) {
			new MainMenuWindow();
			int input = JOptionPane.showConfirmDialog(null, "Desea Continuar?");
			
			if(input==1 || input==2) {
				running=false;
				JOptionPane.showMessageDialog(null,"Programa finalizado.");
			}
		}
		
	}
}
