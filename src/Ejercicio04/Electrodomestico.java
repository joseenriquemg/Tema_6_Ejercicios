package Ejercicio04;

/**
 * Clase que contiene los atributos y métodos de un electrodoméstico
 * 
 * @author Amaro
 */
public class Electrodomestico {

	/**
	 * Atributo enum que contiene las categoría del
	 * consumo energético
	 */
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	};

	/**
	 * Atributo enum que contiene los colores disponibles
	 */
	enum Colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Atributo que almacena el precio base
	 */
	protected double precioBase = 100;

	/**
	 * Atributo que almacena el color
	 */
	protected Colores color = Colores.BLANCO;

	/**
	 * Atributo que almacena el consumo energético
	 */
	protected ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;

	/**
	 * Atributo que almacena el peso
	 */
	protected double peso = 5;

	/**
	 * Constructor vacío
	 */
	public Electrodomestico() {
	}

	/**
	 * Constructor con los parámetros precio y peso
	 * 
	 * @param precioBase Precio base del electrodomestico
	 * @param peso       Peso del electrodomestico
	 */
	public Electrodomestico(double precioBase, double peso) {
		// Comprobamos que el precio sea mayor o igual que 0
		if (precioBase >= 0) {
			this.precioBase = precioBase;
		}

		// Comprobamos que el peso sea mayor o igual que 0
		if (peso >= 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor conn todos los parámetros
	 * 
	 * @param precioBase        Precio base del electrodoméstico
	 * @param color             Color del electrodoméstico
	 * @param consumoEnergetico Consumo energético del electrodoméstico
	 * @param peso              Peso del electrodoméstico
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		// Comprobamos que el precio sea mayor o igual que 0
		if (precioBase >= 0) {
			this.precioBase = precioBase;
		}

		// Comprobamos que el color no sea null ni vacío
		if (color != null && !color.equals("")) {
			comprobarColor(color);
		}

		// Comprobamos si el consumo energético es del tipo enum
		comprobarConsumoEnergetico(consumoEnergetico);

		// Comprobamos que el peso sea mayor o igual que 0
		if (peso >= 0) {
			this.peso = peso;
		}
	}

	/**
	 * Obtiene el precio base del electrodoméstico
	 * 
	 * @return Devuelve el precio base del electrodoméstico
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Obtiene el color del electrodoméstico
	 * 
	 * @return Devuelve el color del electrodoméstico
	 */
	public Colores getColor() {
		return color;
	}

	/**
	 * Obtiene el consumo energético del electrodoméstico
	 * 
	 * @return Devuelve el consumo del electrodoméstico
	 */
	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * Obtiene el peso del electrodoméstico
	 * 
	 * @return Devuelve el peso del electrodoméstico
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Comprueba si la letra introducida es un tipo enum y en caso
	 * afirmativo, le asigna el valor. En caso negativo, deja el valor por defecto
	 * @param letra Letra del consumo energético
	 */
	private void comprobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'A' -> this.consumoEnergetico = ConsumoEnergetico.A;
		case 'B' -> this.consumoEnergetico = ConsumoEnergetico.B;
		case 'C' -> this.consumoEnergetico = ConsumoEnergetico.C;
		case 'D' -> this.consumoEnergetico = ConsumoEnergetico.D;
		case 'E' -> this.consumoEnergetico = ConsumoEnergetico.E;
		case 'F' -> this.consumoEnergetico = ConsumoEnergetico.F;
		}
	}
	
	/**
	 * Comprueba si el color introducido es un tipo enum y en caso
	 * afirmativo, le asigna el valor. En caso negativo, deja el valor por defecto
	 * @param color Color del electrodoméstico
	 */
	private void comprobarColor(String color) {
		// Pasamos el color a minúsculas
		color = color.toLowerCase();
		
		switch (color) {
		case "blanco" -> this.color = Colores.BLANCO;
		case "negro" -> this.color = Colores.NEGRO;
		case "rojo" -> this.color = Colores.ROJO;
		case "azul" -> this.color = Colores.AZUL;
		case "gris" -> this.color = Colores.GRIS;
		}
	}
	
	/**
	 * Método que según el consumo energético y el peso aumenta el precio base
	 * del electrodoméstico
	 */
	public void precioFinal() {
		// Variable donde se almacenará el precio final
		double precioFinal = 0;
		
		// Comprobamos que consumo energético tiene
		switch (this.consumoEnergetico) {
		case A -> precioFinal += 100;
		case B -> precioFinal += 80;
		case C -> precioFinal += 60;
		case D -> precioFinal += 50;
		case E -> precioFinal += 30;
		case F -> precioFinal += 10;
		}
		
		// Comprobamos su peso
		if (peso >= 0 && peso <= 19) {
			precioFinal += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioFinal += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioFinal += 80;
		} else if (peso >= 80) {
			precioFinal += 100;
		}
		
		// Aumentamos el precio
		this.precioBase += precioFinal;
	}
	
	/**
	 * Método que devuelve la información del electrodoméstico
	 * como cadena
	 * 
	 * @return Devuelve la información del electrodomestico
	 */
	@Override
	public String toString() {
		// Variable donde se almacenará la información
		String info = "";
		
		// Asignamos la información
		info += "Precio base: " + this.precioBase + " €";
		info += "\nColor: " + this.color;
		info += "\nConsumo: " + this.consumoEnergetico;
		info += "\nPeso: " + this.peso + " kg";
		
		// Devolvemos la información
		return info;
	}

}