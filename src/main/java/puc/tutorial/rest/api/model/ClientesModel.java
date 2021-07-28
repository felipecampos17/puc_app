package puc.tutorial.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "cliente")
public class ClientesModel {

    @Id
    public String cpf;

    @Column(nullable = false, length = 100)
    public String nomeCliente;

    @Column(nullable = false, length = 50)
    public String endereco;

    @Column(nullable = false, length = 50)
    public String estado;

    @Column(nullable = false, length = 50)
    public String municipio;

    @Column(nullable = false, length = 15)
    public String telefone;

    @Column(nullable = false, length = 50)
    public String email;

    @Column(nullable = false, length = 50)
    public String senha;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTefelone() {
        return telefone;
    }

    public void setTefelone(String telefone) {
        this.telefone = telefone;
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
}
