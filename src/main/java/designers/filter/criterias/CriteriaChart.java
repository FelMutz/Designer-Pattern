package designers.filter.criterias;

import designers.builder.interfaces.Item;
import designers.filter.interfaces.Criteria;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
public class CriteriaChart implements Criteria {
    @Override
    public List<Item> meetCriteria(List<Item> itens) {

        return itens.stream().filter(x->x.packing().pack().equalsIgnoreCase("CHART")).collect(Collectors.toList());
    }
}
