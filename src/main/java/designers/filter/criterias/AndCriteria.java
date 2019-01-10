package designers.filter.criterias;

import designers.builder.interfaces.Item;
import designers.filter.interfaces.Criteria;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;

@AllArgsConstructor
@Builder
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    @Override
    public List<Item> meetCriteria(List<Item> itens) {
        List<Item> firstCriteriaItems = criteria.meetCriteria(itens);
       return otherCriteria.meetCriteria(firstCriteriaItems);

    }
}
