package Ejercicio01;

public class HoraExacta extends Hora {
    private int segundos;
    
    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } 
    }
    
    public boolean setSegundo(int valor) {
    	boolean res = false;
        if (valor >= 0 && valor <= 59) {
            this.segundos = valor;
            res = true;
        } 
            return res;
        }
    
    
    @Override
    public void inc() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            super.inc();
        }
    }
    
    @Override
    public String toString() {
    	String res = super.toString();
    	
    	res = ":";
    	
    	if (segundos < 10) {
    		System.out.println("0" + segundos);
    	}
		return res;
    }
}
