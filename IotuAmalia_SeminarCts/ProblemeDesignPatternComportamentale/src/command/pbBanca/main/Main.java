package command.pbBanca.main;

import command.pbBanca.classes.*;

public class Main {
    public static void main(String[] args) {
        ContBancar contBancar=new ContBancar("Ion");
        Manager manager=new Manager();
        manager.invoca(new ComandaConstituire(contBancar,100));
        manager.invoca(new ComandaDepunere(contBancar,200));
        manager.executaComanda();
        manager.invoca(new ComandaRetragere(contBancar,350));
        manager.executaComanda();
        manager.executaComanda();
    }
}
