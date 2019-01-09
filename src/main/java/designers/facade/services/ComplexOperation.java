package designers.facade.services;

import org.springframework.stereotype.Component;

@Component
public class ComplexOperation {

    public static Double raizQuadrada(Double Value){
        return Math.sqrt(Value);
    }

    public static Double potencia(Double base, Double potencia){
        return Math.pow(base, potencia);
    }

}
