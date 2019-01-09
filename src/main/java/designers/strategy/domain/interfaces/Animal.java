package designers.strategy.domain.interfaces;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public abstract class Animal {
    public String breed;
    public String name;
    public Integer age;

    public abstract void eat();
    public abstract void sleep();

}
