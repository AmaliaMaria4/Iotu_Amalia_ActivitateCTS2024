package facade.PbFarmacie.classes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Reteta {
    private LocalDate dataEmitere;
    private int id;
    private List<String> medicamente=new ArrayList<>();

    public Reteta(LocalDate dataEmitere, int id, List<String> medicamente) {
        this.dataEmitere = dataEmitere;
        this.id = id;
        this.medicamente = medicamente;
    }

    public void verificaReteta(LocalDate dataCurenta){
        long zileDiferenta= ChronoUnit.DAYS.between( dataCurenta, dataEmitere);
        if(zileDiferenta>-30){
            System.out.println("reteta este valida");
        }else {
            System.out.println("reteta nu este valida");
        }
     //   System.out.println(zileDiferenta);
    }

    public List<String> getMedicamente() {
        return medicamente;
    }
}
