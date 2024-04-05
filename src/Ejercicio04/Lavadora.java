package Ejercicio04;

/**
 * Clase que contiene los atributos y métodos de una lavadora, 
 * que extiende de la clase Electrodomestico
 * 
 * @author Amaro
 */
public class Lavadora extends Electrodomestico {

	/**
	 * Atributo que almacena la carga
	 */
	private double carga = 5;

	/**
	 * Constructor vacío
	 */
	public Lavadora() {
	}

	/**
	 * Constructor con los parámetros precioBase y peso
	 * 
	 * @param precioBase Precio base de la lavadora
	 * @param peso       Peso de la lavadora
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}
	
	/**
	 * Constructor con todos los parámetros
	 * @param precioBase Precio base de la lavadora
	 * @param color Color de la lavadora
	 * @param consumoEnergetico Consumo de la lavadora
	 * @param peso Peso de la lavadora
	 * @param carga Carga de la lavadora
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);

		// Comprobamos que la carga sea mayor o igual que 0
		if (carga >= 0) {
			this.carga = carga;
		}
	}
	
	/**
	 * Obtiene la carga de la lavadora 
	 * @return Devuelve la carga de la lavadora
	 */
	public double getCarga() {
		return this.carga;
	}
	
	/**
	 * Método que modifica el precio base según el peso, el consumo energético
	 * y la carga
	 */
	public void precioFinal() {
		// Llamamos al método padre
		super.precioFinal();
		
		// Comprobamos si la carga es mayor a 30 kg
		if (this.carga > 30) {
			// Aumentamos el precio 50 €
			super.precioBase += 50;
		}
	}
	
	/**
	 * Método que devuelve la información de la lavadora
	 * como cadena
	 * 
	 * @return Devuelve la información del electrodomestico
	 */
	@Override
	public String toString() {
		// Variable donde se almacenará la información
		String info = "";
		
		// Almacenamos la información
		info += "Precio base: " + super.precioBase + " €";
		info += "\nColor: " + super.color;
		info += "\nConsumo: " + super.consumoEnergetico;
		info += "\nPeso: " + super.peso + " kg";
		info += "\nCarga: " + this.carga + " kg";
		
		// Devolvemos la información
		return info;
	}

	
	
}
