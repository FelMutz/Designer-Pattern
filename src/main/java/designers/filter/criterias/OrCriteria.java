package designers.filter.criterias;

import designers.builder.interfaces.Item;
import designers.filter.interfaces.Criteria;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Builder
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    @Override
    public List<Item> meetCriteria(List<Item> itens) {
        List<Item> firstCriteriaItems = criteria.meetCriteria(itens);
        List<Item> otherCriteriaItems = otherCriteria.meetCriteria(itens);

        firstCriteriaItems.addAll(otherCriteriaItems.stream().filter(x->!firstCriteriaItems.contains(x)).collect(Collectors.toList()));

        return firstCriteriaItems;
    }
}
