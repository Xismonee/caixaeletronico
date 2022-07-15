package services;

import repository.MemoriaContaRepository;
import model.Conta;

public class AbrirContaImpl implements AbrirConta{

	private final MemoriaContaRepository repository;
	
	public AbrirContaImpl(MemoriaContaRepository repository){
		this.repository = repository;
	}
	@Override
	public Conta execute() {
		Conta conta;
		conta = new Conta();
		repository.adiciona(conta);
		
		System.out.printf("Conta número %d o saldo atual é de ");
		return conta;
		
	}

}
