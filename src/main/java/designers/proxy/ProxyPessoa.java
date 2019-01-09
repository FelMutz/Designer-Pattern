package designers.proxy;

import designers.proxy.service.PessoaService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ProxyPessoa implements Pessoa {

    private RealPessoa realFile;

    private PessoaService pessoaService;

    private String id;

    @Override
    public void display() {
        if(realFile == null){
            realFile = RealPessoa.builder().id(id).pessoaService(pessoaService).build();
            realFile.loadFromBank();
        }
        realFile.display();
    }
}
