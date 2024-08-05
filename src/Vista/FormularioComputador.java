package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioComputador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_codigo;
	private JTextField txt_referencia;
	private JTextField txt_marca;
	private JTextField txt_stock;
	private JTextField txt_precio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioComputador frame = new FormularioComputador();
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
	public FormularioComputador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_titulo = new JLabel("Formulario Computador");
		lbl_titulo.setBounds(144, 10, 146, 17);
		lbl_titulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lbl_titulo);
		
		JLabel lbl_codigo = new JLabel("Codigo");
		lbl_codigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_codigo.setBounds(10, 46, 46, 14);
		contentPane.add(lbl_codigo);
		
		JLabel lbl_referencia = new JLabel("Referencia");
		lbl_referencia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_referencia.setBounds(10, 71, 73, 14);
		contentPane.add(lbl_referencia);
		
		JLabel lbl_marca = new JLabel("Marca");
		lbl_marca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_marca.setBounds(10, 96, 73, 14);
		contentPane.add(lbl_marca);
		
		JLabel lbl_stock = new JLabel("Stock");
		lbl_stock.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_stock.setBounds(10, 121, 73, 14);
		contentPane.add(lbl_stock);
		
		JLabel lbl_precio = new JLabel("Precio");
		lbl_precio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_precio.setBounds(10, 146, 73, 14);
		contentPane.add(lbl_precio);
		
		txt_codigo = new JTextField();
		txt_codigo.setBounds(88, 44, 86, 20);
		contentPane.add(txt_codigo);
		txt_codigo.setColumns(10);
		
		txt_referencia = new JTextField();
		txt_referencia.setColumns(10);
		txt_referencia.setBounds(88, 69, 86, 20);
		contentPane.add(txt_referencia);
		
		txt_marca = new JTextField();
		txt_marca.setColumns(10);
		txt_marca.setBounds(88, 94, 86, 20);
		contentPane.add(txt_marca);
		
		txt_stock = new JTextField();
		txt_stock.setColumns(10);
		txt_stock.setBounds(88, 121, 86, 20);
		contentPane.add(txt_stock);
		
		txt_precio = new JTextField();
		txt_precio.setColumns(10);
		txt_precio.setBounds(88, 144, 86, 20);
		contentPane.add(txt_precio);
		
		JButton btn_guardar = new JButton("Guardar");
		btn_guardar.setBounds(10, 196, 89, 23);
		contentPane.add(btn_guardar);
		
		JButton btn_modificar = new JButton("Modificar");
		btn_modificar.setBounds(108, 196, 89, 23);
		contentPane.add(btn_modificar);
		
		JButton btn_eliminar = new JButton("Eliminar");
		btn_eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_eliminar.setBounds(207, 196, 89, 23);
		contentPane.add(btn_eliminar);
		
		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.setBounds(201, 43, 89, 23);
		contentPane.add(btn_buscar);
	}
}
