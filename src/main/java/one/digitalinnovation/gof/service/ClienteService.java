package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/*
 * Inteface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * Isso, se necessário, podemos ter multiplas implementações dessa mesma
 * inteface.
 * 
 * @author Jermeson
 */

public interface ClienteService {
	
	
	//Obs: tem todas implementações CRUD
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);
}
