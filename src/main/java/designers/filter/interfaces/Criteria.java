package designers.filter.interfaces;

import designers.builder.interfaces.Item;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Criteria {
    public List<Item> meetCriteria(List<Item> itens);
}
