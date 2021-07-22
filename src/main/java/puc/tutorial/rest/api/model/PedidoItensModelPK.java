package puc.tutorial.rest.api.model;

import java.io.Serializable;
import java.util.Objects;

public class PedidoItensModelPK implements Serializable {
	private static final long serialVersionUID = -7215999353651256743L;

	public String codPedido;
	public Integer codProduto;

	public PedidoItensModelPK() {

	}

	public PedidoItensModelPK(String codPedido, Integer codProduto) {
		this.codPedido = codPedido;
		this.codProduto = codProduto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPedido, codProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PedidoItensModelPK)) {
			return false;
		}
		PedidoItensModelPK other = (PedidoItensModelPK) obj;
		return Objects.equals(codPedido, other.codPedido) && Objects.equals(codProduto, other.codProduto);
	}
}
