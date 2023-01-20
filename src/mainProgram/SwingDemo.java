package mainProgram;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;


public class SwingDemo {
	public static void main(String[] args) {
		JFrame f= new JFrame("UserForm"); //creates a Frame
		
		ImageIcon image2=new ImageIcon("src/logo.png");
		
		JLabel label=new JLabel(); //create a label
		label.setText("Hi my friend do you want to be my girlfriend?"); //set text of label
		label.setIcon(image2);
		
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER,RIGTH 
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM
		
		label.setForeground(Color.GREEN);//set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font of text
		
		label.setIconTextGap(-5);
		label.setBackground(Color.BLUE); //set background color
		label.setOpaque(true);//display background color
		
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text
		
		f.add(label);
		
		
		f.setTitle("Title xd");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		//f.setResizable(false);
		f.setVisible(true); //make frame visible
		//f.setSize(420,420); //Dimensions
		
		ImageIcon image=new ImageIcon("src/logo.png"); //create an ImageIcon
		f.setIconImage(image.getImage()); //change icon on frame
		f.getContentPane().setBackground(new Color(250,250,250)); //change color of background in rgb
		//f.getContentPane().setBackground(new Color(0xFFFFFF)); //change color of background in hexadecimal
		
		
		f.pack();

	}
}
