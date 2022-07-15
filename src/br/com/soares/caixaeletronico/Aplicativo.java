package br.com.soares.caixaeletronico;

import services.SelecionaComando;

public class Aplicativo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Caixa eletrônico ligado!");

		SelecionaComando selecionacomando = new SelecionaComando();
		while (selecionacomando.executar());
			
		{
			System.out.println("Executando um novo comando!");

		}
		System.out.println("Caixa eletrônico desligando!");
	}
}
