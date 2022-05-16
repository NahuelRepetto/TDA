package ColaDePrioridad;

public class App {
	public static void main(String[] args) {

		ColaPrioridad<Integer> colaDeEnteros = new ColaPrioridad<Integer>();
	
		colaDeEnteros.insert(10);
		colaDeEnteros.insert(3);
		colaDeEnteros.insert(9);
		colaDeEnteros.insert(1);
		colaDeEnteros.insert(6);
		colaDeEnteros.insert(7);

		System.out.println("COLA DE ENTEROS");		

		int iteraciones = colaDeEnteros.size();

		for (int i = 0; i < iteraciones; i++) {
			System.out.println(colaDeEnteros.removeMax());
		}
		
		System.out.println("");
		System.out.println("");

		ColaPrioridad<Persona> colaDePersonas = new ColaPrioridad<Persona>();
		
		colaDePersonas.insert(new Persona("p1", 10));
		colaDePersonas.insert(new Persona("p2", 3));
		colaDePersonas.insert(new Persona("p3", 9));
		colaDePersonas.insert(new Persona("p4", 1));
		colaDePersonas.insert(new Persona("p5", 6));
		colaDePersonas.insert(new Persona("p6", 7));

		System.out.println("COLA DE PERSONAS");
				
		int iteracionesPersonas = colaDePersonas.size();
		
		for (int i = 0; i < iteracionesPersonas; i++) {
			System.out.println(colaDePersonas.removeMax());
		}

	}
}
