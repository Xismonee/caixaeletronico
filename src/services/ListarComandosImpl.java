package services;

public class ListarComandosImpl implements ListarComandos {
    
	@Override
	public void execute(){
		System.out.println("Qual servi�o voc� deseja realizar?");
		System.out.println("Digite 0 para encerrar");
		System.out.println("Digite 1 para Saque");
		System.out.println("Digite 2 para Dep�sito");
		System.out.println("Digite 3 para Conta");
	}
}
