package designers.strategy.domain;

import designers.strategy.domain.interfaces.Animal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@Builder
@Component
@Primary
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Come Ração de Gato");
    }

    @Override
    public void sleep() {
        System.out.println("Dormme No sofá");
    }
}
