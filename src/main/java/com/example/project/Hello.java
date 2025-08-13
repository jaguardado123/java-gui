package com.example.project;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Hello {
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("Hello World GUI");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300, 100);
			frame.add(new JLabel("Hello World", JLabel.CENTER));
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		});
	}

}

