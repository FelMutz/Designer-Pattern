package designers.strategy;

import designers.strategy.domain.Bird;
import designers.strategy.domain.Cat;
import designers.strategy.domain.Context.AnimalContext;
import designers.strategy.domain.Dog;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class Strategy {

    public static void testStrategy(){

        Cat cat = new  Cat();
        cat.setAge(12);
        cat.setBreed("Siames");
        cat.setName("Bola de Neve");

        Dog dog = new  Dog();
        dog.setAge(5);
        dog.setBreed("Buldog");
        dog.setName("Fury");

        Bird bird = new Bird();
        bird.setAge(3);
        bird.setBreed("Papagaio-verdadeiro");
        bird.setName("Louro");

        List<AnimalContext> animalContext = new ArrayList<>();
        animalContext.add(new AnimalContext(cat));
        animalContext.add(new AnimalContext(dog));
        animalContext.add(new AnimalContext(bird));

        animalContext.forEach(x->{
            System.out.println(x.getAnimal());
            x.eat();
            x.sleep();
        });
    }
}
