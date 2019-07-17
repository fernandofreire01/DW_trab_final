/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hatake-attack
 */
@ManagedBean(name = "usuarioBean")
@SessionScoped
public class usuarioBean {
    
    String nome;
    String email;
    String senha;
    String confirmacaoSenha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmacaoSenha() {
        return confirmacaoSenha;
    }

    public void setConfirmacaoSenha(String confirmacaoSenha) {
        this.confirmacaoSenha = confirmacaoSenha;
    }
    
    /* Função para verificar se as senhas são iguais */
    public void verificaSenhas() throws IOException{
        
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        
        if( senha.equals(confirmacaoSenha) && senha != null && senha != ""){
//            context.getExternalContext().redirect("mostraUsuario.xhtml");
            context.getExternalContext().redirect("produtos_teste.xhtml");
        } else {
            context.getExternalContext().redirect("usuario.xhtml");
            session.invalidate();            
        }
    }
    
    /**
     * Creates a new instance of usuarioBean
     */
    public usuarioBean() {}
    
}
