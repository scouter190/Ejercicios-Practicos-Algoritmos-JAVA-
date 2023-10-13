package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clases.*;


public class intrfc extends JFrame {

	private JPanel contentPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					intrfc frame = new intrfc();
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
	public intrfc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		txtS.setBounds(20, 45, 404, 205);
		contentPane.add(txtS);
	}
	
	void procesar(){
		Trabajador t1 = new Trabajador(25,"cesar", 25,15);
		
		txtS.setText("El codigo es:" + t1.codigo + "\n");
		txtS.append("El nombre es:" + t1.nombre + "\n");
		txtS.append("las horas trabajadas:" + t1.horasTrabajadas + "\n");
		txtS.append("la tarifa horaria es:" + t1.tarifaHoraria + "\n");
		txtS.append("El sueldo bruto:" + t1.sBruto() + "\n");
		txtS.append("El descuento es" + t1.calcularDescuento() + "\n" );
		txtS.append("El sueldo neto es: " + t1.sNeto() + "\n");
	}
	
}
