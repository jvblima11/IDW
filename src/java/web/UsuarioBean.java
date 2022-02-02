/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author jvbli
 */

@ManagedBean(name = "usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable{
    private String nome;
    private String email;
    private String senha;
    private String confirmarsenha;
    private String datanascimento;
    private String cnpj;
    private String cidade;
    
    //fazer get,set e o construtor
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public String getConfirmarsenha(){
        return confirmarsenha;
    }
    
    public String getDatanascimento(){
        return datanascimento;
    }
    public String getCnpj(){
        return cnpj;
    }
    public String getCidade(){
        return cidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setConfirmarsenha(String confirmarsenha){
        this.confirmarsenha = confirmarsenha;
    }
    
    public void setDatanascimento(String datanascimento){
        this.datanascimento = datanascimento;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public UsuarioBean(){
        this.nome="";
        this.email="";
        this.senha="";
        this.confirmarsenha="";
        this.cnpj="";
        this.cidade="";
        this.datanascimento="";
    } 
    
    public UsuarioBean(String n,String e,String s,String cs,String dn,String cnp,String c){
        this.nome=n;
        this.email=e;
        this.senha=s;
        this.confirmarsenha=cs;
        this.datanascimento=dn;
        this.cnpj=cnp;
        this.cidade=c;
    }
    public String novo(){
        return "usuario";
    }
    
    public String salvar(){
        FacesContext context = FacesContext.getCurrentInstance();
        if(!this.senha.equalsIgnoreCase(this.confirmarsenha)){
            context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Senha confirmada incorretamente",""));
            return "usuario";
        }
        return "mostrarUsuario";
    }
}
