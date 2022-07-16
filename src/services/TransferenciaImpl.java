package services;

import repository.MemoriaContaRepository;
import model.Conta;

public class TransferenciaImpl implements Transferencia {

	private final MemoriaContaRepository repository;
	TransferenciaImpl(MemoriaContaRepository repository){
		this.repository = repository;
	}
	
	@Override
	public double transferir(double valor, Conta origem, Conta destino) {
		Conta conta = new Conta();
		conta = repository.findById(conta.getNumeroDaConta());
		conta.retirarSaldo(valor);
		
		System.out.println("Transferência realizada com sucesso!!" + valor);
		System.out.printf("Seu saldo é de R$ %.2f %n ", conta.getSaldo());
		
		return valor;
	}

	@Override
	public void execute(double valor, int numero) {
		// TODO Auto-generated method stub
		
	}

}
