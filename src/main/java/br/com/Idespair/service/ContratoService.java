package br.com.Idespair.service;

import br.com.Idespair.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Busca realizada";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Item(s) excluídos";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualização completa";
    }
}