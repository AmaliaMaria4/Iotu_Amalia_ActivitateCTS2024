package state.pbSpital.main;

import state.pbSpital.classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ion");

        pacient.adusInSpital(); // Pacientul este internat
        pacient.stareGrava(); // Starea de sănătate devine gravă, este trecut în starea SubObservatie
        pacient.externat(); // Pacientul este externat
        Pacient pacient1 = new Pacient("Ana");
        pacient1.adusInSpital(); // Pacientul este internat din nou

        // Așa cum este implementat, pacientul rămâne în starea Externat dacă încercăm să-l externăm din nou
        pacient1.externat(); // Pacientul este externat
       }
}
