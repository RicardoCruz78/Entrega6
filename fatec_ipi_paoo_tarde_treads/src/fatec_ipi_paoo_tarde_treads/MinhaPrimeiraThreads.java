package fatec_ipi_paoo_tarde_treads;

public class MinhaPrimeiraThreads extends Thread {
	public void run () {
		System.out.println("Estou sendo executando por uma "
				+ " thread diferente da principal,veja "
				+Thread.currentThread().getName());
		m();
	}
	  public void m(){}
}

