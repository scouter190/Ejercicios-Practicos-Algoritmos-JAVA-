package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import clases.Empleado;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

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
		setBounds(100, 100, 501, 320);
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
		scrollPane.setBounds(24, 59, 451, 198);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	
	void procesar(){
		Empleado e1 = new Empleado();
		Empleado e2 = new Empleado(545,"Juan");
		Empleado e3 = new Empleado(685,"Cesar",1,965425);
		
		listado(e1);
		listado(e2);
		listado(e3);
		listado2(e1);
	}
	
	void listado(Empleado x){
		txtS.append("Codigo :" +  x.getCodigo() + "\n");
		txtS.append("Nombre: " + x.getNombre()+ "\n");
		txtS.append("Categoria: " + x.getCategoria()+ "\n");
		txtS.append("Nro Celular: " + x.getNroCelular()+ "\n");
		txtS.append("Sueldo Bruto:" + x.getSueldoBruto()+ "\n");
		txtS.append("Sueldo Neto: " + x.getSueldoNeto()+ "\n");
		txtS.append("Descuento: " + x.getDescuento()+ "\n");
		txtS.append("---------" + "\n");
		
	}
	
	void listado2(Empleado x){
		txtS.append("Factor Descuento: " + Empleado.getFactordescuento()+ "\n");
		txtS.append("Cantidad Empleados: " + Empleado.getCantidadEmpleados()+ "\n");
		txtS.append("Z SueldosNetos: " + Empleado.getSumatoriaSueldosNetos()+ "\n");
		
	}
}
