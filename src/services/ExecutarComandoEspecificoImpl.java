package services;

import repository.MemoriaContaRepository;

public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {
	private final Saque saque;
    private final Deposito deposito;
    private final MemoriaContaRepository contas;
    public ExecutarComandoEspecificoImpl(){
    	this.deposito = (Deposito) new ExecutarDepositoImpl();
    	this.saque = (Saque) new ExecutarComandoEspecificoImpl();
    	ExecutarComandoEspecificoImpl Contas;
    	
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
		   int numero = entrada.nextInt();
		   
		   System.out.println("Digite o valor a ser depositado");
		   double valor = entrada.nextInt);
		   
		   
	   }else if(comando == 3){
		   abrirConta.execute();
		   
	   }else{
		   System.out.println("Opção invalida");
	   }
	return resultado;
   }
}
