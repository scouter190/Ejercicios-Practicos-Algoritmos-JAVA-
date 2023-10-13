import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import clases.*;
import clases.Persona;


public class gui extends JFrame {

	private JPanel contentPane;
	private JTextField txtDNI;
	private JTextField txtApellidoPaterno;
	private JTextField txtApellidoMaterno;
	private JTextField txtNombres;
	private JTextField txtFechaNacimiento;
	private JTextArea txtS;
	private JButton btnGrabar;
	private JLabel lblNota;
	private JLabel lblNota_1;
	private JLabel lblNota_2;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
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
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 734);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblComunidadMicrosoftDe = new JLabel("Comunidad Microsoft de Cibertec Trujillo");
		lblComunidadMicrosoftDe.setBounds(324, 31, 351, 73);
		contentPane.add(lblComunidadMicrosoftDe);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(30, 131, 82, 23);
		contentPane.add(lblDni);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno");
		lblApellidoPaterno.setBounds(30, 182, 161, 31);
		contentPane.add(lblApellidoPaterno);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno");
		lblApellidoMaterno.setBounds(30, 241, 177, 31);
		contentPane.add(lblApellidoMaterno);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(30, 296, 82, 23);
		contentPane.add(lblNombres);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(30, 346, 190, 31);
		contentPane.add(lblFechaDeNacimiento);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(263, 123, 166, 29);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtApellidoPaterno = new JTextField();
		txtApellidoPaterno.setBounds(263, 183, 166, 29);
		contentPane.add(txtApellidoPaterno);
		txtApellidoPaterno.setColumns(10);
		
		txtApellidoMaterno = new JTextField();
		txtApellidoMaterno.setBounds(263, 242, 166, 29);
		contentPane.add(txtApellidoMaterno);
		txtApellidoMaterno.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(263, 293, 166, 29);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(263, 347, 166, 29);
		contentPane.add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				procesar();
			}
		});
		btnGrabar.setBounds(161, 547, 131, 31);
		contentPane.add(btnGrabar);
		
		txtS = new JTextArea();
		txtS.setBounds(474, 120, 491, 309);
		contentPane.add(txtS);
		
		lblNota = new JLabel("Nota1");
		lblNota.setBounds(30, 406, 82, 23);
		contentPane.add(lblNota);
		
		lblNota_1 = new JLabel("Nota2");
		lblNota_1.setBounds(30, 460, 82, 23);
		contentPane.add(lblNota_1);
		
		lblNota_2 = new JLabel("Nota3");
		lblNota_2.setBounds(30, 502, 82, 23);
		contentPane.add(lblNota_2);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(263, 403, 166, 29);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(263, 451, 166, 29);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(263, 499, 166, 29);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		
	}
	
		void procesar() {
			String dni = txtDNI.getText();
			String nombre = txtNombres.getText();
			String apellidoPaterno = txtApellidoPaterno.getText();
			String apellidoMaterno = txtApellidoMaterno.getText();
			String fechaNacimiento = txtFechaNacimiento.getText();
			double nota1 = Double.parseDouble(txtNota1.getText());
			double nota2 = Double.parseDouble(txtNota2.getText());
			double nota3 = Double.parseDouble(txtNota3.getText());

			Persona persona = new Persona();

			persona.setDNI(dni);
			persona.setApellidoPaterno(apellidoPaterno);
			persona.setApellidoMaterno(apellidoMaterno);
			persona.setNombres(nombre);
			persona.setFechaNacimiento(fechaNacimiento);
			persona.setCorreo(persona.calcularCorreo());
			persona.setNota1(nota1);
			persona.setNota2(nota3);
			persona.setNota3(nota2);

			int edad = persona.calcularEdad();
			double promedio = (nota1 * 0.25) + (nota2 * 0.30) + (nota3 * 0.45);

		
			txtS.setText("DNI: " + dni + "\n");
			txtS.append("Nombre: " + nombre + "\n");
			txtS.append("Apellido Paterno: " + apellidoPaterno + "\n");
			txtS.append("Apellido Materno: " + apellidoMaterno + "\n");
			txtS.append("Fecha de Nacimiento: " + fechaNacimiento + "\n");
			txtS.append("Correo Electrónico: " + persona.calcularCorreo() + "\n");
			txtS.append("Edad: " + edad + " años\n");
			txtS.append("Promedio de Notas: " + promedio + "\n");

	}
}
