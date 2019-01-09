package designers.proxy;


import designers.proxy.domain.PessoaDomain;
import designers.proxy.service.PessoaService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class RealPessoa implements Pessoa {
    private String id;
    private String name;
    private Integer age;

    private PessoaService pessoaService;

    public void loadFromBank(){
        PessoaDomain pessoaDomain = pessoaService.findById(id);
        this.name = pessoaDomain.getName();
        this.age = pessoaDomain.getAge();

    }

    @Override
    public void display() {
        System.out.println("id: "+ id+ ", name: "+ name + ", age: "+age);
    }
}
