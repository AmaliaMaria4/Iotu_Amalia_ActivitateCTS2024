package adapter.PbRestaurant.main;



import adapter.PbRestaurant.classes.Adapter;
import adapter.PbRestaurant.classes.Bar;
import adapter.PbRestaurant.classes.IBucatarie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printeazaFactura(IBucatarie bucatarie){
        bucatarie.printeazaFactura();
    }

    public static void main(String[] args) {
        List<String> tipuriBauturi=new ArrayList<>();
        tipuriBauturi.add("suc");
        tipuriBauturi.add("aperol");
        tipuriBauturi.add("vin");
        Bar bar=new Bar("Ion",tipuriBauturi);
        System.out.println(bar.toString());
        Adapter adapter=new Adapter(bar);
        //AdapterClase adapterClase = new AdapterClase();
       printeazaFactura(adapter);
      // printeazaFactura(adapterClase);


    }
}
