package simpleFactory.Spital.classes;

public class FabricaPersonalSpital {
    public IPersonalSpital createObiect(TipAngajati angajati) throws Exception {
        switch (angajati){
            case asistent:
                return new Asistent();

            case medic:
                return new Medic();

            case brancardier:
                return new Brancardier();

            default:
                throw new Exception("Tipul nu este valid");
        }
    }
}
