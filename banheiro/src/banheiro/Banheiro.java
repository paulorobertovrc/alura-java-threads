package banheiro;

public class Banheiro {
	
	private boolean ehSujo = false;

	public void fazNumero1() {
				
		String nome = Thread.currentThread().getName();
		
		System.out.println(nome + " está batendo na porta");
		
		synchronized(this) {
			System.out.println(nome + " está entrando no banheiro");
			
			while(ehSujo) {
				esperarLaFora(nome);
			}
			
			System.out.println(nome + " está fazendo coisa rápida");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ehSujo = true;
			
			System.out.println(nome + " está dando descarga");
			System.out.println(nome + " está lavando as mãos");
			System.out.println(nome + " está saindo do banheiro");			
		}		
	}
	
	public void fazNumero2() {
		
		String nome = Thread.currentThread().getName();
		
		System.out.println(nome + " está batendo na porta");
		
		synchronized(this) {
			System.out.println(nome + " está entrando no banheiro");
			
			while(ehSujo) {
				esperarLaFora(nome);
			}
			
			System.out.println(nome + " está fazendo coisa demorada");
			
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ehSujo = true;
			
			System.out.println(nome + " está dando descarga");
			System.out.println(nome + " está Lavando as mãos");
			System.out.println(nome + " está saindo do banheiro");			
		}
	}
	
	public void limpar() {
		
		String nome = Thread.currentThread().getName();
		
		System.out.println(nome + " está batendo na porta");
		
		synchronized(this) {
			System.out.println(nome + " está entrando no banheiro");
			
			if(!ehSujo) {
				System.out.println(nome + " está saindo do banheiro porque não está sujo!");
				return;
			}
			
			System.out.println(nome + " está limpando o banheiro");
			this.ehSujo = false;
			
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(nome + " está saindo do banheiro");
			this.notifyAll();
		}
	}
	
	private void esperarLaFora(String nome) {
		System.out.println(nome + " está saindo do banheiro porque está sujo!");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
