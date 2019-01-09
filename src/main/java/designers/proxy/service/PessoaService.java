package designers.proxy.service;

import designers.exceptions.ExceptionCustom;
import designers.proxy.domain.PessoaDomain;
import designers.proxy.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PessoaService {

    PessoaRepository pessoaRepository;

    public PessoaDomain findById(String id){
        return pessoaRepository.findById(id).orElseThrow(()->new ExceptionCustom("Pessoa não encontrada com cartão "+id));
    }

    public List<PessoaDomain> findAll(){
        return pessoaRepository.findAll();
    }

    public void insert(PessoaDomain pessoaDomain){
        pessoaRepository.insert(pessoaDomain);
    }

    public void deleteAll(){
        pessoaRepository.deleteAll();
    }
}
