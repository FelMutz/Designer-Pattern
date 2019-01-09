package designers.singleton;

import lombok.Data;

@Data
public final class Carro {

    private static Carro INSTANCE;
    private static String acao;

    private Carro(){
        acao = "Parado";
    }

    public static synchronized Carro getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new Carro();
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
