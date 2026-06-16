package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.dto.SessaoResponseDTO;
import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.entity.Sessao;
import br.com.etechoracio.ingresso.mapper.SessaoMapper;
import br.com.etechoracio.ingresso.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessaoService {

    @Autowired
    private SessaoRepository sessaoRepository;

    @Autowired
    private SessaoMapper sessaoMapper;

    public List<SessaoResponseDTO> sessaoById(Filme id){
        var sessoes = sessaoRepository.sessaoById();
    }

}
