package designers.observer;

public class ServerObserver extends Observer {

    private String name;

    public ServerObserver(ControleObserver controleObserver, String name){
        this.name=name;
        this.controleObserver = controleObserver;
        this.controleObserver.attach(this);
    }

    @Override
    public void update() {
        System.out.println(name+" Recebeu a Mensagem: " + controleObserver.getCommunication());
    }
}
