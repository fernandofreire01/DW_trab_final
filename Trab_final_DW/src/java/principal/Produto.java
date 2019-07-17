/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author isaac
 */
public class Produto {
    private String imagemProduto;
    private String nomeProduto;
    private String precoProduto; //converter para double (ou int) quando for utilizar para somar valores.
    private String idProduto;

    public Produto(String imagemProduto, String nomeProduto, String precoProduto, String idProduto){
        this.imagemProduto = imagemProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.idProduto = idProduto;
    }

    public String getImagemProduto() {
        return imagemProduto;
    }

    public void setImagemProduto(String imagemProduto) {
        this.imagemProduto = imagemProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(String precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }
    
    
}
