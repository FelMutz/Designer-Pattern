package designers.builder.Itens;

import designers.builder.abstracts.Tablet;

public class Paracetamol extends Tablet {
    @Override
    public String name() {
        return "Cartela Paracetamol";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
