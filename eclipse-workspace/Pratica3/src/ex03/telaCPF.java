package ex03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class telaCPF extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCPF frame = new telaCPF();
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
	public telaCPF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(59, 55, 46, 14);
		contentPane.add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBounds(129, 52, 199, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(59, 100, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textCPF = new JTextField();
		textCPF.setBounds(129, 97, 199, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Validar CPF");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String CPF=textCPF.getText();
				if (ValidaCPF.isCPF(CPF)==true)
					JOptionPane.showMessageDialog(null, "CPF Válido");
				else
					JOptionPane.showMessageDialog(null, "CPF Inválido");
				
			}
		});
		btnNewButton.setBounds(170, 175, 89, 23);
		contentPane.add(btnNewButton);
	}

}
