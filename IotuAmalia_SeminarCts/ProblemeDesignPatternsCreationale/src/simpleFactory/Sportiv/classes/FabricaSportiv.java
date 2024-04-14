package simpleFactory.Sportiv.classes;

public class FabricaSportiv {
    public ISportiv createObject(TipJucator jucator) throws Exception{
        switch (jucator){
            case fundas:
                return new Fundas();
            case atacant:
                return new Atacant();
            case portar:
                return new Portar();
            default:
                throw new Exception("Tipul nu este definit");
        }
    }
}
