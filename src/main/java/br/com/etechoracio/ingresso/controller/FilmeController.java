package br.com.etechoracio.ingresso.controller;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.dto.SessaoResponseDTO;
import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.entity.Sessao;
import br.com.etechoracio.ingresso.service.FilmeService;
import br.com.etechoracio.ingresso.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
@CrossOrigin("*")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @Autowired
    private SessaoService sessaoService;

    @GetMapping
    public List<FilmeResponseDTO> findAll(){
        return filmeService.findAll();
    }

    @GetMapping("/em-cartaz")
    public List<FilmeResponseDTO> findEmCartaz(){
        return filmeService.findEmCartaz();
    }

    @GetMapping("/{id}")
    public FilmeResponseDTO findById(@PathVariable Long id){
        return filmeService.findById(id);
    }

    @GetMapping("/{id}/sessoes")
    public List<SessaoResponseDTO> findByFilmeId(@PathVariable Long id){
        return sessaoService.sessoesById(id);
    }
}
