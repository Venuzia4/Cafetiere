package exo3;


public class Cafe {
    public TypeCafe typeCafe;
    public double quantiteLiquideMl;

    public Cafe() {
        this.typeCafe =TypeCafe.MOKA;
        this.quantiteLiquideMl=100;

    }

    public Cafe(TypeCafe typeCafe,double quantiteLiquideMl) {
        this.typeCafe = typeCafe;
        this.quantiteLiquideMl = quantiteLiquideMl;
    }


    @Override
    public String toString(){
        return ("type de cafe" + typeCafe + " la quantité en liquide est de  "+quantiteLiquideMl);
    }

}
