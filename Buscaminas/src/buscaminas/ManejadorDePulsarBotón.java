package buscaminas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ManejadorDePulsarBotón implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame,
				"El boton es el " + e.getActionCommand(), "BOTON PULSADO",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
