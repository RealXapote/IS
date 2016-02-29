package buscaminasPrueba;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Tablero extends JFrame {

	int cont = 0;
	ListaCasillas casillas = new ListaCasillas();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero frame = new Tablero();
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
	public Tablero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));

		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				JButton btnNewButton = new JButton("(" + i + "," + j + ")");
				contentPane.add(btnNewButton);
				Casilla casilla = casillas.getCasillas().get(cont);
				System.out.println("Casilla " + cont);
				casilla.verContenido();
				btnNewButton.addActionListener(new ManejadorDePulsarBoton());
				cont++;
			}
		}
	}

}