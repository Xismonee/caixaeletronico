package repository;

import java.util.ArrayList;

import java.util.List;

import model.Conta;

public class MemoriaContaRepository implements BaseRepository<Conta>{

	private List<Conta> contas = new ArrayList<>();

    @Override
    public List<Conta> findAll() {
        return contas;
    }

	@Override
	public Conta findByld(int id) {
		return contas.get(id);
	}
	
	@Override
	public void adiciona(Conta objeto) {
		objeto.setNumeroDaConta(contas.size());
		contas.add(objeto);		
	}
}
