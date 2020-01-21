package chapter1.exercises;


import javax.swing.*;

public class DialogViewer_P1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("What's your name?");
		System.out.println("Hello "+ name +"!");
		System.exit(0);
	}
}
