package designers.facade.services;

import designers.exceptions.ExceptionCustom;
import designers.facade.services.domain.Bhaskara;
import org.springframework.stereotype.Service;

@Service
public class BhaskaraService {

    public Bhaskara calcBhaskara(Bhaskara bhaskara){

        if (bhaskara.getA() == 0 || bhaskara.getA() == null){
            throw new ExceptionCustom("a não pode ser Zero ou Nulo.");
        }
        Double a = bhaskara.getA();
        Double b = bhaskara.getB();
        Double c = bhaskara.getC();

        Double potenciaB = ComplexOperation.potencia(b,2D);

        Double aMultc = BasicOperation.multiplicacao(a,c);

        Double quatroMultaMultc = BasicOperation.multiplicacao(4D, aMultc);

        Double delta = BasicOperation.subtracao(potenciaB,quatroMultaMultc);

        Double raizDelta = ComplexOperation.raizQuadrada(delta);

        Double dividendo = BasicOperation.multiplicacao(2D,a);

        Double bSomaRaizDelta = BasicOperation.soma(-b, raizDelta);

        Double bSubRaizDelta = BasicOperation.subtracao(-b, raizDelta);

        bhaskara.setResultWithPositive(
                BasicOperation.divisao(bSomaRaizDelta,dividendo)
        );

        bhaskara.setResultWithNegative(
                BasicOperation.divisao(bSubRaizDelta,dividendo)
        );

        return bhaskara;
    }


}
