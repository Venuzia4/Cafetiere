package exo3;

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


    public void addCafe(Cafe commandeCafe) {
        if(cafe == null) {
            cafe = commandeCafe ;
        } else {
            cafe.quantiteLiquideMl += commandeCafe.quantiteLiquideMl ;
            if(cafe.typeCafe != commandeCafe.typeCafe)
                cafe.typeCafe = TypeCafe.BATARD ;
        }
        checkQuantite() ;
    }

    public void checkQuantite() {
        if(cafe == null)
            return ;
        if(cafe.quantiteLiquideMl > quantiteCafeMax) {
            cafe.quantiteLiquideMl = quantiteCafeMax ;
            System.out.println("Il y a trop de caf� dans la tasse !");
        }

    }
    @Override
    public String toString(){
        return ("la quantite maximale est la suivante: " + quantiteCafeMax + " le café "+cafe);
    }
}
