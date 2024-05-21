package facade.PbFarmacie.classes;

import java.util.ArrayList;
import java.util.List;

public class DepozitMedicamente {
    private List<String> medicamenteDepozit = new ArrayList<>();

    public DepozitMedicamente(List<String> medicamenteDepozit) {
        this.medicamenteDepozit = medicamenteDepozit;
    }
    public List<String> getMedicamenteDepozit() {
        return medicamenteDepozit;
    }

    public void setMedicamenteDepozit(List<String> medicamenteDepozit) {
        this.medicamenteDepozit = medicamenteDepozit;
    }

    public void verificaDisponibilitateMedicamente(Reteta reteta) {
        for(var med:reteta.getMedicamente()){
            if(medicamenteDepozit.contains(med)){
                System.out.println(" exista in depozit medicamentul "+med.toString());
            }
            else{
                System.out.println(" nu exista in depozit medicamentul "+med.toString());
            }
        }
    }
}
