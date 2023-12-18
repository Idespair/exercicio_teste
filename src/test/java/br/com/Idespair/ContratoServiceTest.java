package br.com.Idespair;

import br.com.Idespair.dao.ContratoDao;
import br.com.Idespair.dao.IContratoDao;
import br.com.Idespair.dao.mocks.ContratoDaoMock;
import br.com.Idespair.service.ContratoService;
import br.com.Idespair.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Item(s) excluídos", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void ErroNoexcluirTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Item(s) excluídos", retorno);
    }

    @Test
    public void buscarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Busca realizada", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void ErroBuscarTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Busca realizada", retorno);
    }

    @Test
    public void AtualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualização completa", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void ErroAtualizarTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualização completa", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}