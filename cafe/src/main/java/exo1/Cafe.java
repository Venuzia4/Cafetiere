package exo1;

public class Cafe {
    public TypeCafe typeCafe;
    public double quantiteLiquideMl;

    public Cafe() {
       this.typeCafe =TypeCafe.MOKA;
       this.quantiteLiquideMl=100;

    }

    public Cafe(TypeCafe typeCafe, double quantiteLiquideMl) {
        this.typeCafe = typeCafe;
        this.quantiteLiquideMl = quantiteLiquideMl;
    }


    public Cafe(exo3.TypeCafe moka, double quantiteCafeMax) {
    }
}
