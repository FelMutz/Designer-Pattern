package designers.observer;

import java.util.UUID;
import java.util.stream.IntStream;

public class TestObserver {
    public static void testObserver(){
        ControleObserver controleObserver = new ControleObserver();

        System.out.println("Test Observer");
        System.out.println();

        IntStream.range(0,10).forEach(x->{
            new ServerObserver(controleObserver,"teste "+ UUID.randomUUID().toString());
        });


        controleObserver.setcommunication("Felipe is here");
    }
}
