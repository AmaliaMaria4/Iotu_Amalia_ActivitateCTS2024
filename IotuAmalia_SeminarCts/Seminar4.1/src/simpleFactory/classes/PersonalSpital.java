package simpleFactory.classes;

public abstract class PersonalSpital {
    private String nume;
    private int salariu;

    public String getNume() {
        return nume;
    }

    public PersonalSpital(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }

    public abstract void afisarePersonal();
}

