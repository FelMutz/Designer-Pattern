package designers.observer;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class ControleObserver {
    List<Observer> observers = new ArrayList<>();
    @Getter
    private String communication;

    public void setcommunication(String communication) {
        this.communication = communication;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
