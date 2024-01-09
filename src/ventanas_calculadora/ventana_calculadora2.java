package ventana;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class ventana_calculadora2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPantalla;
	private JLabel lbligual;
	private JLabel lbln7_1;
	private JLabel lbln8_1;
	private JLabel lbln9_1;
	private JLabel lblResta_1;
	private JLabel lblPunto_1;
	private JPanel panel_numeros;
	private JLabel lblMultiplicacion_1;

	public ventana_calculadora2() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ventana_calculadora2.class.getResource("/recursos/calculadora.png")));
		// Iconos del tema blanco
		final ImageIcon n1b = new ImageIcon(getClass().getResource("/recursos/1_tb.png"));
		final ImageIcon n2b = new ImageIcon(getClass().getResource("/recursos/2_tb.png"));
		final ImageIcon n3b = new ImageIcon(getClass().getResource("/recursos/3_tb.png"));
		final ImageIcon n4b = new ImageIcon(getClass().getResource("/recursos/4_tb.png"));
		final ImageIcon n5b = new ImageIcon(getClass().getResource("/recursos/5_tb.png"));
		final ImageIcon n6b = new ImageIcon(getClass().getResource("/recursos/6_tb.png"));
		final ImageIcon n7b = new ImageIcon(getClass().getResource("/recursos/7_tb.png"));
		final ImageIcon n8b = new ImageIcon(getClass().getResource("/recursos/8_tb.png"));
		final ImageIcon n9b = new ImageIcon(getClass().getResource("/recursos/9_tb.png"));
		final ImageIcon n0b = new ImageIcon(getClass().getResource("/recursos/0_tb.png"));
		// Iconos del tema negro
		final ImageIcon n1n = new ImageIcon(getClass().getResource("/recursos/1_tn.png"));
		final ImageIcon n2n = new ImageIcon(getClass().getResource("/recursos/2_tn.png"));
		final ImageIcon n3n = new ImageIcon(getClass().getResource("/recursos/3_tn.png"));
		final ImageIcon n4n = new ImageIcon(getClass().getResource("/recursos/4_tn.png"));
		final ImageIcon n5n = new ImageIcon(getClass().getResource("/recursos/5_tn.png"));
		final ImageIcon n6n = new ImageIcon(getClass().getResource("/recursos/6_tn.png"));
		final ImageIcon n7n = new ImageIcon(getClass().getResource("/recursos/7_tn.png"));
		final ImageIcon n8n = new ImageIcon(getClass().getResource("/recursos/8_tn.png"));
		final ImageIcon n9n = new ImageIcon(getClass().getResource("/recursos/9_tn.png"));
		final ImageIcon n0n = new ImageIcon(getClass().getResource("/recursos/0_tn.png"));
		// Iconos de botones de funcion del tema blanco
		final ImageIcon borrar_b = new ImageIcon(getClass().getResource("/recursos/borrar_b.png"));
		final ImageIcon eliminar_b = new ImageIcon(getClass().getResource("/recursos/eliminar_b.png"));
		final ImageIcon suma_b = new ImageIcon(getClass().getResource("/recursos/sumar_b.png"));
		final ImageIcon resta_b = new ImageIcon(getClass().getResource("/recursos/restar_b.png"));
		final ImageIcon multi_b = new ImageIcon(getClass().getResource("/recursos/multiplicar_b.png"));
		final ImageIcon divi_b = new ImageIcon(getClass().getResource("/recursos/dividir_b.png"));
		final ImageIcon punto_b = new ImageIcon(getClass().getResource("/recursos/punto_b.png"));
		final ImageIcon tema_b = new ImageIcon(getClass().getResource("/recursos/tema_b.png"));
		// Iconos de botones de funcion del tema blanco
		final ImageIcon borrar_n = new ImageIcon(getClass().getResource("/recursos/borrar_n.png"));
		final ImageIcon eliminar_n = new ImageIcon(getClass().getResource("/recursos/eliminar_n.png"));
		final ImageIcon suma_n = new ImageIcon(getClass().getResource("/recursos/sumar_n.png"));
		final ImageIcon resta_n = new ImageIcon(getClass().getResource("/recursos/restar_n.png"));
		final ImageIcon multi_n = new ImageIcon(getClass().getResource("/recursos/multiplicar_n.png"));
		final ImageIcon divi_n = new ImageIcon(getClass().getResource("/recursos/dividir_n.png"));
		final ImageIcon punto_n = new ImageIcon(getClass().getResource("/recursos/punto_n.png"));
		final ImageIcon tema_n = new ImageIcon(getClass().getResource("/recursos/tema_n.png"));

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 322, 541);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_principal = new JPanel();
		panel_principal.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 140, 0), new Color(255, 140, 0),
				new Color(255, 140, 0), new Color(255, 140, 0)));
		panel_principal.setBounds(10, 71, 287, 420);
		contentPane.add(panel_principal);
		panel_principal.setLayout(null);

		txtPantalla = new JTextField();
		txtPantalla.setText("0.00");
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setEditable(false);
		txtPantalla.setFont(new Font("Cambria Math", Font.PLAIN, 30));
		txtPantalla.setBounds(10, 11, 287, 49);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		txtPantalla.requestFocus();
		

		// INICIO --------- Panel de opciones

		JPanel panel_opciones = new JPanel();
		panel_opciones.setLayout(null);
		panel_opciones.setBorder(new LineBorder(new Color(255, 140, 0), 2, true));
		panel_opciones.setBounds(10, 11, 267, 60);
		panel_principal.add(panel_opciones);
		
		JLabel lblTema_1 = new JLabel("");
		lblTema_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTema_1.setBounds(214, 11, 43, 38);
		panel_opciones.add(lblTema_1);

		// FINAL --------- Panel de operaciones

		// INICIO --------- Panel de numeros

		panel_numeros = new JPanel();
		panel_numeros.setBorder(new LineBorder(new Color(255, 140, 0), 2, true));
		panel_numeros.setBounds(10, 82, 267, 327);
		panel_principal.add(panel_numeros);
		panel_numeros.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setBounds(10, 79, 54, 51);
		panel_numeros.add(btnNewButton);
		
		JButton btnC = new JButton("8");
		btnC.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnC.setBackground(new Color(255, 140, 0));
		btnC.setBounds(74, 79, 54, 51);
		panel_numeros.add(btnC);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_2.setBackground(new Color(255, 140, 0));
		btnNewButton_2.setBounds(138, 79, 54, 51);
		panel_numeros.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_3.setBackground(new Color(255, 140, 0));
		btnNewButton_3.setBounds(202, 79, 54, 51);
		panel_numeros.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_4.setBackground(new Color(255, 140, 0));
		btnNewButton_4.setBounds(10, 141, 54, 51);
		panel_numeros.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("8");
		btnNewButton_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_1_1.setBackground(new Color(255, 140, 0));
		btnNewButton_1_1.setBounds(74, 141, 54, 51);
		panel_numeros.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("9");
		btnNewButton_2_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_2_1.setBackground(new Color(255, 140, 0));
		btnNewButton_2_1.setBounds(138, 141, 54, 51);
		panel_numeros.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("/");
		btnNewButton_3_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_3_1.setBackground(new Color(255, 140, 0));
		btnNewButton_3_1.setBounds(202, 141, 54, 51);
		panel_numeros.add(btnNewButton_3_1);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_5.setBackground(new Color(255, 140, 0));
		btnNewButton_5.setBounds(10, 203, 54, 51);
		panel_numeros.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_1_2.setBackground(new Color(255, 140, 0));
		btnNewButton_1_2.setBounds(74, 203, 54, 51);
		panel_numeros.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_2_2.setBackground(new Color(255, 140, 0));
		btnNewButton_2_2.setBounds(138, 203, 54, 51);
		panel_numeros.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("*");
		btnNewButton_3_2.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_3_2.setBackground(new Color(255, 140, 0));
		btnNewButton_3_2.setBounds(202, 203, 54, 51);
		panel_numeros.add(btnNewButton_3_2);
		
		JButton btnNewButton_1_3 = new JButton("0");
		btnNewButton_1_3.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_1_3.setBackground(new Color(255, 140, 0));
		btnNewButton_1_3.setBounds(10, 265, 118, 51);
		panel_numeros.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton(".");
		btnNewButton_2_3.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_2_3.setBackground(new Color(255, 140, 0));
		btnNewButton_2_3.setBounds(138, 265, 54, 51);
		panel_numeros.add(btnNewButton_2_3);
		
		JButton btnNewButton_3_3 = new JButton("=");
		btnNewButton_3_3.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_3_3.setBackground(new Color(255, 140, 0));
		btnNewButton_3_3.setBounds(202, 265, 54, 51);
		panel_numeros.add(btnNewButton_3_3);
		
		JButton btnCe_1 = new JButton("CE");
		btnCe_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnCe_1.setBackground(new Color(255, 140, 0));
		btnCe_1.setBounds(10, 17, 54, 51);
		panel_numeros.add(btnCe_1);
		
		JButton btnC_1 = new JButton("8");
		btnC_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnC_1.setBackground(new Color(255, 140, 0));
		btnC_1.setBounds(74, 17, 54, 51);
		panel_numeros.add(btnC_1);
		
		JButton btnNewButton_2_4 = new JButton("9");
		btnNewButton_2_4.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_2_4.setBackground(new Color(255, 140, 0));
		btnNewButton_2_4.setBounds(138, 17, 54, 51);
		panel_numeros.add(btnNewButton_2_4);
		
		JButton btnNewButton_3_4 = new JButton("+");
		btnNewButton_3_4.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton_3_4.setBackground(new Color(255, 140, 0));
		btnNewButton_3_4.setBounds(202, 17, 54, 51);
		panel_numeros.add(btnNewButton_3_4);
	}

	public static void main(String[] args) {
		ventana_calculadora2 calculadora = new ventana_calculadora2();
		calculadora.setDefaultCloseOperation(EXIT_ON_CLOSE);
		calculadora.setLocationRelativeTo(null);
		calculadora.setVisible(true);
	}
}
