package lista;

public class Lista {
	
	private String[] elementos = new String[100];
	private int indice = 0;
	
	public synchronized void adicionarElementos(String elemento) {
		this.elementos[indice] = elemento;
		this.indice++;			
	}
	
	public int tamanho() {
		return this.elementos.length;
	}
	
	public String pegarElemento(int posicao) {
		return this.elementos[posicao];
	}
}
