package Ejercicio04;

public class Main {
	public static void main(String[] args) {
		// Array de electrodomésticos de 10 posiciones
		Electrodomestico[] arrayElec = new Electrodomestico[10];
		
		double suma = 0;
		double lavadoras = 0;
		double television = 0;
		
		// Electrodomestico 1
		Electrodomestico el1 = new Electrodomestico(25, "rojo", 'A', 10);
		arrayElec[0] = el1;
		Electrodomestico el2 = new Electrodomestico(40, "blanco", 'B', 5);
		arrayElec[1] = el2;
		Electrodomestico el3 = new Electrodomestico(60, "azul", 'A', 12);
		arrayElec[2] = el3;
		
		
		Lavadora lav1 = new Lavadora(100, "negro", 'A', 40, 10);
		arrayElec[3] = lav1;
		Lavadora lav2 = new Lavadora(50, "blanco", 'C', 30, 25);
		arrayElec[4] = lav2;
		Lavadora lav3 = new Lavadora(70, "rojo", 'D', 60, 5);
		arrayElec[5] = lav3;
		
		
		Television tv1 = new Television(100, "negro", 'B', 10, 20, true);
		arrayElec[6] = tv1;
		Television tv2 = new Television(300, "blanco", 'A', 15, 12, false);
		arrayElec[7] = tv2;
		Television tv3 = new Television(350, "azul", 'C', 10, 15, true);
		arrayElec[8] = tv3;
		Television tv4 = new Television(250, "rojo", 'D', 15, 25, false);
		arrayElec[9] = tv4;
		
		for (Electrodomestico ed : arrayElec) {
			ed.precioFinal();
			
			System.out.println("Precio: " + ed.getPrecioBase() + " €");
			
			if (ed instanceof Lavadora) {
				lavadoras += ed.getPrecioBase();
			}
			
			if (ed instanceof Television) {
				television += ed.getPrecioBase();
			}
			
			if (ed instanceof Electrodomestico) {
				suma += ed.getPrecioBase();
			}
		}
		
		
		System.out.println("Total lavadoras: " + lavadoras + " €");
		System.out.println("Total televisiones: " + television + " €");
		
		System.out.println("Total: " + suma + " €");
		
	}
	
}


