package br.com.alura.threads;

public class ImprimeStringMain {
	
	public static void main(String[] args) {
		Runnable tarefa = new ImprimeString();
		
		Thread thread = new Thread(tarefa);
		thread.start();
	}

}
