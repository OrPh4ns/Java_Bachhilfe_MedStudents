package Anfang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Druckmich {
	public static void main(String[] args) {
		JFrame f = new JFrame("PMI");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b = new JButton("Druck mich !");
		b.setSize(50,50);

		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(f.getTitle().equals("PMI")) {
					f.setTitle("Hallo");
				}else {
					f.setTitle("PMI");
				}
			}
		});
		
		f.getContentPane().add(b);
		f.setSize(500,500);
		f.setVisible(true);
	}

}
