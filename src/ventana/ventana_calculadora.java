package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class ventana_calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_calculadora frame = new ventana_calculadora();
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
	public ventana_calculadora() {
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
		
		JButton btnNewButton = new JButton("/");
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton.setBounds(10, 70, 58, 59);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("*");
		btnNewButton_1.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1.setBounds(78, 70, 58, 59);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_2.setBounds(148, 71, 58, 59);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("<-");
		btnNewButton_1_1.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(216, 71, 58, 59);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton_3.setBounds(10, 140, 58, 59);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton_1_2.setBounds(78, 140, 58, 59);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_1 = new JButton("3");
		btnNewButton_2_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(148, 141, 58, 59);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("New button");
		btnNewButton_1_1_1.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(216, 141, 58, 59);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton_4.setBounds(10, 210, 58, 59);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton_1_3.setBounds(78, 210, 58, 59);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton_2_2.setBounds(148, 211, 58, 59);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_1_1_2 = new JButton("New button");
		btnNewButton_1_1_2.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_1_2.setBounds(216, 211, 58, 59);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton_5.setBounds(10, 280, 58, 59);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_4 = new JButton("8");
		btnNewButton_1_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton_1_4.setBounds(78, 280, 58, 59);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_2_3 = new JButton("9");
		btnNewButton_2_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton_2_3.setBounds(148, 281, 58, 59);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_1_1_3 = new JButton("New button");
		btnNewButton_1_1_3.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_1_3.setBounds(216, 281, 58, 59);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnCe.setBounds(10, 350, 58, 59);
		contentPane.add(btnCe);
		
		JButton btnNewButton_1_5 = new JButton("0");
		btnNewButton_1_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton_1_5.setBounds(78, 350, 58, 59);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_2_4 = new JButton(".");
		btnNewButton_2_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton_2_4.setBounds(148, 351, 58, 59);
		contentPane.add(btnNewButton_2_4);
		
		JButton btnNewButton_1_1_4 = new JButton("=");
		btnNewButton_1_1_4.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_1_4.setBounds(216, 351, 58, 59);
		contentPane.add(btnNewButton_1_1_4);
	}
}
