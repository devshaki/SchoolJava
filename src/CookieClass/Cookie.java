package CookieClass;

public class Cookie {
    private boolean hasGluten;
    private int eggCount;
    private int suger;
    private int flour;
    public Cookie(){}
    public Cookie(boolean hasGluten,int eggCount,int suger,int flour)
    {
        this.hasGluten = hasGluten;
        this.eggCount = eggCount;
        this.suger = suger;
        this.flour = flour;
    }



    public boolean isHasGluten(){
        return hasGluten;
    }
    public int getEggCount() {
        return eggCount;
    }

    public int getFlour() {
        return flour;
    }

    public int getSuger() {
        return suger;
    }

    public void setHasGluten(boolean hasGluten) {
            this.hasGluten = hasGluten;
    }

    public void setEggCount(int eggCount) {
        if (eggCount>0) {
            this.eggCount = eggCount;
        }
    }
    public void setSuger(int suger) {
        if (suger>0) {
            this.suger = suger;
        }
    }
    public void setFlour(int flour) {
        if (flour>0) {
            this.flour = flour;
        }
    }
}
