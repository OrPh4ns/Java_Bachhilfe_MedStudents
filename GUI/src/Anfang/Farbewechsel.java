package Anfang;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Farbewechsel {
	Container c;
	JButton b;
	
	public Farbewechsel() {
		b = new JButton("Wechseln .. ");
		c.add(b,BorderLayout.NORTH);
		ActionListener lb = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				float zufall = (float) Math.random();
				Color grauten = new Color(zufall,zufall,zufall);
				c.setBackground(grauten);
			}
		};
		b.addActionListener(lb);
	}
	
	

}
