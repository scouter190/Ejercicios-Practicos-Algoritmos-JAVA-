package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import clases.*;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
public class Interface extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
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
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 45, 404, 191);
		contentPane.add(scrollPane);
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	void procesar(){
		Factura f1 = new Factura();
		Factura f2 = new Factura("10731159306", "XtremeLabs ");
		Factura f3 = new Factura("10180706053","CESITAR",25,30);
		listado(f1);
		txtS.append("-------" + "\n");
		listado(f2);
		txtS.append("-------" + "\n");
		listado(f3);
		txtS.append("-------" + "\n");
		listado2(f3);
	}
	void listado(Factura x){
		txtS.append("RUC: " + x.getRUC() + "\n");
		txtS.append("Empresa: " + x.getEmpresa() + "\n");
		txtS.append("Unidades: " + x.getUnidades()+ "\n");
		txtS.append("Precio Unitario: "+ x.getPrecioUnitario()+ "\n");
	}
	void listado2(Factura x){
		txtS.append("Cantidad Facturas:" + Factura.getFacturasCreadas()+ "\n");
		txtS.append("Importes Facturados: " + Factura.getSumaImportesFacturados()+ "\n");
		txtS.append("Constante: " + Factura.getConstante()+ "\n");
	}
}
