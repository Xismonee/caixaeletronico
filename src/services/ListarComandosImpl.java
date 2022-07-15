package services;

public class ListarComandosImpl implements ListarComandos {
    
	@Override
	public void execute(){
		System.out.println("Seja Bem Vindo (a)! Qual serviço deseja realizar?");
		System.out.println("Digite 0 para encerrar");
		System.out.println("Digite 1 para Saque");
		System.out.println("Digite 2 para Depósito");
		System.out.println("Digite 3 para Abrir Nova Conta");
	}
}
