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
	private JButton btnNewButton;
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
		setBounds(100, 100, 551, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		btnNewButton = new JButton("Procesar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				procesar();
				
			}
		});
		btnNewButton.setBounds(10, 23, 89, 23);
		contentPane.add(btnNewButton);
		
		txtS = new JTextArea();
		txtS.setBounds(20, 57, 485, 265);
		contentPane.add(txtS);
		
	}
	
	void procesar(){
		
		Celular c1 = new Celular(985, "Cesar", 15, 20);
		
		txtS.setText("num: " + c1.getNumero() + "\n");
		txtS.append("usuario: " + c1.getUsuario()+ "\n");
		txtS.append("seg: "+ c1.getSegundosConsumidos()+ "\n");
		txtS.append("precio: " + c1.getPrecioPorSegundo()+ "\n");
		txtS.append("costo: " + c1.getCostoPorConsumo()+ "\n");
		txtS.append("impuesto: " + c1.getImpuestoIGV()+ "\n");
		txtS.append("total: " + c1.getTotalPagar()+ "\n" + "\n"+ "\n");
		
		c1.setSegundosConsumidos(c1.getSegundosConsumidos()+20);
		c1.setPrecioPorSegundo(c1.getPrecioPorSegundo()/1.05);
		
		txtS.append("seg: "+ c1.getSegundosConsumidos()+ "\n");
		txtS.append("precio: " + df.format(c1.getPrecioPorSegundo())+ "\n");
		txtS.append("costo: " + df.format(c1.getCostoPorConsumo())+ "\n");
		txtS.append("impuesto: " + df.format(c1.getImpuestoIGV()) + "\n");
		txtS.append("total: " + df.format(c1.getTotalPagar())+ "\n");
	}
}
