package buscaminasPrueba;

import java.util.ArrayList;

public class ListaCasillas {

	public ArrayList<Casilla> lista;

	public ListaCasillas() {
		lista = new ArrayList<Casilla>();
		CasillaBomba casillaBomba = new CasillaBomba();
		CasillaVacia casillaVacia = new CasillaVacia();
		lista.add(casillaVacia);
		lista.add(casillaVacia);
		lista.add(casillaVacia);
		lista.add(casillaBomba);
	}

	public ArrayList<Casilla> getCasillas() {
		return lista;
	}
}
