package template.classes;

public class SpitalPublic extends Template{
    private String numeSpital;
    private int nrPaturiLibere;

    public SpitalPublic(String numeSpital, int nrPaturiLibere) {
        this.numeSpital = numeSpital;
        this.nrPaturiLibere = nrPaturiLibere;
    }

    @Override
    protected void analizaSanatate(Pacient pacient) {
        pacient.setStareSanatate((pacient.getNume().length()%5)+1);
        System.out.println("Pacientul "+pacient.getNume()+" are starea "+pacient.getStareSanatate());
    }

    @Override
    protected int disponibilitatePaturi() {
        return nrPaturiLibere;
    }

    @Override
    protected void emitereFisa(Pacient pacient) {
        System.out.println("pacientul "+pacient.getNume()+" este internat in spitalul "+this.numeSpital);
        nrPaturiLibere=nrPaturiLibere-1;
    }

    @Override
    protected void refuzaInternare(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+"este trimis catre un alt spital,deoarcere in spitalul "+this.numeSpital +" nu sunt locuri");
    }
}
