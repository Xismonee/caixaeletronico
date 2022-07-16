package services;

import repository.MemoriaContaRepository;
import model.Conta;

public class DepositoImpl implements Deposito {
	private final MemoriaContaRepository repository;
	DepositoImpl(MemoriaContaRepository repository){
		this.repository = repository;
	}
	@Override
	public void execute(double valor, int numeroDaConta) {
		
		Conta conta;
		conta = repository.findById(numeroDaConta);
		conta.adicionaSaldo(valor);
		
		System.out.println("Depósito realizado com sucesso");
		System.out.println("Número da conta é " + numeroDaConta);
		System.out.println("Saldo atual da conta é " + conta.getSaldo());		
	}

}
