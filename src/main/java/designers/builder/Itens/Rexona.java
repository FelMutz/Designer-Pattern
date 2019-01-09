package designers.builder.Itens;

import designers.builder.abstracts.Hygiene;

public class Rexona extends Hygiene {
    @Override
    public String name() {
        return "Rexona";
    }

    @Override
    public float price() {
        return 10F;
    }
}
