package com.currencycoversion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;


//Java Swing GUI Currency Converter
public class USDConversion extends JFrame implements ActionListener{
	
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;
	private JLabel lblNewLabel_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					USDConversion frame = new USDConversion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public USDConversion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(103, 123, 104, 21);
		contentPane.add(textField);
		
		String[] choices = {" ", "Dollars to Rupees", "Dollars to Yen", "Dollars to Pesos","Dollars to Rubles"};
		
		comboBox = new JComboBox<Object>(choices);
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		comboBox.setBounds(223, 122, 113, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Enter a Number to Convert");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(122, 83, 203, 34);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(173, 155, 104, 34);
		contentPane.add(lblNewLabel_1);
		comboBox.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();
		double x = Double.parseDouble(text);
		
		if(e.getSource()==comboBox) {
			
			
			String selected = comboBox.getSelectedItem().toString();
			
			if (selected.equalsIgnoreCase("Dollars to Rupees")) {
				
			x = x*82.88;
			
			String s = Double.toString(x);
			int result = s.indexOf(".");
			String output = s.substring(0, result+3);
			lblNewLabel_1.setText(output + " Rupees");
			
		
			}
			
			else if (selected.equalsIgnoreCase("Dollars to Yen"))
			{
				
				x = x*131.16;
				
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0, result+3);
				lblNewLabel_1.setText(output + " Yen");
				
			}
			
else if (selected.equalsIgnoreCase("Dollars to Pesos")) {
				
				x = x*18.97;
				
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0, result+3);
				lblNewLabel_1.setText(output + " Pesos");
			}
			
else if (selected.equalsIgnoreCase("Dollars to Rubles")) {
	
	x = x*71.79;
	
	String s = Double.toString(x);
	int result = s.indexOf(".");
	String output = s.substring(0, result+3);
	lblNewLabel_1.setText(output + " Rubles");
}
			
		}
		
	}
}
