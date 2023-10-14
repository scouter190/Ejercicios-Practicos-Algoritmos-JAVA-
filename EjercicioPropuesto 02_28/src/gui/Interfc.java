package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import clases.*;

public class Interfc extends JFrame {

	private JPanel contentPane;
	private JTextArea txtS;
	public DecimalFormat df = new DecimalFormat("#.00");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfc frame = new Interfc();
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
	public Interfc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				procesar();
			}
		});
		btnProcesar.setBounds(10, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		txtS = new JTextArea();
		txtS.setBounds(20, 45, 505, 293);
		contentPane.add(txtS);
	}
	
	void procesar(){
		
		Computadora c1 = new Computadora(1, "asus", "rojo", 50);
		
		txtS.setText("cod: " + c1.getCodigo() + "\n");
		txtS.append("nombre: " + c1.getMarca() + "\n");
		txtS.append("Color: " + c1.getColor()+ "\n");
		txtS.append("Precio dolares: " + df.format(c1.getPrecioDolares()) + "\n");
		txtS.append("Precio Soles: " + df.format(c1.getPrecioSoles()) + "\n");
		txtS.append("Precio Euros: " + df.format(c1.getPrecioEuros())  + "\n" + "\n");
		
		c1.setPrecioDolares(c1.getPrecioDolares()/1.10);
		txtS.append("Realizando cambios" + "\n");
		txtS.append("cod: " + c1.getCodigo()+ "\n");
		txtS.append("nombre: " + c1.getMarca()+ "\n");
		txtS.append("Color: " + c1.getColor()+ "\n");
		txtS.append("Precio dolares: " + df.format(c1.getPrecioDolares()) + "\n");
		txtS.append("Precio Soles: " + df.format(c1.getPrecioSoles()) + "\n");
		txtS.append("Precio Euros: " + df.format(c1.getPrecioEuros()));
		
	}
	
	
	
	
}
