package observer.pbStb1.classes;

public interface IAutobuz {
    void adaugaCalator(ICalator calator);
    void stergeCalator(ICalator calator);
    void trimiteNotificare(String notificare);
}
