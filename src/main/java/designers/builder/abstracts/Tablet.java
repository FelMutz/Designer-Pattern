package designers.builder.abstracts;

import designers.builder.Packings.Chart;
import designers.builder.interfaces.Item;
import designers.builder.interfaces.Packing;
public abstract class Tablet implements Item {

    @Override
    public Packing packing() {
        return new Chart();
    }

    @Override
    public abstract float price();
}
