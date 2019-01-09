package designers.builder.Packings;

import designers.builder.interfaces.Packing;
import org.springframework.stereotype.Component;

@Component
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
