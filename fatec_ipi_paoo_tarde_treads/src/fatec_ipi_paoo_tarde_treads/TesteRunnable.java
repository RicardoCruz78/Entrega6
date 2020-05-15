package fatec_ipi_paoo_tarde_treads;

public class TesteRunnable {

	public static void main(String[] args) {
		Thread thread = new Thread(new MinhaPrimeiraAtividade());
		thread.start();
		System.out.println("Chega ao fim do main.....");

	}

}