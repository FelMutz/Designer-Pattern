package designers.builder.abstracts;

import designers.builder.Packings.Bottle;
import designers.builder.interfaces.Item;
import designers.builder.interfaces.Packing;

public abstract class Syrup implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
