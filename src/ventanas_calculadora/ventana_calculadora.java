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

public class ventana_calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtPantalla;
	private JLabel lbln0;
	private JLabel lbln1;
	private JLabel lbln2;
	private JLabel lbln3;
	private JLabel lbln4;
	private JLabel lbln5;
	private JLabel lbln6;
	private JLabel lbln7;
	private JLabel lbln8;
	private JLabel lbln9;
	private JLabel lblBorrar;
	private JLabel lblEliminar;
	private JLabel lblSuma;
	private JLabel lblResta;
	private JLabel lblDivision;
	private JLabel lblMultiplicacion;
	private JLabel lblPunto;
	private JLabel lblTema;
	private JLabel lbligual;
	private JLabel lbln7_1;
	private JLabel lbln8_1;
	private JLabel lbln9_1;
	private JLabel lblResta_1;
	private JLabel lblPunto_1;
	private JPanel panel_numeros;
	private JLabel lblMultiplicacion_1;
	private JPanel panel_operaciones;

	public ventana_calculadora() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ventana_calculadora.class.getResource("/recursos/calculadora.png")));
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
		setBounds(100, 100, 300, 541);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_principal = new JPanel();
		panel_principal.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 140, 0), new Color(255, 140, 0),
				new Color(255, 140, 0), new Color(255, 140, 0)));
		panel_principal.setBounds(10, 71, 264, 370);
		contentPane.add(panel_principal);
		panel_principal.setLayout(null);

		txtPantalla = new JTextField();
		txtPantalla.setText("0.00");
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setEditable(false);
		txtPantalla.setFont(new Font("Cambria Math", Font.PLAIN, 25));
		txtPantalla.setBounds(10, 11, 264, 49);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		

		// INICIO --------- Panel de opciones

		JPanel panel_opciones = new JPanel();
		panel_opciones.setLayout(null);
		panel_opciones.setBorder(new LineBorder(new Color(255, 140, 0), 2, true));
		panel_opciones.setBounds(10, 11, 244, 60);
		panel_principal.add(panel_opciones);

		lblEliminar = new JLabel("");
		lblEliminar.setBounds(73, 11, 43, 38);
		panel_opciones.add(lblEliminar);
		lblEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon eliminar = new ImageIcon(eliminar_b.getImage().getScaledInstance(lblEliminar.getWidth(),
				lblEliminar.getHeight(), Image.SCALE_DEFAULT));
		lblEliminar.setIcon(eliminar);

		lblTema = new JLabel("");
		lblTema.setBounds(10, 11, 43, 38);
		panel_opciones.add(lblTema);
		lblTema.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon tema = new ImageIcon(
				tema_b.getImage().getScaledInstance(lblTema.getWidth(), lblTema.getHeight(), Image.SCALE_DEFAULT));
		lblTema.setIcon(tema);

		lblBorrar = new JLabel("");
		lblBorrar.setBounds(191, 11, 43, 38);
		panel_opciones.add(lblBorrar);
		lblBorrar.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon borrar = new ImageIcon(borrar_b.getImage().getScaledInstance(lblBorrar.getWidth(),
				lblBorrar.getHeight(), Image.SCALE_DEFAULT));
		lblBorrar.setIcon(borrar);

		// FINAL --------- Panel de opciones

		// INICIO --------- Panel de Operaciones

		panel_operaciones = new JPanel();
		panel_operaciones.setBorder(new LineBorder(new Color(255, 140, 0), 2, true));
		panel_operaciones.setBounds(10, 82, 244, 60);
		panel_principal.add(panel_operaciones);
		panel_operaciones.setLayout(null);

		lblMultiplicacion = new JLabel("");
		lblMultiplicacion.setBounds(10, 11, 38, 39);
		panel_operaciones.add(lblMultiplicacion);
		lblMultiplicacion.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon multiplicar = new ImageIcon(multi_b.getImage().getScaledInstance(lblMultiplicacion.getWidth(),
				lblMultiplicacion.getHeight(), Image.SCALE_DEFAULT));
		lblMultiplicacion.setIcon(multiplicar);

		lblDivision = new JLabel("");
		lblDivision.setBounds(71, 11, 38, 39);
		panel_operaciones.add(lblDivision);
		lblDivision.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon division = new ImageIcon(divi_b.getImage().getScaledInstance(lblDivision.getWidth(),
				lblDivision.getHeight(), Image.SCALE_DEFAULT));
		lblDivision.setIcon(division);

		lblSuma = new JLabel("");
		lblSuma.setBounds(196, 11, 38, 39);
		panel_operaciones.add(lblSuma);
		lblSuma.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon sumar = new ImageIcon(
				suma_b.getImage().getScaledInstance(lblSuma.getWidth(), lblSuma.getHeight(), Image.SCALE_DEFAULT));
		lblSuma.setIcon(sumar);

		lblResta = new JLabel("");
		lblResta.setBounds(135, 11, 38, 39);
		panel_operaciones.add(lblResta);
		lblResta.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon restar = new ImageIcon(
				resta_b.getImage().getScaledInstance(lblResta.getWidth(), lblResta.getHeight(), Image.SCALE_DEFAULT));
		lblResta.setIcon(restar);

		// FINAL --------- Panel de operaciones

		// INICIO --------- Panel de numeros

		panel_numeros = new JPanel();
		panel_numeros.setBorder(new LineBorder(new Color(255, 140, 0), 2, true));
		panel_numeros.setBounds(10, 153, 244, 204);
		panel_principal.add(panel_numeros);
		panel_numeros.setLayout(null);

		lbln0 = new JLabel("");
		lbln0.setBounds(98, 147, 52, 46);
		panel_numeros.add(lbln0);
		lbln0.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n0 = new ImageIcon(
				n0b.getImage().getScaledInstance(lbln0.getWidth(), lbln0.getHeight(), Image.SCALE_DEFAULT));
		lbln0.setIcon(n0);

		lbln1 = new JLabel("");
		lbln1.setBounds(10, 100, 52, 46);
		panel_numeros.add(lbln1);
		lbln1.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n1 = new ImageIcon(
				n1b.getImage().getScaledInstance(lbln1.getWidth(), lbln1.getHeight(), Image.SCALE_DEFAULT));
		lbln1.setIcon(n1);

		lbln2 = new JLabel("");
		lbln2.setBounds(98, 100, 52, 46);
		panel_numeros.add(lbln2);
		lbln2.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n2 = new ImageIcon(
				n2b.getImage().getScaledInstance(lbln2.getWidth(), lbln2.getHeight(), Image.SCALE_DEFAULT));
		lbln2.setIcon(n2);

		lbln3 = new JLabel("");
		lbln3.setBounds(182, 100, 52, 46);
		panel_numeros.add(lbln3);
		lbln3.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n3 = new ImageIcon(
				n3b.getImage().getScaledInstance(lbln3.getWidth(), lbln3.getHeight(), Image.SCALE_DEFAULT));
		lbln3.setIcon(n3);

		lbln4 = new JLabel("");
		lbln4.setBounds(10, 56, 52, 46);
		panel_numeros.add(lbln4);
		lbln4.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n4 = new ImageIcon(
				n4b.getImage().getScaledInstance(lbln4.getWidth(), lbln4.getHeight(), Image.SCALE_DEFAULT));
		lbln4.setIcon(n4);

		lbln5 = new JLabel("");
		lbln5.setBounds(98, 56, 52, 46);
		panel_numeros.add(lbln5);
		lbln5.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n5 = new ImageIcon(
				n5b.getImage().getScaledInstance(lbln5.getWidth(), lbln5.getHeight(), Image.SCALE_DEFAULT));
		lbln5.setIcon(n5);

		lbln6 = new JLabel("");
		lbln6.setBounds(182, 56, 52, 46);
		panel_numeros.add(lbln6);
		lbln6.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n6 = new ImageIcon(
				n6b.getImage().getScaledInstance(lbln6.getWidth(), lbln6.getHeight(), Image.SCALE_DEFAULT));
		lbln6.setIcon(n6);

		lbln7 = new JLabel("");
		lbln7.setBounds(10, 11, 52, 46);
		panel_numeros.add(lbln7);
		lbln7.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n7 = new ImageIcon(
				n7b.getImage().getScaledInstance(lbln7.getWidth(), lbln7.getHeight(), Image.SCALE_DEFAULT));
		lbln7.setIcon(n7);

		lbln8 = new JLabel("");
		lbln8.setBounds(98, 11, 52, 46);
		panel_numeros.add(lbln8);
		lbln8.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n8 = new ImageIcon(
				n8b.getImage().getScaledInstance(lbln8.getWidth(), lbln8.getHeight(), Image.SCALE_DEFAULT));
		lbln8.setIcon(n8);

		lbln9 = new JLabel("");
		lbln9.setBounds(182, 11, 52, 46);
		panel_numeros.add(lbln9);
		lbln9.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n9 = new ImageIcon(
				n9b.getImage().getScaledInstance(lbln9.getWidth(), lbln9.getHeight(), Image.SCALE_DEFAULT));
		lbln9.setIcon(n9);

		lblPunto = new JLabel("");
		lblPunto.setBounds(182, 147, 52, 46);
		panel_numeros.add(lblPunto);
		lblPunto.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon punto = new ImageIcon(
				punto_b.getImage().getScaledInstance(lblPunto.getWidth(), lblPunto.getHeight(), Image.SCALE_DEFAULT));
		lblPunto.setIcon(punto);

		// FINAL --------- Panel de numeros

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCalcular.setBackground(new Color(255, 255, 255));
		btnCalcular.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnCalcular.setBounds(10, 452, 264, 39);
		btnCalcular.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 140, 0), new Color(255, 140, 0),
				new Color(255, 140, 0), new Color(255, 140, 0)));
		contentPane.add(btnCalcular);
	}

	public static void main(String[] args) {
		ventana_calculadora calculadora = new ventana_calculadora();
		calculadora.setDefaultCloseOperation(EXIT_ON_CLOSE);
		calculadora.setLocationRelativeTo(null);
		calculadora.setVisible(true);
	}
}
