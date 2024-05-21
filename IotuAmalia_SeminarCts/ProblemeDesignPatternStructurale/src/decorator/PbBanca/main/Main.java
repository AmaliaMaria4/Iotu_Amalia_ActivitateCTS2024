package decorator.PbBanca.main;

import decorator.PbBanca.classes.Card;
import decorator.PbBanca.classes.CardBancar;
import decorator.PbBanca.classes.DecoratorCard;
import decorator.PbBanca.classes.DecoratorContactLess;

public class Main {
    public static void main(String[] args) {
        // Cream un card de bază
        CardBancar card = new Card();

        // Efectuăm plăți online și normale cu cardul de bază
        card.efectueazaPlataOnline();
        card.efectueazaPlataNormala();
        System.out.println();
        // Adăugăm funcționalitatea de plată ContactLess folosind decoratorul
        DecoratorCard cardCuContactLess = new DecoratorContactLess(card);
cardCuContactLess.efectueazaPlataContactLess();
        // Efectuăm o plată ContactLess
         //cardCuContactLess.efectueazaPlataContactLess();

        // Efectuăm plăți online și normale cu cardul cu funcționalitatea de plată ContactLess adăugată
//        cardCuContactLess.efectueazaPlataOnline();
//        cardCuContactLess.efectueazaPlataNormala();
    }
}
