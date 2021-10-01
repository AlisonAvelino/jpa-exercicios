package infra;

import modelo.basico.Produto;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class ProdutoDAO extends DAO<Produto> {

	public ProdutoDAO() {
		super(Produto.class);
	}
}
