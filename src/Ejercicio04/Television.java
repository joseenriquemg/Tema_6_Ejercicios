package Ejercicio04;

/**
 * Clase que contiene los atributos y métodos de una televisión y extiende de la
 * clase Electrodomestico
 * 
 * @author Amaro
 */
public class Television extends Electrodomestico {

	/**
	 * Atributo que almacena la resolución en pulgadas
	 */
	private double resolucion = 20;

	/**
	 * Atributo que almacena el sintonizador TDT
	 */
	private boolean sintonizador = false;

	/**
	 * Constructor vacío
	 */
	public Television() {
	}

	/**
	 * Constructor con los parámetros precio base y peso
	 * 
	 * @param precioBase Precio base de la televisión
	 * @param peso       Peso de la televisión
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor con los parámetros heredados, resolución y sintonizador
	 * 
	 * @param precioBase        Precio base de la televisión
	 * @param color             Color de la televisión
	 * @param consumoEnergetico Consumo energético de la televisión
	 * @param peso              Peso de la televisión
	 * @param resolucion        Resolución de la televisión
	 * @param sintonizador      Sintonizador de la televisión
	 */
	public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion,
			boolean sintonizador) {
		super(precioBase, color, consumoEnergetico, peso);

		// Comprobamos que la resolución sea mayor que 0
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}

		// Asignamos el sintonizador
		this.sintonizador = sintonizador;
	}

	/**
	 * Obtiene la resolución de la televisión
	 * 
	 * @return Devuelve la resolución de la televisión
	 */
	public double getResolucion() {
		return resolucion;
	}

	/**
	 * Obtiene el sintonizador de la televisión
	 * 
	 * @return Devuelve el sintonizador de la televisión
	 */
	public boolean isSintonizador() {
		return sintonizador;
	}
	
	/**
	 * Método que incrementa el precio base si la resolución
	 * es mayor que 40 y/o si tiene sintonizador TDT 
	 * incorporado
	 */
	public void precioFinal() {
		// Implementamos el método padre
		super.precioFinal();
		
		// Comprobamos si tiene una resolución mayor a 40 pulgadas
		if (this.resolucion > 40) {
			// Aumentamos el precio un 30%
			super.precioBase += (super.precioBase * 0.3);
		}
		
		// Comprobamos si tiene un sintonizador TDT incorporado
		if (this.sintonizador) {
			// Aumentamos el prcio 50 €
			super.precioBase += 50;
		}
	}
	
	/**
	 * Método que devuelve la información de la televisión
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
		info += "\nResolución: " + this.resolucion + " pulgadas";
		info += "\nSintonizador: " + this.sintonizador;
		
		// Devolvemos la información
		return info;
	}

}
