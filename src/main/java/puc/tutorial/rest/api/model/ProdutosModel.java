package puc.tutorial.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "produtos")
public class ProdutosModel {

    @Id
    public Integer codProduto;

    @Column(nullable = false, length = 100)
    public String nomeProduto;

    @Column(nullable = false, length = 10)
    public Integer precoProduto;

    @Column(nullable = false, length = 5)
    public Integer quantidadeEstoque;
    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Integer precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
