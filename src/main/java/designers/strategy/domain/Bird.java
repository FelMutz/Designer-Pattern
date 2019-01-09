package designers.strategy.domain;

import designers.strategy.domain.interfaces.Animal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Builder
@Component
public class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("Come alpiste");
    }

    @Override
    public void sleep() {
        System.out.println("Dorme no poleiro");
    }
}
