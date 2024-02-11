package br.com.grocerycloud.grocerycloud.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.grocerycloud.grocerycloud.negocio.entidade.Venda;

/** 
 * Esta interface representa o repositório de vendas, 
 * com os métodos necessários para realizar seu armazenamento.
 * @author Arthur de Sá Tenório
 * @category Repositório de dados
*/

@Repository
public interface InterfaceRepositorioVenda extends JpaRepository <Venda, Long> {
    //Criação
    Venda save(Venda venda);
    //Buscas
    List<Venda> findAll();
    List<Venda> findById(long id);
}