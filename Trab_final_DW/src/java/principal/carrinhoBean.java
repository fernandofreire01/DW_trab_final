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
 * @author hatake-attack
 */
@ManagedBean(name = "carrinhoBean")
@RequestScoped
public class carrinhoBean {
    
    private List <Produto> carrinho;
    
    public carrinhoBean() {
        carrinho = new ArrayList<>();
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }
    
    public void addProduto(Produto produto){
        carrinho.add(produto);
    }

    /**
     * Creates a new instance of carrinhoBean
     */
    
}
