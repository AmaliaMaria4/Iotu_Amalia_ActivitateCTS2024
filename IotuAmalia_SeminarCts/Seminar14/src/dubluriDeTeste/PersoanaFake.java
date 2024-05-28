package dubluriDeTeste;

public class PersoanaFake implements IPersoana{
  private String valoareGetSex;
  private int valoareGetVarsta;
  private boolean valoareGetCheckCNP;

    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoareGetCheckCNP(boolean valoareGetCheckCNP) {
        this.valoareGetCheckCNP = valoareGetCheckCNP;
    }

    public String getValoareGetSex() {
        return valoareGetSex;
    }

    public int getValoareGetVarsta() {
        return valoareGetVarsta;
    }

    public boolean getValoareGetCheckCNP() {
        return valoareGetCheckCNP;
    }

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return 0;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
