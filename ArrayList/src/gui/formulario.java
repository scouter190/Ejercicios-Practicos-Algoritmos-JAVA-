package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import clases.ArregloAlumno;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formulario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable tblAlumnos;
	
	DefaultTableModel modelito;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario frame = new formulario();
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
	public formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 1122);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 204, 774, 451);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(tblAlumnos);
		
		tblAlumnos = new JTable();
		tblAlumnos.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblAlumnos);
		
				
		modelito = new DefaultTableModel();
		modelito.addColumn("Codigo");
		modelito.addColumn("Nombre");
		modelito.addColumn("Nota1");
		modelito.addColumn("Nota2");
		modelito.addColumn("Promedio");
		
		tblAlumnos.setModel(modelito);
		
		
		JLabel lblReporteAlumnos = new JLabel("REPORTE ALUMNOS");
		lblReporteAlumnos.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblReporteAlumnos.setBounds(257, 75, 322, 95);
		contentPane.add(lblReporteAlumnos);
		
		txtReporte = new JTextArea();
		txtReporte.setBounds(39, 717, 768, 253);
		contentPane.add(txtReporte);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cargarDatos();
			}
		});
		btnCargar.setBounds(33, 158, 131, 31);
		contentPane.add(btnCargar);
		
		JButton btnReportar = new JButton("Reportar");
		btnReportar.setBounds(181, 154, 131, 31);
		contentPane.add(btnReportar);
		
		cargarDatos();
	}
	
	
	ArregloAlumno aa = new ArregloAlumno();
	private JTextArea txtReporte;
	void cargarDatos(){
		modelito.setRowCount(0);
		for(int i = 0 ; i<aa.tamanio(); i++){
			Object[] fila = {aa.obtener(i).getCodigo(),
							 aa.obtener(i).getNombre(),
							 aa.obtener(i).getNota1(),
							 aa.obtener(i).getNota2(),
							 aa.obtener(i).promedio()
			};
		modelito.addRow(fila);
		}
	}
}
