package prototype.STB.main;

import prototype.STB.classes.Autobuz;
import prototype.STB.classes.IPrototype;

public class Main {
    public static void main(String[] args) {
        IPrototype autobuz1=new Autobuz("B12ATR");
        IPrototype autobuz2=new Autobuz("OT56TCR");
        IPrototype autobuz3=autobuz1.copiaza();
        IPrototype autobuz4=autobuz2.copiaza();
        System.out.println(autobuz1);
        System.out.println(autobuz2);
        System.out.println(autobuz3);
        System.out.println(autobuz4);
    }
}
