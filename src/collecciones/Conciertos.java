package collecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Conciertos {

	public static <K> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			double presupuesto = sc.nextDouble();
			int conciertos = sc.nextInt();
			HashMap<String, Double> lista = new HashMap<String, Double>();
			for (int j = 0; j < conciertos; j++) {
				String nombre = sc.next();
				Double precio = sc.nextDouble();
				lista.put(nombre, precio);
			}
			String comprados = "";
			Double minim = Double.MAX_VALUE;
			while (presupuesto > 0) {
				for (String key : lista.keySet()) {
					Double cuesta = lista.get(key);
					if (minim > cuesta) {
						minim = cuesta;
					}

				}
				presupuesto -= minim;
				if (presupuesto < 0) {

				} else {
					Iterator it = lista.keySet().iterator();
					while(it.hasNext()){
						String llave= it.next().toString();
						Double cuesta = lista.get(llave);
						if (minim.equals(cuesta)) {
							comprados += llave + " ";
							it.remove();
						
						}
					}
					
				}
				minim=Double.MAX_VALUE;
			}
			System.out.println(comprados);

		}

	}

}
