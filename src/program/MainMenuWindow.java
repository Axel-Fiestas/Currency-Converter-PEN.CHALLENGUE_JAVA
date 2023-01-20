package program;

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;    

public class MainMenuWindow implements ActionListener{
	
	
	JFrame frame;
	JButton btnAccept;
	JButton btnCancel;
	JComboBox cmbOptions;
	
	public MainMenuWindow(){
		
		//Buttons
		btnAccept=new JButton("Accept");
		btnAccept.addActionListener(this);
		
		btnCancel=new JButton("Cancel");
		btnCancel.addActionListener(e->{
			frame.dispose();
		});
		
		//Text Label
		JLabel mainLabel=new JLabel("Seleccione una opción de conversión");
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//ComboBox
		String options[]= {
		"Conversor de moneda",
		"Conversor de temperatura"
		};
		cmbOptions=new JComboBox(options);
		
		//Panels
		JPanel panel=new JPanel();
		
		GridBagLayout layout=new GridBagLayout();
		panel.setLayout(layout);
		GridBagConstraints gbc= new GridBagConstraints();
		
		gbc.fill= GridBagConstraints.HORIZONTAL;
		
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=2;
		panel.add(mainLabel,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.gridwidth=2;
		panel.add(cmbOptions,gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		panel.add(btnAccept,gbc);
		
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth=1;
		panel.add(btnCancel,gbc);
		
		//Main Frame
		frame=new JFrame();
		frame.setTitle("Menu Principal");
		
		//Frame Options
//		frame.setLayout(new FlowLayout());
//		frame.setLayout(null); 
	    frame.add(panel);
	    frame.setSize(400,500);    
	    frame.setVisible(true);  
	    panel.getRootPane().setDefaultButton(btnAccept);//default button 
	   
		frame.pack();
	}
	
	public static void main(String[] args) {
		new MainMenuWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnAccept) {
			
			switch(cmbOptions.getSelectedIndex()){
				case 0:
					System.out.println("Elegiste un conversor de monedas");
					break;
				case 1:
					System.out.println("Elegiste un conversor de temperatura");
					break;
			}
//			System.out.println(cmbOptions.getSelectedItem());			
//			System.out.println(cmbOptions.getSelectedIndex());			
		}
	}
}
