package mainProgram;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame2 extends JFrame implements ActionListener{
	
	JComboBox comboBox;
	
	MyFrame2(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals= {"dog","cat","bird"};
		comboBox=new JComboBox(animals);
		
		
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==comboBox) {
			System.out.println(e.getSource());
		}
		// TODO Auto-generated method stub
		
	}
	
}
