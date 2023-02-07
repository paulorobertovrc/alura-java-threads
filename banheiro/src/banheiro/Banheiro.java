package banheiro;

public class Banheiro {

	public void fazNumero1() {
		
		String nome = Thread.currentThread().getName();
		
		System.out.println(nome + " está batendo na porta");
		
		synchronized (this) {
			System.out.println(nome + " está entrando no banheiro");
			System.out.println("Fazendo coisa rápida");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Dando descarga");
			System.out.println("Lavando as mãos");
			System.out.println(nome + " está saindo do banheiro");			
		}		
	}
	
	public void fazNumero2() {
		
		String nome = Thread.currentThread().getName();
		
		System.out.println(nome + " está batendo na porta");
		
		synchronized (this) {
			System.out.println(nome + " está entrando no banheiro");
			System.out.println("Fazendo coisa demorada");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Dando descarga");
			System.out.println("Lavando as mãos");
			System.out.println(nome + " está saindo do banheiro");			
		}
	}
}
