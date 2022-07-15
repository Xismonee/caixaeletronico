package services;


import repository.MemoriaContaRepository;
import model.Conta;

public class SaqueImpl implements Saque{
	private final MemoriaContaRepository repository;
	SaqueImpl(MemoriaContaRepository repository){
		this.repository = repository;
	}
	@Override
	public double execute(double valor, int numeroDaConta) {
		
		Conta conta;
		conta = repository.findById(numeroDaConta);
		conta.retirarSaldo(valor);
		
		System.out.println("Você sacou " + valor);
	    System.out.println("Numero da conta " + numeroDaConta);
	    System.out.println("Saldo em conta " + conta.getSaldo());
	    
	    return valor;
	    
		
	}
 
	
}
