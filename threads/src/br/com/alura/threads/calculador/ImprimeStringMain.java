package br.com.alura.threads.calculador;

public class ImprimeStringMain {
	
	public static void main(String[] args) {
		Runnable tarefa = new ImprimeString();
		
		Thread thread = new Thread(tarefa);
		thread.start();
	}

}
