package designers.builder;

import designers.builder.Itens.Paracetamol;
import designers.builder.Itens.Rexona;
import designers.builder.Itens.VickSyrup;
import designers.builder.service.ItemService;

public class TestBuilder {
    public static void testBuilder(){
        ItemService itemService = new ItemService();

        itemService.addItem(new Paracetamol());
        itemService.addItem(new Rexona());
        itemService.addItem(new VickSyrup());

        System.out.println("Builder Test");
        System.out.println();
        System.out.println("Itens:");

        itemService.showItems();

        System.out.println("Total Cost: " +itemService.getCost());
    }
}
