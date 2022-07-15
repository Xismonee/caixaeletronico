package services;

import model.Conta;

public interface Transferencia {
 double transferir (double valor,Conta origem, Conta destino);
 
 void execute(double valor, int numero);
 
	 
}
