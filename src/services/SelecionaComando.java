package services;

import java.util.Scanner;

public class SelecionaComando {

	ListarComandos listarComandos;
	ObtemComando obtemComando;
	ExecutaComandoEspecifico executaComandoEspecifico;
	Saque saque;
	

	public SelecionaComando() {
		this.listarComandos = new ListarComandosImpl();
		this.executaComandoEspecifico = new ExecutaComandoEspecificoImpl();	
		this.obtemComando = new ObtemComandoImpl();
		
	}

	public boolean executar() {
		listarComandos.execute();
		int comando = obtemComando.execute();
		return this.executaComandoEspecifico.execute(comando);

	}

}
