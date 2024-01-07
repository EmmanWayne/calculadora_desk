package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ventana_calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public ventana_calculadora() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setBounds(10, 11, 264, 49);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 71, 52, 49);
		contentPane.add(lblNewLabel);
	}

	public static void main(String[] args) {
		ventana_calculadora calculadora = new ventana_calculadora();
		calculadora.setDefaultCloseOperation(EXIT_ON_CLOSE);
		calculadora.setLocationRelativeTo(null);
		calculadora.setVisible(true);
	}
}
