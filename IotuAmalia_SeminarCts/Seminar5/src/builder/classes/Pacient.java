package builder.classes;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciDeCamera;
    private boolean halatPtIbterior;

    public Pacient(boolean patRabatabil, boolean micDejun, boolean papuciDeCamera, boolean halatPtIbterior) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPtIbterior = halatPtIbterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halatPtIbterior=" + halatPtIbterior +
                '}';
    }

     void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

     void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

     void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

     void setHalatPtIbterior(boolean halatPtIbterior) {
        this.halatPtIbterior = halatPtIbterior;
    }
}
