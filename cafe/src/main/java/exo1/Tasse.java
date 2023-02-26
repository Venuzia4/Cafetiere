package exo1;

public class Tasse {
    public double quantiteCafeMax;
    public Cafe cafe;

    public Tasse() {
        this.quantiteCafeMax=100;
    }

    public Tasse(double quantiteCafeMax) {
        this.quantiteCafeMax = quantiteCafeMax;
    }

    public double boire(double quantiteBu){
        cafe.quantiteLiquideMl -= quantiteBu ;
        return cafe.quantiteLiquideMl ;
    }

    public double boire(){
        cafe.quantiteLiquideMl = 0 ;
        return  cafe.quantiteLiquideMl;
    }



}
