package designers.facade.services;

import designers.facade.services.domain.Bhaskara;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class CalcFormula {

    BhaskaraService bhaskaraService;

    public void bhaskara(Double a, Double b, Double c){

        Bhaskara bhaskara = Bhaskara.builder().a(a).b(b).c(c).build();

        bhaskara = bhaskaraService.calcBhaskara(bhaskara);



        System.out.println("Resultado com delta Possitivo (x') = "+bhaskara.getResultWithPositive());
        System.out.println("Resultado com delta Negativo (x'') = "+bhaskara.getResultWithNegative());

    }
}
