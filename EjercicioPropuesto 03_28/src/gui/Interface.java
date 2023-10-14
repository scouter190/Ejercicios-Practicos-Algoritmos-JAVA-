package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clases.*;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtCantidadDepartamentos;
	private JTextField txtCantidadPisos;
	private JTextField txtPrecioUnitario;
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
		setBounds(100, 100, 481, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEdificio = new JLabel("Edificio");
		lblEdificio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEdificio.setBounds(23, 11, 79, 28);
		contentPane.add(lblEdificio);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(222, 50, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtCantidadDepartamentos = new JTextField();
		txtCantidadDepartamentos.setBounds(222, 82, 86, 20);
		contentPane.add(txtCantidadDepartamentos);
		txtCantidadDepartamentos.setColumns(10);
		
		txtCantidadPisos = new JTextField();
		txtCantidadPisos.setBounds(222, 113, 86, 20);
		contentPane.add(txtCantidadPisos);
		txtCantidadPisos.setColumns(10);
		
		txtPrecioUnitario = new JTextField();
		txtPrecioUnitario.setBounds(222, 144, 86, 20);
		contentPane.add(txtPrecioUnitario);
		txtPrecioUnitario.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(23, 53, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNumeroDeDepartamentos = new JLabel("Numero De Departamentos");
		lblNumeroDeDepartamentos.setBounds(23, 82, 139, 20);
		contentPane.add(lblNumeroDeDepartamentos);
		
		JLabel lblCantidadPisosEdificio = new JLabel("Cantidad Pisos Edificio");
		lblCantidadPisosEdificio.setBounds(23, 115, 139, 17);
		contentPane.add(lblCantidadPisosEdificio);
		
		JLabel lblPrecioDelDepartamento = new JLabel("Precio del departamento en dolares");
		lblPrecioDelDepartamento.setBounds(23, 146, 181, 20);
		contentPane.add(lblPrecioDelDepartamento);
		
		txtS = new JTextArea();
		txtS.setBounds(23, 181, 414, 214);
		contentPane.add(txtS);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procesar();
			}
		});
		btnProcesar.setBounds(337, 112, 89, 23);
		contentPane.add(btnProcesar);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(337, 143, 89, 23);
		contentPane.add(btnNewButton);
	}
	
	void procesar(){
		int codigo = Integer.parseInt(txtCodigo.getText());
		int cantidadDepas = Integer.parseInt(txtCantidadDepartamentos.getText());
		int cantidadPisos = Integer.parseInt(txtCantidadPisos.getText());
		double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());
		
		Edificio e1 = new Edificio();
		
		 e1.setCantidadDepartamentos(cantidadDepas);
		 e1.setCantidadPisos(cantidadPisos);
		 e1.setCodigo(codigo);
		 e1.setPrecioDepartamentoDolares(precioUnitario);
		 
		 txtS.setText("Cant depas: " + e1.getCantidadDepartamentos() + "\n");
		 txtS.append("cant pisos: " + e1.getCantidadPisos() + "\n");
		 txtS.append("codigo: " + e1.getCodigo() + "\n");
		 txtS.append("precio unitario: " + e1.getPrecioDepartamentoDolares() + "\n");
		 txtS.append("precio del edificio: " + e1.getPrecioEdificioDolares() + "\n"+ "\n" );
		 
		 txtS.append("Aplicando Cambios" + "\n");
		 
		 e1.setPrecioDepartamentoDolares(e1.getPrecioDepartamentoDolares()*1.20);
		 
		 
		 txtS.append("Cant depas: " + e1.getCantidadDepartamentos() + "\n");
		 txtS.append("cant pisos: " + e1.getCantidadPisos() + "\n");
		 txtS.append("codigo: " + e1.getCodigo() + "\n");
		 txtS.append("precio unitario: " + e1.getPrecioDepartamentoDolares() + "\n");
		 txtS.append("precio del edificio: " + e1.getPrecioEdificioDolares()  ); 

	}
}
