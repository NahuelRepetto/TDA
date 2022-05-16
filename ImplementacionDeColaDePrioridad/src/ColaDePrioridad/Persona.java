package ColaDePrioridad;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private int prioridad;
	
	public Persona(String nombre, int prioridad) {
		super();
		this.nombre = nombre;
		this.prioridad = prioridad;
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
