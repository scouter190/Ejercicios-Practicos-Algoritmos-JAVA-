package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clases.*;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextArea txtS;

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
		setBounds(100, 100, 467, 323);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 45, 421, 210);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
		
	void procesar(){
		
		Video v1 = new Video(15, "Cesar", 15.0, 25.0, 3.8);
		listado(v1);
		
		v1.setPrecioSoles(v1.getPrecioSoles()+5.50);
		listado(v1);
	}
	void listado(Video x){
		txtS.append("codigo: "+ x.getCodigo() + "\n");
		txtS.append("nombre Video: "+ x.getNombre()+ "\n");
		txtS.append("duracion: " + x.getDuracion()+ "\n");
		txtS.append("precio en soles: "+ x.getPrecioSoles()+ "\n");
		txtS.append("tipo de cambio: " + x.getTipoCambio()+ "\n");
		txtS.append("--------------------------" + "\n"+ "\n");
	}
}
