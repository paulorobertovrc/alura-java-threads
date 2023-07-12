package lista;

public class Lista {
	
	private String[] elementos = new String[100];
	private int indice = 0;
	
	public synchronized void adicionarElementos(String elemento) {
		this.elementos[indice] = elemento;
		this.indice++;
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (this.estaCheia()) {
			System.out.println("a lista está cheia - notificando");
			this.notify();
		}
		
	}
	
	public int tamanho() {
		return this.elementos.length;
	}
	
	public String pegarElemento(int posicao) {
		return this.elementos[posicao];
	}

	public boolean estaCheia() {
		return this.indice == this.elementos.length;
	}
	
}
