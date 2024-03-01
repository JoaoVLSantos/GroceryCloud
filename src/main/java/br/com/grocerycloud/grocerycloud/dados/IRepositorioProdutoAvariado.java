package br.com.grocerycloud.grocerycloud.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.grocerycloud.grocerycloud.negocio.entidade.Produto;
import br.com.grocerycloud.grocerycloud.negocio.entidade.ProdutoAvariado;

/**
 * Interface que representa o repositório de produtos avariados e seus métodos.
 * 
 * @author Guilherme Paes Cavalcanti
 * @category Repositório de dados
 */

@Repository
public interface IRepositorioProdutoAvariado extends JpaRepository<ProdutoAvariado, Long> {
	
	public List<ProdutoAvariado> findAllByOrderById();
	public ProdutoAvariado findById(long id);
	public ProdutoAvariado findByProduto(Produto produto);

}
