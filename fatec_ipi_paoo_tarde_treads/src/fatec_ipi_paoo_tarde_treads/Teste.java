package fatec_ipi_paoo_tarde_treads;

public class Teste {

	public static void main(String[] args) {
		MinhaPrimeiraThreads thread = new MinhaPrimeiraThreads();
		//thread.run();
		//devemos chamar o metodo start();
		for (int i=0;i<10;i++) {
			new MinhaPrimeiraThreads().start();
		}
		
		
		System.out.println("No main" + Thread.currentThread().getName());
	}

}
