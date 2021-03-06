package puc.tutorial.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "pedidoitens")
@IdClass(PedidoItensModelPK.class)
public class PedidoItensModel {

    @Id
    public String codPedido;

    @Id
    @Column(length = 10)
    public Integer codProduto;

    @Column(nullable = false, length = 5)
    public Integer quantidade;

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
