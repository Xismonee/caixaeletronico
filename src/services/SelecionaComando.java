package services;

import java.util.Scanner;

public class SelecionaComando {

	ListarComandos listarComandos;
	ObtemComando obtemComando;

	public SelecionaComando() {
		this.listarComandos = new ListarComandosImpl();
	}

	public boolean executar() {
		listarComandos.execute();
		int comando = obtemComando.execute();
		return executaComandoEspecifico(comando);

	}

	private int obtemComando() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o comando que deseja!");
		int comando = entrada.nextInt(); // entrada do usuario
		return comando;
	}

	private boolean executaComandoEspecifico(int comando) {
		boolean resultado = true;
		switch (comando) {
		case 0:
			System.out.println("Encerrando programa");
			resultado = false;
			break;
		case 1:
			System.out.println("Saque realizado com sucesso!");
			break;
		case 2:
			System.out.println("Depósito realizado com sucesso!");
			break;
		default:
			System.out.println("Comando Inválido");
			break;
		}
		return resultado;
	}
}
