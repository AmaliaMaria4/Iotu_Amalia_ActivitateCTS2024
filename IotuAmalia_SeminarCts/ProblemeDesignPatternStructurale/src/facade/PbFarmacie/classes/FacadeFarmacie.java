package facade.PbFarmacie.classes;


import java.time.LocalDate;
import java.util.List;

public class FacadeFarmacie {
   public void verificaElemente(boolean areReteta, boolean areMedicamenteNecesare, boolean areCardDeSanatate,
                                LocalDate dataEmitere, int id, List<String> medicamente, List<String> medicamenteDepozit, LocalDate dataCurenta){
       Client client=new Client(areReteta,areMedicamenteNecesare,areCardDeSanatate);
       Reteta reteta=new Reteta(dataEmitere,id,medicamente);
       DepozitMedicamente depozitMedicamente=new DepozitMedicamente(medicamenteDepozit);
       client.verificaAreCard();
       reteta.verificaReteta(dataCurenta);
       depozitMedicamente.verificaDisponibilitateMedicamente(reteta);
   }
}
