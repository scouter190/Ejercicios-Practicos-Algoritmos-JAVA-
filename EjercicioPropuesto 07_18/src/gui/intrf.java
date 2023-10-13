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

public class intrf extends JFrame {

	private JPanel contentPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					intrf frame = new intrf();
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
	public intrf() {
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
		txtS.setBounds(10, 45, 414, 205);
		contentPane.add(txtS);
	}
	
	void procesar(){
		
		Numeros c1 = new Numeros(10,15,15);
		
		txtS.setText("EL NRO MENOR " + c1.calcularNumeroMenor() + "\n");
		txtS.append("el nro mayor " + c1.calcularNumeroMayor() + "\n");
		txtS.append("el nro intermedio " + c1.calcularNumeroIntermedio() + "\n");
	}
}
