package designers.responsibility;

public class CardShopping extends AbstractShopping {

    public CardShopping(Integer level){
        this.level=level;
    }

    @Override
    protected void write() {
        System.out.println("Logica de Compra por Cartão feita");
    }
}
