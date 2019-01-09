package designers.strategy.domain.Context;

import designers.strategy.domain.interfaces.Animal;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AnimalContext {

    private Animal animal;

    public AnimalContext(Animal animal){
        this.animal=animal;
    }

    public void eat(){
        animal.eat();
    }

    public void sleep(){
        animal.sleep();
    }
}
