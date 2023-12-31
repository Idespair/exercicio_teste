package br.com.Idespair.service;

import br.com.Idespair.dao.ClienteDao;
import br.com.Idespair.dao.ClienteDaoMock;
import br.com.Idespair.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String excluir() {
        clienteDao.excluir();
        return "Sucesso";
    }

    public String buscar() {
        clienteDao.buscar();
        return "Sucesso";
    }

    public String atualizar() {
        clienteDao.atualizar();
        return "Sucesso";
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

}
