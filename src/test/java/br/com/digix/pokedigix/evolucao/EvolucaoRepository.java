package br.com.digix.pokedigix.evolucao;

import br.com.digix.pokedigix.Evolucao.Evolucao;

import org.springframework.data.repository.CrudRepository;

public interface EvolucaoRepository extends CrudRepository <Evolucao, Long> {
}