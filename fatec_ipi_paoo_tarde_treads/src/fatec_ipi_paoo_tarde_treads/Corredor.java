package fatec_ipi_paoo_tarde_treads;

public class Corredor implements Runnable {
private double distanciaTotalCorrida = 500;
private double distanciaTotalPercorrida =0;
private Thread mainThread;
private int max = 0;


public Corredor (Thread mainThread, int max) {
	this.mainThread = mainThread;
	this.max = max;
	
}
	@Override
	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while (distanciaTotalPercorrida < distanciaTotalCorrida) {
			distanciaTotalPercorrida += Math.random() * max;
			System.out.printf("%s: %.2fm\n", Thread.currentThread().getName(),distanciaTotalPercorrida);
			if (distanciaTotalPercorrida > distanciaTotalCorrida) 
				System.out.println(Thread.currentThread().getName()+ "Acabou");
				try {
					Thread.sleep(2000 + (int)Math.random() * 10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
					
		}
		
	}
	

}
