package designers.builder.abstracts;

import designers.builder.Packings.Box;
import designers.builder.interfaces.Item;
import designers.builder.interfaces.Packing;

public abstract class Hygiene implements Item {

    @Override
    public Packing packing() {
        return new Box();
    }

    @Override
    public abstract float price();
}
