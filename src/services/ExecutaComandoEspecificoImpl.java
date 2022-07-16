package services;

import java.util.Scanner;

import repository.MemoriaContaRepository;

public class ExecutaComandoEspecificoImpl implements ExecutaComandoEspecifico {
	private final Saque saque;
	private final Deposito deposito;
	private final MemoriaContaRepository repository;
	private AbrirConta abrirConta;
	private final Transferencia transferencia;

	public ExecutaComandoEspecificoImpl() {
		this.repository = new MemoriaContaRepository();
		this.deposito = new ExecutarDepositoImpl(repository);
		this.saque = new ExecutarSaqueImpl();
		this.abrirConta = new AbrirContaImpl(repository);
		this.transferencia = new TransferenciaImpl(repository);

	}

	@Override
	public boolean execute(int comando) {
		boolean resultado = true;

		if (comando == 0) {
			System.out.println("Encerrando o programa");
			resultado = false;

		} else if (comando == 1) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o número da conta");
			int numeroDaConta = entrada.nextInt();
			System.out.println("Informe o valor a ser sacado");
			double valor = entrada.nextDouble();
			this.saque.execute(valor, numeroDaConta);
			System.out.println("Sacando Dinheiro!");

		} else if (comando == 2) {
			System.out.println("Digite o número da conta ");
			Scanner entrada = new Scanner(System.in);
			int numero = entrada.nextInt();
			System.out.println("Digite o valor a ser depositado");
			double valor = entrada.nextInt();
			this.deposito.execute(valor, numero);
			System.out.println("Seu Depósito Foi Realizado Com Sucesso!!");

		} else if (comando == 3) {
			abrirConta.execute();
		} else {
			System.out.println("Opção invalida");
		}
		return resultado;
	}
}
