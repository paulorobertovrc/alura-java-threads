package banheiro;

public class Principal {

	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
		Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
		
		Thread faxineira = new Thread(new TarefaLimpeza(banheiro), "Ana");
		faxineira.setDaemon(true);
		
		convidado1.start();
		convidado2.start();

		faxineira.start();
	}
	
}
