package simpleFactory.Farmacie.classes;

public class FabricaFarmacie {
    public ICategorieMedicamente createObject(TipMedicament medicament)throws Exception{
        switch (medicament){
            case durere:
                return new Durere();
            case raceala:
                return new Raceala();
            case body:
                return new Body();
            default:
                throw new Exception("Tipul nu este definit");
        }
    }
}
