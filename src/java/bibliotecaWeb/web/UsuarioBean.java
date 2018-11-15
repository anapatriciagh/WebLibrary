/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaWeb.web;

import bibliotecaWeb.tipoUsuario.TipoUsuario;
import bibliotecaWeb.usuario.Usuario;
import bibliotecaWeb.usuario.UsuarioRN;
import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;
/**
 *
 * @author Ana PAtrícia
 */
@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean {
    private  Usuario usuario = new Usuario();
    private String confirmarSenha;
    private String aluno = "aluno";
    private String professor = "professor";
    
    
    public String novo(){
        this.usuario = new Usuario();
        this.usuario.setAtivo(true);
        return  "usuarioJsf";
    }
    public String login(){
        FacesContext context = FacesContext.getCurrentInstance();
        if("administrator".equals(this.usuario.getNomeUsuario()) && "123".equals(this.usuario.getSenha())){
           return "administrador.xhtml";
        }else{
            FacesMessage messagem = new FacesMessage("Usuário ou Senha inválidos. Por favor, tente novamente!");
            messagem.setSeverity(FacesMessage.SEVERITY_ERROR);
            context.addMessage(null, messagem);
        }
        return null;
    }
        
    public String salvar(){
        FacesContext context = FacesContext.getCurrentInstance();
        
        String senha = this.usuario.getSenha();
        if(!senha.equals(this.confirmarSenha)){
            FacesMessage facesMessage = new FacesMessage("As Senhas informadas não conferem!");
            context.addMessage(null, facesMessage);
            return null;
        }
        UsuarioRN usuarioRN = new UsuarioRN();
        int tipoUsuario;
        TipoUsuario tipoUsuario1 = new TipoUsuario();
        tipoUsuario = selecionarTipoUsuario(usuario);
        System.out.println(tipoUsuario);
        tipoUsuario1.setCodigo(tipoUsuario);
        this.usuario.setTipoUsuario(tipoUsuario1);
        usuarioRN.salvar(this.usuario);
        
        return  "usuarioSucesso";
    }
    public int selecionarTipoUsuario(Usuario usuario){
        TipoUsuario tipoUsuario = new TipoUsuario();
        if(usuario.getCategoriaUsuario().equalsIgnoreCase(aluno)){
            tipoUsuario.setCodigo(1);
        }else if(usuario.getCategoriaUsuario().equalsIgnoreCase(professor)){
            tipoUsuario.setCodigo(2);
        }else
            tipoUsuario.setCodigo(3);
        return tipoUsuario.getCodigo();
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }
}
