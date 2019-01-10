package designers.builder.service;

import designers.builder.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        items.forEach(x->{
            System.out.print("Item : " + x.name());
            System.out.print(", Packing : " + x.packing().pack());
            System.out.println(", Price : " + x.price());
        });
    }

    public List<Item> setListItens(){
        return items;
    }
}
