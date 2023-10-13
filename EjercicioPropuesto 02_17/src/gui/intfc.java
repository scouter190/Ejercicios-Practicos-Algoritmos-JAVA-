package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Filmacion;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class intfc extends JFrame {

	private JPanel contentPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					intfc frame = new intfc();
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
	public intfc() {
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
		txtS.setBounds(10, 43, 414, 207);
		contentPane.add(txtS);
	}
	
	void procesar(){
		
		Filmacion f1 = new Filmacion(1, "Poto", 15, 25);
		
		txtS.setText("El cod" + f1.codigo + "\n");
		txtS.append("Titulo" + f1.titulo + "\n");
		txtS.append("La duracion es:" + f1.duracionMinutos + "\n");
		txtS.append("El precio en soles:" + f1.precioSoles + "\n");
		txtS.append("El precio en DOlares:" + f1.precioDolares());
		
		
	}
}
