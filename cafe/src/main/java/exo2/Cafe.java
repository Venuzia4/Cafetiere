package exo2;


public class Cafe {
    public double quantiteLiquideMl;

    public TypeCafe typeCafe  ;

    public Cafe() {
        this.typeCafe = TypeCafe.MOKA;
        this.quantiteLiquideMl=100;

    }

    public Cafe(TypeCafe typeCafe, double quantiteLiquideMl) {
        this.typeCafe = typeCafe;
        this.quantiteLiquideMl = quantiteLiquideMl;
    }

    public double getQuantiteLiquideMl() {
        return quantiteLiquideMl;
    }

    public void setQuantiteLiquideMl(double quantiteLiquideMl) {
        this.quantiteLiquideMl = quantiteLiquideMl;
    }

    public TypeCafe getTypeCafe() {
        return typeCafe;
    }

    public void setTypeCafe(TypeCafe typeCafe) {
        this.typeCafe = typeCafe;
    }

}
