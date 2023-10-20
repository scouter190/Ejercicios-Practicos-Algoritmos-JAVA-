package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Obrero;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.LineNumberInputStream;
import java.awt.event.ActionEvent;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextArea txtS;
	private JButton btnAumentar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				procesar();			}
		});
		btnProcesar.setBounds(10, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		txtS = new JTextArea();
		txtS.setBounds(20, 52, 408, 346);
		contentPane.add(txtS);
		
		btnAumentar = new JButton("Aumentar");
		btnAumentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAumentar.setBounds(202, 11, 89, 23);
		contentPane.add(btnAumentar);
	}
	void procesar(){
		
		Obrero o1 = new Obrero(15,"Cesar",20,15.0);
		
		txtS.setText("Codigo: " + o1.getCodigo() + "\n");
		txtS.append("Nombre: " + o1.getNombre() + "\n");
		txtS.append("Horas: " + o1.getHorasTrabajadas() + "\n");
		txtS.append("Tarifa: " + o1.getTarifaHora() + "\n");
		txtS.append("Sueldo Bruto: "+ o1.getSueldoBruto()+ "\n");
		txtS.append("AFP: " + o1.getDescuentoAFP()+ "\n");
		txtS.append("EPS: "+ o1.getDescuentoEPS()+ "\n");
		txtS.append("Sueldo Neto: " + o1.getSueldoNeto()+ "\n");
		
		o1.setHorasTrabajadas(o1.getHorasTrabajadas()+8);
		o1.setTarifaHora(o1.getTarifaHora()/1.15);
		
		txtS.append("---------------------" + "\n");
		txtS.append("Codigo: " + o1.getCodigo() + "\n");
		txtS.append("Nombre: " + o1.getNombre() + "\n");
		txtS.append("Horas:  " + o1.getHorasTrabajadas() + "\n");
		txtS.append("Tarifa: " + o1.getTarifaHora() + "\n");
		txtS.append("Sueldo Bruto: "+ o1.getSueldoBruto()+ "\n");
		txtS.append("AFP: " + o1.getDescuentoAFP()+ "\n");
		txtS.append("EPS: "+ o1.getDescuentoEPS()+ "\n");
		txtS.append("Sueldo Neto: " + o1.getSueldoNeto()+ "\n");
		
	}

}



