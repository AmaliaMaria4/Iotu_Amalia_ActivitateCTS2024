package observer.classes.subject;

import observer.classes.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void adaugaAbonat(Observer observer) {
        observers.add(observer);
    }
    public void stergeAbonat(Observer observer){
        observers.remove(observer);
    }
    public void notificaAbonati(String mesaj){
        for(Observer abonati: observers){
            abonati.primesteNotoficare(mesaj);
        }
    }
    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciVolei();
    public abstract void notificaMeciHandball();
}
