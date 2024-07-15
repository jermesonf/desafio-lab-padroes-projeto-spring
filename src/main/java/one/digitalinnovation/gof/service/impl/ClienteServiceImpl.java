package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;

public class ClienteServiceImpl implements ClienteService{

	// TODO Singleton: Injetar os componentes do Spring com @Autowired.
	// TODO Strategy: Implementar os métodos definidos na interface.
	// TODO Facade: Abstrair, integrações com sbsistemas, provendo uma interface 
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		// FIXME Buscar todos os Clientes;
		return null;
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// FIXME Buscar Clientes por ID
		return null;
	}

	@Override
	public void inserir(Cliente cliente) {
		// FIXME Verificar se o Endereco do Cliente já existe (pelo CEP)
		// FIXME Caso não existe. integrar com o ViaCep e persistir o retorno.
		// FIXME Inserir Cliente, vinculando o Endereco (Novo ou existente).
		
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// FIXME Buscar Cliente por Id, caso exista;
		// FIXME Verificar se o Endereço do Cliente já existe (pelo CEP)
		// FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
		// FIXME Alterar Cliente, vinculando o Endereço (novo ou existente).
		
	}

	@Override
	public void deletar(Long id) {
		// FIXME Deletar Cliente por ID
		
	}

}
