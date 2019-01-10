package designers.filter;

import designers.builder.Itens.Paracetamol;
import designers.builder.Itens.Rexona;
import designers.builder.Itens.VickSyrup;
import designers.builder.interfaces.Item;
import designers.filter.criterias.*;
import designers.filter.interfaces.Criteria;

import java.util.ArrayList;
import java.util.List;

public class TestFilter {

    public static void testFilter(){

        System.out.println("Filter Test");

        List<Item> items = new ArrayList<Item>();

        items.add(new Paracetamol());
        items.add(new Rexona());
        items.add(new VickSyrup());

        Criteria box = new CriteriaBox();
        Criteria bottle = new CriteriaBottle();
        Criteria chart = new CriteriaChart();
        Criteria priceFiveDollar = new CriteriaPriceFiveDollar();
        Criteria chartAndPriceFiveDolar = new AndCriteria(chart, priceFiveDollar);
        Criteria boxOrChart = new OrCriteria(box, chart);

        System.out.println();
        System.out.println("Box: ");
        box.meetCriteria(items).forEach(x->{
            System.out.print("Item : " + x.name());
            System.out.print(", Packing : " + x.packing().pack());
            System.out.println(", Price : " + x.price());
        });

        System.out.println();
        System.out.println("Bottle: ");
        bottle.meetCriteria(items).forEach(x->{
            System.out.print("Item : " + x.name());
            System.out.print(", Packing : " + x.packing().pack());
            System.out.println(", Price : " + x.price());
        });

        System.out.println();
        System.out.println("Chart: ");
        chart.meetCriteria(items).forEach(x->{
            System.out.print("Item : " + x.name());
            System.out.print(", Packing : " + x.packing().pack());
            System.out.println(", Price : " + x.price());
        });

        System.out.println();
        System.out.println("5 Dollars: ");
        priceFiveDollar.meetCriteria(items).forEach(x->{
            System.out.print("Item : " + x.name());
            System.out.print(", Packing : " + x.packing().pack());
            System.out.println(", Price : " + x.price());
        });

        System.out.println();
        System.out.println("Chart and 5 Dollars: ");
        chartAndPriceFiveDolar.meetCriteria(items).forEach(x->{
            System.out.print("Item : " + x.name());
            System.out.print(", Packing : " + x.packing().pack());
            System.out.println(", Price : " + x.price());
        });

        System.out.println();
        System.out.println("Box or Chart: ");
        boxOrChart.meetCriteria(items).forEach(x->{
            System.out.print("Item : " + x.name());
            System.out.print(", Packing : " + x.packing().pack());
            System.out.println(", Price : " + x.price());
        });
    }
}
