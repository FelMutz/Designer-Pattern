package designers.singleton;

import lombok.Data;

@Data
public final class Car {

    private static Car INSTANCE;
    private static String acao;

    private Car(){
        acao = "Parado";
    }

    public static synchronized Car getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new Car();
        }
        return INSTANCE;
    }

    public void andarParaFrente(){
        acao = "Andando para Frente";
    }

    public void andarParaTras(){
        acao = "Andando para trás";
    }

    public void parar(){
        acao = "Parado";
    }

    public String getAcaoPublic(){
        return acao;
    }

}
