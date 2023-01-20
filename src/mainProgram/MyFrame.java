package mainProgram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	
	MyFrame(){
		
		button= new JButton();
		button.setBounds(100,100,250,100);
//		button.addActionListener(e ->{
//			System.out.println("Waos");
//		});
		button.setText("I´m a buton");
		button.setFocusable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		
		this.add(button);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			System.out.println("Perrolol");
		}
		// TODO Auto-generated method stub
		
	}
}
