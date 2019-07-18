/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
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
    private List <Cliente> cliente;
    
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
    public String verificaSenhas() throws IOException{
        String usuarioLogado = null;
        for(int i=0; i < cliente.size(); i++){
        if (cliente.get(i).getEmail().equals(email)){
           if (cliente.get(i).getSenha().equals(senha)){
            usuarioLogado = "1";
            return "/produtosPage?faces-redirect=true";
                }
            }   
        }if (usuarioLogado != "1") {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário ou Senha Inválidos", "Login Inválido"));
            return null;
        } else {
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
            if (session != null) {
                session.setAttribute("usuario", usuarioLogado);
            }
            return "/produtosPage?faces-redirect=true";
            }
    }
    
    /**
     * Creates a new instance of usuarioBean
     */
    public usuarioBean() {
    cliente = new ArrayList<>();
    cliente.add(new Cliente("Anselmo","anselmo@mail.com","123"));
    cliente.add(new Cliente("Isaac","isaac@mail.com","1234"));
    cliente.add(new Cliente("Fernando","fernando@mail.com","123"));
    cliente.add(new Cliente("Claudinho","claudinho@mail.com","1234"));
    }
    
}