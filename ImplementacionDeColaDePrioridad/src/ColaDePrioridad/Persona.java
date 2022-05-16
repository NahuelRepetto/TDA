package ColaDePrioridad;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private int prioridad;
	
	public Persona(String nombre, int prioridad) {
		super();
		this.nombre = nombre;
		this.prioridad = prioridad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getPrioridad() {
		return prioridad;
	}

	@Override
	public String toString() {
		return nombre + " prioridad= " + prioridad;
	}

	@Override
	public int compareTo(Persona o) {		
		return Integer.compare(prioridad, o.prioridad);
	}
	
}