package br.com.Idespair.dao;

public class ClienteDao implements IClienteDao {

    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
        //return "Sucesso";
    }

    @Override
    public String buscar() {
        throw new UnsupportedOperationException("Não foi possível realizar a busca");
    }

    @Override
    public String excluir() {
        throw new UnsupportedOperationException("Não foi possível realizar esta operação");
    }

    @Override
    public String atualizar() {
        throw new UnsupportedOperationException("Não foi possível realizar esta operação");
    }
}