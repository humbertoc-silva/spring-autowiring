package br.com.hcs.spring.autowiring;

public class Processador {
    private DAOProduto daoProduto;
    private DAOUsuario daoUsuario;
    private DAOVenda daoVenda;
    
    public DAOProduto getDaoProduto() {
        return daoProduto;
    }
    
    public void setDaoProduto(DAOProduto daoProduto) {
        this.daoProduto = daoProduto;
    }
    
    public DAOUsuario getDaoUsuario() {
        return daoUsuario;
    }
    
    public void setDaoUsuario(DAOUsuario daoUsuario) {
        this.daoUsuario = daoUsuario;
    }
    
    public DAOVenda getDaoVenda() {
        return daoVenda;
    }

    public void setDaoVenda(DAOVenda daoVenda) {
        this.daoVenda = daoVenda;
    }
}
