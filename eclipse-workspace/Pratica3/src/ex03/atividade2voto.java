package ex03;

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
import javax.swing.JOptionPane;

public class atividade2voto extends JFrame {

	private JPanel contentPane;
	private JTextField textVoto;
	double candidatoA, candidatoB, nulo, branco, total;
	int voto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atividade2voto frame = new atividade2voto();
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
	public atividade2voto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("20 - MARIA");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel.setBounds(119, 28, 120, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblMaria = new JLabel("30 - MARIA");
		lblMaria.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblMaria.setBounds(119, 49, 120, 21);
		contentPane.add(lblMaria);
		
		JLabel lblNulo = new JLabel("1 - NULO");
		lblNulo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNulo.setBounds(119, 70, 120, 21);
		contentPane.add(lblNulo);
		
		JLabel lblBranco = new JLabel("2 - BRANCO");
		lblBranco.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblBranco.setBounds(119, 91, 120, 21);
		contentPane.add(lblBranco);
		
		JLabel lblNewLabel_1 = new JLabel("SEU VOTO:");
		lblNewLabel_1.setBounds(40, 149, 54, 26);
		contentPane.add(lblNewLabel_1);
		
		textVoto = new JTextField();
		textVoto.setBounds(104, 152, 86, 20);
		contentPane.add(textVoto);
		textVoto.setColumns(10);
		
		JButton btnNewButton = new JButton("Votar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			voto = Integer.parseInt(textVoto.getText());
			switch (voto)
			ca
			}
		});
		btnNewButton.setBounds(40, 209, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(150, 209, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnApurar = new JButton("Apurar");
		btnApurar.setBounds(259, 209, 89, 23);
		contentPane.add(btnApurar);
	}
}
