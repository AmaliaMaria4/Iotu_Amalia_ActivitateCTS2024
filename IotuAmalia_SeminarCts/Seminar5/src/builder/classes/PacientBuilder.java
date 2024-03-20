package builder.classes;

public class PacientBuilder implements Builder {
    @Override
    public Pacient build() {
        return pacient;
    }
    Pacient pacient;
    public PacientBuilder(){
        pacient=new Pacient(false,false,false,false);
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }
    public PacientBuilder setMicDejun(boolean micDejun) {
        this.pacient.setMicDejun(micDejun);
        return this;
    }

    public   PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
        this.pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public   PacientBuilder setHalatPtIbterior(boolean halatPtIbterior) {
        this.pacient.setHalatPtIbterior(halatPtIbterior);
        return this;
    }
}

//vi instanta de tip clase;
//v2 atribute
//seter protected in pacient
