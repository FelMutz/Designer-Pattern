package designers.factory.interfaces;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public abstract class PessoaFactoryInterface {
    private  String name;
    private  Integer age;
}
