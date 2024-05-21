package adapter.PbRestaurant.classes;

import java.util.ArrayList;

public class AdapterClase extends Bar implements IBucatarie {
    public AdapterClase() {
        super("NA", new ArrayList<>());
    }

    @Override
    public void printeazaFactura() {
        super.cheamaOspatar();
    }

}
