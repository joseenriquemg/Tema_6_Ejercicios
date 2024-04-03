package Ejercicio01;

public class Hora {
	protected int hora;
	protected int minuto;

	public Hora(int hora, int minutos) {
		if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59) {
			this.hora = hora;
			this.minuto = minutos;
		}
	}

	public void inc() {
		minuto++;
		if (minuto == 60) {
			minuto = 0;
			hora = (hora + 1) % 24;
		}
	}

	public boolean setMinutos(int valor) {
		boolean res = false;
		if (valor >= 0 && valor <= 59) {
			this.minuto = valor;
			res = true;
		}
		return res;
	}

	public boolean setHora(int valor) {
		boolean res = false;
		if (valor >= 0 && valor <= 23) {
			this.hora = valor;
			res = true;
		}
		return res;
	}

	public String toString() {
		String res = "";
    	
		if (hora < 10) {
    		res += "0" + hora +":";
    	}else {
    		res += hora +":";
    	}
		
    	if (minuto < 10) {
    		res += "0" + minuto;
    	}else {
    		res += minuto;
    	}
    	
		return res;
}
}
