package br.com.Idespair.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void buscar()  {
        throw new UnsupportedOperationException("Não foi encontrado o alvo");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não foi possível realizar esta operação");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não foi possível realizar esta operação");
    }
}