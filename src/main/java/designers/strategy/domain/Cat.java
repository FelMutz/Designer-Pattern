package designers.strategy.domain;

import designers.strategy.domain.interfaces.Animal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@Builder
@Component
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Come Ração de cachorro");
    }

    @Override
    public void sleep() {
        System.out.println("Dorme na casinha do Cachorro");
    }
}
