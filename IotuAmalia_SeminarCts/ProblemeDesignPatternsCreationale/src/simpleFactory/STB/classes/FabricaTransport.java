package simpleFactory.STB.classes;

public class FabricaTransport {
    public IMijlocTransport createObject(TipMijlocTransport mijlocTransport) throws Exception{
        switch (mijlocTransport){
            case autobuz:
                return new Autobuz();
            case tramvai:
                return new Tramvai();
            case troleibuz:
                return new Troleibuz();
            default:
                throw new Exception("Tipul nu este definit");
        }
    }
}
