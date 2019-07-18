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
        produtos.add(new Produto("imagem1", "Ovo vegano 200G", "29,90", "0"));
        produtos.add(new Produto("imagem2", "Maionese Hellmann's vegana 250g", "12,40", "1"));
        produtos.add(new Produto("imagem3", "Filés de soja sabor carne vermelha", "10,00", "2"));
        produtos.add(new Produto("imagem4", "Carne moída vegetal superbom 400g", "21,90", "3"));
        produtos.add(new Produto("imagem5", "Almôndega vegetariana ao molho superbom", "24,90", "4"));
        produtos.add(new Produto("imagem6", "Massa talharim cenoura casarão sem glúten 300g", "14,00", "5"));        
    }
    
    public List<Produto> getProdutos(){
        return produtos;
    }
    
}
