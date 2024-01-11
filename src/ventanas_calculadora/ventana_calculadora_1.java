package ventanas_calculadora;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ventana_calculadora_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private JLabel lblTema;
	private JTextField txtPantalla;
	private JLabel lblEliminar;
	private JLabel lblBorrar;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
	private JLabel lbl9;
	private JLabel lbl0;
	private JLabel lblSuma;
	private JLabel lblResta;
	private JLabel lblMultiplicacion;
	private JLabel lblDivision;
	private JLabel lblPunto;
	private JLabel lblIgual;
	private JPanel panel_1;
	private JPanel panel_2;

	public ventana_calculadora_1() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ventana_calculadora_1.class.getResource("/recursos_otros/calculadora.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 452);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// Recursos tema claro
		final ImageIcon n1 = new ImageIcon(getClass().getResource("/recursos_tema_claro/1.png"));
		final ImageIcon n2 = new ImageIcon(getClass().getResource("/recursos_tema_claro/2.png"));
		final ImageIcon n3 = new ImageIcon(getClass().getResource("/recursos_tema_claro/3.png"));
		final ImageIcon n4 = new ImageIcon(getClass().getResource("/recursos_tema_claro/4.png"));
		final ImageIcon n5 = new ImageIcon(getClass().getResource("/recursos_tema_claro/5.png"));
		final ImageIcon n6 = new ImageIcon(getClass().getResource("/recursos_tema_claro/6.png"));
		final ImageIcon n7 = new ImageIcon(getClass().getResource("/recursos_tema_claro/7.png"));
		final ImageIcon n8 = new ImageIcon(getClass().getResource("/recursos_tema_claro/8.png"));
		final ImageIcon n9 = new ImageIcon(getClass().getResource("/recursos_tema_claro/9.png"));
		final ImageIcon n0 = new ImageIcon(getClass().getResource("/recursos_tema_claro/0.png"));
		final ImageIcon borrar = new ImageIcon(getClass().getResource("/recursos_tema_claro/borrar.png"));
		final ImageIcon eliminar = new ImageIcon(getClass().getResource("/recursos_tema_claro/eliminar.png"));
		final ImageIcon suma = new ImageIcon(getClass().getResource("/recursos_tema_claro/sumar.png"));
		final ImageIcon resta = new ImageIcon(getClass().getResource("/recursos_tema_claro/restar.png"));
		final ImageIcon multiplicacion = new ImageIcon(getClass().getResource("/recursos_tema_claro/multiplicar.png"));
		final ImageIcon division = new ImageIcon(getClass().getResource("/recursos_tema_claro/dividir.png"));
		final ImageIcon punto = new ImageIcon(getClass().getResource("/recursos_tema_claro/punto.png"));
		final ImageIcon tema = new ImageIcon(getClass().getResource("/recursos_tema_claro/tema.png"));
		final ImageIcon igual = new ImageIcon(getClass().getResource("/recursos_tema_claro/igual.png"));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblTema = new JLabel("");
		lblTema.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lblTema.setForeground(new Color(0, 0, 0));
		lblTema.setBackground(new Color(255, 255, 255));
		lblTema.setHorizontalAlignment(SwingConstants.CENTER);
		lblTema.setBounds(10, 63, 57, 57);
		contentPane.add(lblTema);
		final ImageIcon icono_tema = new ImageIcon(
				tema.getImage().getScaledInstance(lblTema.getWidth(), lblTema.getHeight(), Image.SCALE_DEFAULT));
		lblTema.setIcon(icono_tema);

		lblBorrar = new JLabel("");
		lblBorrar.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lblBorrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrar.setForeground(Color.BLACK);
		lblBorrar.setBackground(Color.WHITE);
		lblBorrar.setBounds(229, 63, 57, 57);
		contentPane.add(lblBorrar);
		final ImageIcon icono_borrar = new ImageIcon(
				borrar.getImage().getScaledInstance(lblBorrar.getWidth(), lblBorrar.getHeight(), Image.SCALE_DEFAULT));
		lblBorrar.setIcon(icono_borrar);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(255, 140, 0), 2, true));
		panel.setBounds(10, 122, 212, 281);
		contentPane.add(panel);
		panel.setLayout(null);

		lbl1 = new JLabel("");
		lbl1.setBounds(10, 11, 57, 57);
		panel.add(lbl1);
		lbl1.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setForeground(Color.BLACK);
		lbl1.setBackground(Color.WHITE);
		final ImageIcon icono_n1 = new ImageIcon(
				n1.getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_DEFAULT));
		lbl1.setIcon(icono_n1);

		lbl2 = new JLabel("");
		lbl2.setBounds(77, 11, 57, 57);
		panel.add(lbl2);
		lbl2.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setForeground(Color.BLACK);
		lbl2.setBackground(Color.WHITE);
		final ImageIcon icono_n2 = new ImageIcon(
				n2.getImage().getScaledInstance(lbl2.getWidth(), lbl2.getHeight(), Image.SCALE_DEFAULT));
		lbl2.setIcon(icono_n2);

		lbl3 = new JLabel("");
		lbl3.setBounds(144, 11, 57, 57);
		panel.add(lbl3);
		lbl3.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setForeground(Color.BLACK);
		lbl3.setBackground(Color.WHITE);
		final ImageIcon icono_n3 = new ImageIcon(
				n3.getImage().getScaledInstance(lbl3.getWidth(), lbl3.getHeight(), Image.SCALE_DEFAULT));
		lbl3.setIcon(icono_n3);

		lbl4 = new JLabel("");
		lbl4.setBounds(10, 79, 57, 57);
		panel.add(lbl4);
		lbl4.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setForeground(Color.BLACK);
		lbl4.setBackground(Color.WHITE);
		final ImageIcon icono_n4 = new ImageIcon(
				n4.getImage().getScaledInstance(lbl4.getWidth(), lbl4.getHeight(), Image.SCALE_DEFAULT));
		lbl4.setIcon(icono_n4);

		lbl5 = new JLabel("");
		lbl5.setBounds(77, 79, 57, 57);
		panel.add(lbl5);
		lbl5.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setForeground(Color.BLACK);
		lbl5.setBackground(Color.WHITE);
		final ImageIcon icono_n5 = new ImageIcon(
				n5.getImage().getScaledInstance(lbl5.getWidth(), lbl5.getHeight(), Image.SCALE_DEFAULT));
		lbl5.setIcon(icono_n5);

		lbl6 = new JLabel("");
		lbl6.setBounds(144, 79, 57, 57);
		panel.add(lbl6);
		lbl6.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setForeground(Color.BLACK);
		lbl6.setBackground(Color.WHITE);
		final ImageIcon icono_n6 = new ImageIcon(
				n6.getImage().getScaledInstance(lbl6.getWidth(), lbl6.getHeight(), Image.SCALE_DEFAULT));
		lbl6.setIcon(icono_n6);

		lbl7 = new JLabel("");
		lbl7.setBounds(10, 147, 57, 57);
		panel.add(lbl7);
		lbl7.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setForeground(Color.BLACK);
		lbl7.setBackground(Color.WHITE);
		final ImageIcon icono_n7 = new ImageIcon(
				n7.getImage().getScaledInstance(lbl7.getWidth(), lbl7.getHeight(), Image.SCALE_DEFAULT));
		lbl7.setIcon(icono_n7);

		lbl8 = new JLabel("");
		lbl8.setBounds(77, 147, 57, 57);
		panel.add(lbl8);
		lbl8.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setForeground(Color.BLACK);
		lbl8.setBackground(Color.WHITE);
		final ImageIcon icono_n8 = new ImageIcon(
				n8.getImage().getScaledInstance(lbl8.getWidth(), lbl8.getHeight(), Image.SCALE_DEFAULT));
		lbl8.setIcon(icono_n8);

		lbl9 = new JLabel("");
		lbl9.setBounds(144, 147, 57, 57);
		panel.add(lbl9);
		lbl9.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setForeground(Color.BLACK);
		lbl9.setBackground(Color.WHITE);
		final ImageIcon icono_n9 = new ImageIcon(
				n9.getImage().getScaledInstance(lbl9.getWidth(), lbl9.getHeight(), Image.SCALE_DEFAULT));
		lbl9.setIcon(icono_n9);

		lbl0 = new JLabel("");
		lbl0.setBounds(77, 215, 57, 57);
		panel.add(lbl0);
		lbl0.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lbl0.setHorizontalAlignment(SwingConstants.CENTER);
		lbl0.setForeground(Color.BLACK);
		lbl0.setBackground(Color.WHITE);
		final ImageIcon icono_n0 = new ImageIcon(
				n0.getImage().getScaledInstance(lbl0.getWidth(), lbl0.getHeight(), Image.SCALE_DEFAULT));
		lbl0.setIcon(icono_n0);

		lblPunto = new JLabel("");
		lblPunto.setBounds(144, 215, 57, 57);
		panel.add(lblPunto);
		lblPunto.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lblPunto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPunto.setForeground(Color.BLACK);
		lblPunto.setBackground(Color.WHITE);
		final ImageIcon icono_punto = new ImageIcon(
				punto.getImage().getScaledInstance(lblPunto.getWidth(), lblPunto.getHeight(), Image.SCALE_DEFAULT));
		lblPunto.setIcon(icono_punto);

		lblEliminar = new JLabel("");
		lblEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPantalla.setText("");
			}
		});
		lblEliminar.setBounds(10, 215, 57, 57);
		panel.add(lblEliminar);
		lblEliminar.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lblEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminar.setForeground(Color.BLACK);
		lblEliminar.setBackground(Color.WHITE);
		final ImageIcon icono_eliminar = new ImageIcon(eliminar.getImage().getScaledInstance(lblEliminar.getWidth(),
				lblEliminar.getHeight(), Image.SCALE_DEFAULT));
		lblEliminar.setIcon(icono_eliminar);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 140, 0), 2, true));
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(10, 11, 276, 52);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		txtPantalla = new JTextField();
		txtPantalla.setBounds(10, 11, 256, 30);
		panel_1.add(txtPantalla);
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setBackground(new Color(255, 255, 255));
		txtPantalla.setEditable(false);
		txtPantalla.setFont(new Font("Cambria Math", Font.PLAIN, 25));
		txtPantalla.setText("123456789");
		txtPantalla.setColumns(10);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new LineBorder(new Color(255, 140, 0), 2));
		panel_2.setBounds(229, 123, 57, 280);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		lblMultiplicacion = new JLabel("");
		lblMultiplicacion.setBounds(10, 11, 37, 37);
		panel_2.add(lblMultiplicacion);
		lblMultiplicacion.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lblMultiplicacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblMultiplicacion.setForeground(Color.BLACK);
		lblMultiplicacion.setBackground(Color.WHITE);
		final ImageIcon icono_multiplicacion = new ImageIcon(multiplicacion.getImage()
				.getScaledInstance(lblMultiplicacion.getWidth(), lblMultiplicacion.getHeight(), Image.SCALE_DEFAULT));
		lblMultiplicacion.setIcon(icono_multiplicacion);

		lblDivision = new JLabel("");
		lblDivision.setBounds(10, 59, 37, 37);
		panel_2.add(lblDivision);
		lblDivision.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lblDivision.setHorizontalAlignment(SwingConstants.CENTER);
		lblDivision.setForeground(Color.BLACK);
		lblDivision.setBackground(Color.WHITE);
		final ImageIcon icono_division = new ImageIcon(division.getImage().getScaledInstance(lblDivision.getWidth(),
				lblDivision.getHeight(), Image.SCALE_DEFAULT));
		lblDivision.setIcon(icono_division);

		lblSuma = new JLabel("");
		lblSuma.setBounds(10, 107, 37, 37);
		panel_2.add(lblSuma);
		lblSuma.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lblSuma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma.setForeground(Color.BLACK);
		lblSuma.setBackground(Color.WHITE);
		final ImageIcon icono_suma = new ImageIcon(
				suma.getImage().getScaledInstance(lblSuma.getWidth(), lblSuma.getHeight(), Image.SCALE_DEFAULT));
		lblSuma.setIcon(icono_suma);

		lblResta = new JLabel("");
		lblResta.setBounds(10, 155, 37, 37);
		panel_2.add(lblResta);
		lblResta.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lblResta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResta.setForeground(Color.BLACK);
		lblResta.setBackground(Color.WHITE);
		final ImageIcon icono_resta = new ImageIcon(
				resta.getImage().getScaledInstance(lblResta.getWidth(), lblResta.getHeight(), Image.SCALE_DEFAULT));
		lblResta.setIcon(icono_resta);

		lblIgual = new JLabel("");
		lblIgual.setBounds(10, 232, 37, 37);
		panel_2.add(lblIgual);
		lblIgual.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		lblIgual.setHorizontalAlignment(SwingConstants.CENTER);
		lblIgual.setForeground(Color.BLACK);
		lblIgual.setBackground(Color.WHITE);
		final ImageIcon icono_igual = new ImageIcon(
				igual.getImage().getScaledInstance(lblIgual.getWidth(), lblIgual.getHeight(), Image.SCALE_DEFAULT));
		lblIgual.setIcon(icono_igual);
	}

	public static void main(String[] args) {

		ventana_calculadora_1 calculadora1 = new ventana_calculadora_1();
		calculadora1.setLocationRelativeTo(null);
		calculadora1.setVisible(true);

	}
}
