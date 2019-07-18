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
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hatake-attack
 */
@ManagedBean(name = "carrinhoBean")
@SessionScoped
public class carrinhoBean {
    
    private List <Produto> carrinho;
    
    public carrinhoBean() {
        carrinho = new ArrayList<>();
//        carrinho.add(new Produto("imagem1", "Nome do Produto 1", "10,00", "01"));
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }
    
    public void addProduto(Produto produtos){
        System.out.println("adicionado item ao carrinho");
        carrinho.add(produtos);
    }

    /**
     * Creates a new instance of carrinhoBean
     */
    
}
