package ColaDePrioridad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColaPrioridad<T extends Comparable<T>> {

	private List<T> lista = new ArrayList<T>();
	private int CantObjetos = 0;

	public ColaPrioridad() {
		T T = null;
		lista.add(0, T);
	}

	public void insert(T objeto) {

		CantObjetos++;
		int indice = CantObjetos;
		int padre = indice / 2;

		lista.add(indice, objeto);

		if (CantObjetos > 1) {
			while (((Comparable<T>) lista.get(padre)).compareTo(objeto) < 0) { 	// SI EL VALOR DEL PADRE ES MENOR QUE EL
												// VALOR DEL HIJO
				Collections.swap(lista, padre, indice); 			// LOS INTERCAMBIO
				indice = padre;
				padre = indice / 2;
			}
		}
	}

	public T getMax() {
		return lista.get(1);
	}

	public T removeMax() {
		T max = lista.remove(1);
		lista.add(1, lista.get(CantObjetos - 1));
		lista.remove(CantObjetos);
		CantObjetos--;

		int indiceActual = 1;
		int hijoIzq = 2 * indiceActual;
		int hijoDer = hijoIzq + 1;
		int compararCon = indiceActual;
		boolean soyMayor = false;

		while (CantObjetos >= hijoIzq && !soyMayor) { 				// VOY A COMPARAR AL PADRE CON SUS HIJOS MIENRTRAS EXISTA AL MENOS EL HIJO IZQUIERDO
											// O HASTA DETERMINAR QUE SOY MAYOR QUE MI HIJO/HIJOS EN CASO DE TENERLO/OS
			compararCon = hijoIzq; 						// POR DEFECTO COMPARO CON HIJO IZQ QUE SE QUE EXISTE

			if (CantObjetos >= hijoDer) { 					// SI TAMBIEN EXISTE UN HIJO DERECHO COMPARO AL PADRE CON EL MAYOR DE SUS HIJOS
				if (((Comparable<T>) lista.get(hijoDer)).compareTo(lista.get(hijoIzq)) > 0) { 	// SI HIJO DER > HIJO IZQ
					compararCon = hijoDer; 							// COMPAROCION = HIJO DER
				}
			}

			if (((Comparable<T>) lista.get(indiceActual)).compareTo(lista.get(compararCon)) < 0) { 	// COMPARO AL PADRE CON EL MAYOR DE SUS HIJOS
				Collections.swap(lista, indiceActual, compararCon); 				// SI EL HIJO ES MAYOR LO INTERCAMBIO CON SU PADRE
				indiceActual = compararCon;
				hijoIzq = 2 * indiceActual;
				hijoDer = hijoIzq + 1;
			} else {
				soyMayor = true; 																	// SINO DETERMINO QUE EL PADRE ES MAYOR QUE SUS HIJOS
			}
		}
		return max;
	}

	public int size() {
		return CantObjetos;
	}

	public boolean IsEmpty() {
		return CantObjetos == 0;
	}
}
