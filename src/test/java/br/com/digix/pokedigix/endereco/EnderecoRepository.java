package br.com.digix.pokedigix.endereco;

import br.com.digix.pokedigix.Endereco.Endereco;

import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository <Endereco, Long> {
}
