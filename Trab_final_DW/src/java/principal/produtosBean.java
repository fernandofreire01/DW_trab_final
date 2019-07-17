/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author isaac
 */
@ManagedBean(name = "produtosBean")
@RequestScoped
public class produtosBean {

    private List <Produto> produtos;
    /**
     * Creates a new instance of produtosBean
     */
    public produtosBean() {
        produtos = new ArrayList<>();
        produtos.add(new Produto("imagem1", "Nome do Produto 1", "10,00", "01"));
        produtos.add(new Produto("imagem2", "Nome do Produto 2", "20,00", "02"));
        produtos.add(new Produto("imagem3", "Nome do Produto 3", "30,00", "03"));
        produtos.add(new Produto("imagem4", "Nome do Produto 4", "40,00", "04"));
        produtos.add(new Produto("imagem5", "Nome do Produto 5", "50,00", "05"));
        produtos.add(new Produto("imagem6", "Nome do Produto 6", "60,00", "06"));        
    }
    
    public List<Produto> getProdutos(){
        return produtos;
    }
    
}
