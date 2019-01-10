package designers.responsibility;

public class ChageShopping extends AbstractShopping {

    public ChageShopping(Integer level){
        this.level=level;
    }

    @Override
    protected void write() {
        System.out.println("Troco Calculado");
    }
}
