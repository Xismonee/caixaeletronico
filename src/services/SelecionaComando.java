package services;

import java.util.Scanner;

public class SelecionaComando {

	ListarComandos listarComandos;
	ObtemComando obtemComando;
	ExecutaComandoEspecifico executaComandoEspecifico;
	Saque saque;
	

	public SelecionaComando() {
		this.listarComandos = new ListarComandosImpl();
		this.executaComandoEspecifico = new executaComandoEspecificoImpl;		
	}

	public boolean executar() {
		listarComandos.execute();
		int comando = obtemComando.execute();
		return executaComandoEspecifico(comando);

	}

	private boolean executaComandoEspecifico(int comando) {
		// TODO Auto-generated method stub
		return false;
	}
}
