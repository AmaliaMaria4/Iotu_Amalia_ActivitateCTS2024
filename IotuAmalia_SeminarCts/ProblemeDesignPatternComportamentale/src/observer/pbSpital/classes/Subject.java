package observer.pbSpital.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> lista;

    public Subject() {
        this.lista = new ArrayList<>();
    }
    public void adaugaPacient(Observer observer){
        lista.add(observer);
    }
    public void stergePacient(Observer observer){
        lista.remove(observer);
    }
    public void notificaAbonat(String mesaj){
        for(Observer abonati:lista){
            abonati.primesteNotificare(mesaj);
        }
    }
    public abstract void notificaAAparutUnVirus();
    public abstract void notificaAAparutOEpidemie();

}
