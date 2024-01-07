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
	private JTextField textField;
	private JLabel lbln1;
	private JLabel lbln2;
	private JLabel lbln3;
	private JLabel lblBorrar;

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

		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setBounds(10, 11, 264, 49);
		contentPane.add(textField);
		textField.setColumns(10);

		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(UIManager.getBorder("RadioButton.border"));
		panelBotones.setBounds(10, 71, 264, 342);
		contentPane.add(panelBotones);
		panelBotones.setLayout(null);

		lbln1 = new JLabel("");
		lbln1.setBounds(10, 11, 52, 46);
		panelBotones.add(lbln1);
		lbln1.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n1 = new ImageIcon(
				n1b.getImage().getScaledInstance(lbln1.getWidth(), lbln1.getHeight(), Image.SCALE_DEFAULT));
		lbln1.setIcon(n1);

		lbln2 = new JLabel("");
		lbln2.setBounds(72, 11, 52, 46);
		panelBotones.add(lbln2);
		lbln2.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n2 = new ImageIcon(
				n2b.getImage().getScaledInstance(lbln2.getWidth(), lbln2.getHeight(), Image.SCALE_DEFAULT));
		lbln2.setIcon(n2);

		lbln3 = new JLabel("");
		lbln3.setBounds(134, 11, 52, 46);
		panelBotones.add(lbln3);
		lbln3.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n3 = new ImageIcon(
				n3b.getImage().getScaledInstance(lbln3.getWidth(), lbln3.getHeight(), Image.SCALE_DEFAULT));
		lbln3.setIcon(n3);

		lblBorrar = new JLabel("");
		lblBorrar.setBounds(196, 11, 52, 46);
		panelBotones.add(lblBorrar);
		lblBorrar.setHorizontalAlignment(SwingConstants.CENTER);
		final ImageIcon n4 = new ImageIcon(
				n4b.getImage().getScaledInstance(lblBorrar.getWidth(), lblBorrar.getHeight(), Image.SCALE_DEFAULT));
		lblBorrar.setIcon(n4);

		JLabel lbln1_1 = new JLabel("");
		lbln1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbln1_1.setBounds(10, 68, 52, 46);
		panelBotones.add(lbln1_1);

		JLabel lbln2_1 = new JLabel("");
		lbln2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbln2_1.setBounds(72, 68, 52, 46);
		panelBotones.add(lbln2_1);

		JLabel lbln3_1 = new JLabel("");
		lbln3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbln3_1.setBounds(134, 68, 52, 46);
		panelBotones.add(lbln3_1);

		JLabel lbln4_1 = new JLabel("");
		lbln4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbln4_1.setBounds(196, 68, 52, 46);
		panelBotones.add(lbln4_1);

		JLabel lbln1_2 = new JLabel("");
		lbln1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbln1_2.setBounds(10, 125, 52, 46);
		panelBotones.add(lbln1_2);

		JLabel lbln2_2 = new JLabel("");
		lbln2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbln2_2.setBounds(72, 125, 52, 46);
		panelBotones.add(lbln2_2);

		JLabel lbln3_2 = new JLabel("");
		lbln3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbln3_2.setBounds(134, 125, 52, 46);
		panelBotones.add(lbln3_2);

		JLabel lbln4_2 = new JLabel("");
		lbln4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbln4_2.setBounds(196, 125, 52, 46);
		panelBotones.add(lbln4_2);
	}

	public static void main(String[] args) {
		ventana_calculadora calculadora = new ventana_calculadora();
		calculadora.setDefaultCloseOperation(EXIT_ON_CLOSE);
		calculadora.setLocationRelativeTo(null);
		calculadora.setVisible(true);
	}
}
