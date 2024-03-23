package br.com.grocerycloud.grocerycloud.negocio.entidade;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.grocerycloud.grocerycloud.negocio.colecoes.IColecaoCliente;
import br.com.grocerycloud.grocerycloud.negocio.entidade.Cliente;

/**
 * Esta classe Teste a busca por cpf e senha
 * @author João Victor Leite Dos Santos
 * @category Classe de Testte
 */

@SpringBootTest
public class TesteCliente {
    @Autowired
    private IColecaoCliente colecaoCliente;
    @Autowired
    private Cliente cliente;
    
    @Test
    public void buscarPorCpfESenhaTest(){
        boolean verificacao;
        cliente.setSenha("12345");
        cliente.setCpf("012.234.456-67");
        
        if(colecaoCliente.buscarPorCpfESenha("012.234.456-67","12345") == null){
            verificacao = false;
        }else{
            verificacao = true;
        }
        assertTrue(verificacao);
}
}

