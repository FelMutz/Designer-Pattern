package designers.factory.domain;

import designers.factory.interfaces.PessoaFactoryInterface;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
@Builder
public class Kid extends PessoaFactoryInterface {
}
