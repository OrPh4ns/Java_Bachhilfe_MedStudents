package Anfang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Change_Swing {

	public static void main(String[] args) {
		JFrame j = new JFrame("First Programm");
		j.setSize(300,200);
		JButton jb = new JButton("Press me");
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				j.setTitle("Changed");
				j.setSize(400,500);
			}
		});
		j.setVisible(true);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.add(jb);
	}

}
