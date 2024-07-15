package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import one.digitalinnovation.gof.model.Endereco;

/*
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br/">ViaCEP</a>
 * 
 * @author Jermeson
 */

//Interface que está anotada como FeignClient e especificando a url base daquele determinado site
/*
 * Como sei dessa URL atraves do site ViaCEP
 * Exemplos de pesquisa por endereço:
	viacep.com.br/ws/RS/Porto Alegre/Domingos/json/
	viacep.com.br/ws/RS/Porto Alegre/Domingos Jose/json/
	viacep.com.br/ws/RS/Porto Alegre/Domingos+Jose/json/
	
 * OBS: Feign usa as annotation do spring
*/
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	
	
	//Criado método colocando o @RequestMapping e especificando que é um GET que busca o JSON ("/{cep}/json/") e este JSON vai ser convertido 
	//no objeto que foi mapeado com base no json (Classe Endereco) realizando a conversão automatica e devolve o endereço populado com base no cep que foi passado aqui no @PathVariable deste metdo do GET.
	
	/*
	@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
	*/

	//Outra alternativa ao RequestMapping seria o GetMapping que também funcionaria
	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
