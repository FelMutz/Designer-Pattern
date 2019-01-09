package designers.factory;

import designers.factory.domain.Adult;
import designers.factory.domain.Kid;
import designers.factory.domain.Old;
import designers.factory.domain.Teen;
import designers.factory.interfaces.PessoaFactoryInterface;
import org.springframework.stereotype.Component;

@Component
public class FactoryPessoa {
    public PessoaFactoryInterface setPessoa(String name, Integer age){
       if(age < 13){
        Kid kid = new Kid();
        kid.setAge(age);
        kid.setName(name);

        return kid;
       }
       if (age<=30){
           Teen teen = new Teen();
           teen.setAge(age);
           teen.setName(name);

           return teen;
       }
       if (age<60){
           Adult adult = new Adult();
           adult.setAge(age);
           adult.setName(name);

           return adult;
       }
        Old old = new Old();
        old.setAge(age);
        old.setName(name);

        return old;
    }
}
