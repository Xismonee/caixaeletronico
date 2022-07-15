package services;

import java.util.Scanner;

import repository.MemoriaContaRepository;


public class ExecutaComandoEspecificoImpl implements ExecutaComandoEspecifico {
	private final Saque saque;
    private final Deposito deposito;
    private final MemoriaContaRepository conta;
	private AbrirConta abrirConta;
	
    public ExecutaComandoEspecificoImpl(){
    	MemoriaContaRepository repository = new MemoriaContaRepository();
    	this.deposito = new ExecutarDepositoImpl(repository);
    	this.abrirConta = new AbrirContaImpl(repository);
        	
    }
    
	@Override
  public boolean execute(int comando){
	   boolean resultado = true;
	   
	   if(comando == 0){
		   System.out.println("Encerrando o programa");
		   resultado = false;
		   
	   }else if (comando ==1){
		   System.out.println("Sacando Dinheiro");
		   
	   }else if(comando == 2){
		   System.out.println("Digite o número da conta ");
		   Scanner entrada = new Scanner(System.in);
		   int numero = entrada.nextInt();
		   System.out.println("Digite o valor a ser depositado");
		   double valor = entrada.nextInt();
		    this.deposito.execute(valor, numero);
		    System.out.println("Seu Depósito Foi Realizado Com Sucesso!!");
		   
	   }else if(comando == 3){
		   abrirConta.execute();		   
	   }else{
		   System.out.println("Opção invalida");
	   }
	return resultado;
   }
}
