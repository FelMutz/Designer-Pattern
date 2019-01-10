package designers.responsibility;

public class TestResponsibility {

    public static void testResponsibility(){
        System.out.println("Teste Responsibility");
        System.out.println();

        AbstractShopping chage = new ChageShopping(AbstractShopping.CHANGE);
        AbstractShopping money = new MoneyShopping(AbstractShopping.MONEY);
        AbstractShopping card = new CardShopping(AbstractShopping.CARD);


        card.setNextServiceFile(money);
        money.setNextServiceFile(chage);


        System.out.println("Compra com Dinheiro:");
        card.shopping(AbstractShopping.MONEY);

        System.out.println();

        System.out.println("Compra com Cartão:");
        card.shopping(AbstractShopping.CARD);

    }
}
