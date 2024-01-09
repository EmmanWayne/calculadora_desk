package ventanas_calculadoras;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;

public class ventana_calculadora_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public ventana_calculadora_1() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

	public static void main(String[] args) {

		ventana_calculadora_1 calculadora1 = new ventana_calculadora_1();
		calculadora1.setLocationRelativeTo(null);
		calculadora1.setVisible(true);

	}

}
