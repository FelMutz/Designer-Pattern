package designers.builder.Itens;

import designers.builder.abstracts.Syrup;

public class VickSyrup extends Syrup {
    @Override
    public String name() {
        return "Vick Xarope";
    }

    @Override
    public float price() {
        return 15.95f;
    }
}
