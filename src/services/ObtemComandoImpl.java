package services;

import java.util.Scanner;

public class ObtemComandoImpl implements ObtemComando {

	@Override
	public int execute() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número da opção que deseja");
		int comando = entrada.nextInt();
		return comando;		
	}

}
