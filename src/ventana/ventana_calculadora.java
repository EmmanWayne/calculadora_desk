package ventana;

import java.awt.EventQueue;

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
	private JLabel lbln7_1;
	private JLabel lbln8_1;
	private JLabel lbln9_1;
	private JLabel lblResta_1;
	

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
		setBounds(100, 100, 300, 463);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(112, 128, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtPantalla = new JTextField();
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setEditable(false);
		txtPantalla.setFont(new Font("Consolas", Font.BOLD, 20));
		txtPantalla.setBounds(10, 11, 264, 49);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);

		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(UIManager.getBorder("RadioButton.border"));
		panelBotones.setBounds(10, 71, 264, 342);
		contentPane.add(panelBotones);
		panelBotones.setLayout(null);

		lbln1 = new JLabel("");
		lbln1.setBounds(10, 182, 52, 46);
		panelBotones.add(lbln1);
		lbln1.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n1 = new ImageIcon(
				n1b.getImage().getScaledInstance(lbln1.getWidth(), lbln1.getHeight(), Image.SCALE_DEFAULT));
		lbln1.setIcon(n1);

		lbln2 = new JLabel("");
		lbln2.setBounds(72, 182, 52, 46);
		panelBotones.add(lbln2);
		lbln2.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n2 = new ImageIcon(
				n2b.getImage().getScaledInstance(lbln2.getWidth(), lbln2.getHeight(), Image.SCALE_DEFAULT));
		lbln2.setIcon(n2);

		lbln3 = new JLabel("");
		lbln3.setBounds(134, 182, 52, 46);
		panelBotones.add(lbln3);
		lbln3.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n3 = new ImageIcon(
				n3b.getImage().getScaledInstance(lbln3.getWidth(), lbln3.getHeight(), Image.SCALE_DEFAULT));
		lbln3.setIcon(n3);

		lblBorrar = new JLabel("");
		lblBorrar.setBounds(196, 11, 52, 46);
		panelBotones.add(lblBorrar);
		lblBorrar.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon borrar = new ImageIcon(
				borrar_b.getImage().getScaledInstance(lblBorrar.getWidth(), lblBorrar.getHeight(), Image.SCALE_DEFAULT));
		lblBorrar.setIcon(borrar);

		lbln4 = new JLabel("");
		lbln4.setHorizontalAlignment(SwingConstants.CENTER);
		lbln4.setBounds(10, 125, 52, 46);
		panelBotones.add(lbln4);
		final ImageIcon n4 = new ImageIcon(
				n4b.getImage().getScaledInstance(lbln4.getWidth(), lbln4.getHeight(), Image.SCALE_DEFAULT));
		lbln4.setIcon(n4);

		lbln5 = new JLabel("");
		lbln5.setHorizontalAlignment(SwingConstants.CENTER);
		lbln5.setBounds(72, 125, 52, 46);
		panelBotones.add(lbln5);
		final ImageIcon n5 = new ImageIcon(
				n5b.getImage().getScaledInstance(lbln5.getWidth(), lbln5.getHeight(), Image.SCALE_DEFAULT));
		lbln5.setIcon(n5);

		lbln6 = new JLabel("");
		lbln6.setHorizontalAlignment(SwingConstants.CENTER);
		lbln6.setBounds(134, 125, 52, 46);
		panelBotones.add(lbln6);
		final ImageIcon n6 = new ImageIcon(
				n6b.getImage().getScaledInstance(lbln6.getWidth(), lbln6.getHeight(), Image.SCALE_DEFAULT));
		lbln6.setIcon(n6);

		lblSuma = new JLabel("");
		lblSuma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma.setBounds(206, 68, 42, 46);
		panelBotones.add(lblSuma);
		final ImageIcon sumar = new ImageIcon(
				suma_b.getImage().getScaledInstance(lblSuma.getWidth(), lblSuma.getHeight(), Image.SCALE_DEFAULT));
		lblSuma.setIcon(sumar);
		
		lbln7 = new JLabel("");
		lbln7.setHorizontalAlignment(SwingConstants.CENTER);
		lbln7.setBounds(10, 68, 52, 46);
		panelBotones.add(lbln7);
		final ImageIcon n7 = new ImageIcon(
				n7b.getImage().getScaledInstance(lbln7.getWidth(), lbln7.getHeight(), Image.SCALE_DEFAULT));
		lbln7.setIcon(n7);
		
		lbln8 = new JLabel("");
		lbln8.setHorizontalAlignment(SwingConstants.CENTER);
		lbln8.setBounds(72, 68, 52, 46);
		panelBotones.add(lbln8);
		final ImageIcon n8 = new ImageIcon(
				n8b.getImage().getScaledInstance(lbln8.getWidth(), lbln8.getHeight(), Image.SCALE_DEFAULT));
		lbln8.setIcon(n8);
		
		lbln9 = new JLabel("");
		lbln9.setHorizontalAlignment(SwingConstants.CENTER);
		lbln9.setBounds(134, 68, 52, 46);
		panelBotones.add(lbln9);
		final ImageIcon n9 = new ImageIcon(
				n9b.getImage().getScaledInstance(lbln9.getWidth(), lbln9.getHeight(), Image.SCALE_DEFAULT));
		lbln9.setIcon(n9);
		
		lblResta = new JLabel("");
		lblResta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResta.setBounds(206, 125, 42, 39);
		panelBotones.add(lblResta);
		final ImageIcon restar = new ImageIcon(
				resta_b.getImage().getScaledInstance(lblResta.getWidth(), lblResta.getHeight(), Image.SCALE_DEFAULT));
		lblResta.setIcon(restar);
		
		lblTema = new JLabel("");
		lblTema.setHorizontalAlignment(SwingConstants.CENTER);
		lblTema.setBounds(10, 11, 52, 46);
		panelBotones.add(lblTema);
		final ImageIcon tema = new ImageIcon(
				tema_b.getImage().getScaledInstance(lblTema.getWidth(), lblTema.getHeight(), Image.SCALE_DEFAULT));
		lblTema.setIcon(tema);
		
		lblPunto = new JLabel("");
		lblPunto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPunto.setBounds(134, 249, 52, 46);
		panelBotones.add(lblPunto);
		final ImageIcon punto = new ImageIcon(
				punto_b.getImage().getScaledInstance(lblPunto.getWidth(), lblPunto.getHeight(), Image.SCALE_DEFAULT));
		lblPunto.setIcon(punto);
		
		lbln0 = new JLabel("");
		lbln0.setHorizontalAlignment(SwingConstants.CENTER);
		lbln0.setBounds(72, 249, 52, 46);
		panelBotones.add(lbln0);
		final ImageIcon n0 = new ImageIcon(
				n0b.getImage().getScaledInstance(lbln0.getWidth(), lbln0.getHeight(), Image.SCALE_DEFAULT));
		lbln0.setIcon(n0);
		
		lblMultiplicacion = new JLabel("");
		lblMultiplicacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblMultiplicacion.setBounds(206, 182, 42, 39);
		panelBotones.add(lblMultiplicacion);
		final ImageIcon multiplicar = new ImageIcon(
				multi_b.getImage().getScaledInstance(lblMultiplicacion.getWidth(), lblMultiplicacion.getHeight(), Image.SCALE_DEFAULT));
		lblMultiplicacion.setIcon(multiplicar);
	}

	public static void main(String[] args) {
		ventana_calculadora calculadora = new ventana_calculadora();
		calculadora.setDefaultCloseOperation(EXIT_ON_CLOSE);
		calculadora.setLocationRelativeTo(null);
		calculadora.setVisible(true);
	}
}
