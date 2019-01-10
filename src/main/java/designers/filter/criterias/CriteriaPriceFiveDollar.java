package designers.filter.criterias;

import designers.builder.interfaces.Item;
import designers.filter.interfaces.Criteria;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaPriceFiveDollar implements Criteria {
    @Override
    public List<Item> meetCriteria(List<Item> itens) {
        return itens.stream().filter(x->x.price() == 5F).collect(Collectors.toList());
    }
}
