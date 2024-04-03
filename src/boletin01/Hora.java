package boletin01;

public class Hora {
	protected int hora;
	protected int minutos;

	public Hora(int hora, int minutos) {
		if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59) {
			this.hora = hora;
			this.minutos = minutos;
		}
	}

	public void inc() {
		minutos++;
		if (minutos == 60) {
			minutos = 0;
			hora = (hora + 1) % 24;
		}
	}

	public boolean setMinutos(int valor) {
		boolean res = false;
		if (valor >= 0 && valor <= 59) {
			this.minutos = valor;
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
		
    	if (minutos < 10) {
    		res += "0" + minutos;
    	}else {
    		res += minutos;
    	}
    	
		return res;
}
}
