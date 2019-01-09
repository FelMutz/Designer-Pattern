package designers.facade.services;

import org.springframework.stereotype.Component;

@Component
public class BasicOperation {

    public static Double soma(Double Value1, Double Value2){
        return Value1+Value2;
    }

    public static Double subtracao(Double Value1, Double Value2){
        return Value1-Value2;
    }

    public static Double divisao(Double Value1, Double Value2){
        return Value1/Value2;
    }

    public static Double multiplicacao(Double Value1, Double Value2){
        return Value1*Value2;
    }
}
