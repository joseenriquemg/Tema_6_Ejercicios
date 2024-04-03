package boletin01;

public class Principal {

	public static void main(String[] args) {
		HoraExacta he = new HoraExacta (23, 59, 59);
		
		he.inc();
		
		System.out.println(he);
	}

}
