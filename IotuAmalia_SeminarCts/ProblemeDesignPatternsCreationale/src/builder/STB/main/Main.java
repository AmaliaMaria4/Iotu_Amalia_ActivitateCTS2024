package builder.STB.main;

import builder.STB.classes.AutobuzLinie;
import builder.STB.classes.AutobuzLinieBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzLinieBuilder autobuzLinieBuilder=new AutobuzLinieBuilder();
        autobuzLinieBuilder.setModelAutobuz("mercedes").setAreOprireLaCapat(true).build();
        AutobuzLinie autobuzLinie=new AutobuzLinieBuilder().setModelAutobuz("mercedes").setDeschideUsileInFiecareStatie(true).setTextEcran("lma").setNumeSofer("gigi").setAreOprireLaCapat(true).setNumarInmatriculare("b122aem").build();
        System.out.println(autobuzLinie);
    }
}
