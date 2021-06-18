/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

/**
 *
 * @author tgabr
 */
public class Admin {
    private int cpf;
    private String nome;
    private String usuario;
    private String telefone;
    private String senha;
    private int nvlusuario;

    public Admin(int cpf, String nome, String usuario, String telefone, String senha, int nvlusuario) {
        this.cpf = cpf;
        this.nome = nome;
        this.usuario = usuario;
        this.telefone = telefone;
        this.senha = senha;
        this.nvlusuario = nvlusuario;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNvlusuario() {
        return nvlusuario;
    }

    public void setNvlusuario(int nvlusuario) {
        this.nvlusuario = nvlusuario;
    }
    
}
