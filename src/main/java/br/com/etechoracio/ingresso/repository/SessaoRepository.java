package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.entity.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessaoRepository extends JpaRepository<Sessao, Integer> {

    List<Sessao> findByFilmeId(Long id);

}
