package br.com.alura.threads.busca_textual;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

	private String nomeArquivo;
	private String nomeBuscado;

	public TarefaBuscaTextual(String nomeArquivo, String nomeBuscado) {
		this.nomeArquivo = nomeArquivo;
		this.nomeBuscado = nomeBuscado;
		
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(nomeArquivo));
			int numeroLinha = 1;
			
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				
				if (linha.toLowerCase().contains(nomeBuscado.toLowerCase())) {
					System.out.println(nomeArquivo + " - " + numeroLinha +  " - " + linha);
				}
				
				numeroLinha++;
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
