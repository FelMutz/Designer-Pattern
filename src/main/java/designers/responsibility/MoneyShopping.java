package designers.responsibility;

public class MoneyShopping extends AbstractShopping {

    public MoneyShopping(Integer level){
        this.level=level;
    }

    @Override
    protected void write() {
        System.out.println("Dinheiro Adicionado ao caixa");
    }
}
