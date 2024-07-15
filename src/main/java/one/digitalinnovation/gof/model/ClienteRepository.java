package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Está é a interface que provem todos os metodos de acesso a dados de determinada tabela no banco de dados
//CrudRepositoy -> Estrategia de negocio


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
