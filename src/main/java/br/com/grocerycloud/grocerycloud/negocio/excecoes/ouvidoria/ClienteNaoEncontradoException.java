package br.com.grocerycloud.grocerycloud.negocio.excecoes.ouvidoria;

/** 
 * @author Victor Caua Tavares Inacio
 * @category Classe de exceção de ouvidoria
*/

public class ClienteNaoEncontradoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ClienteNaoEncontradoException() {
		super("Cliente não encontrado!");
	}
	
}