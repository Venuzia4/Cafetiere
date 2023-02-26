package exo2;


public class Cafetiere {
    public Cafetiere() {
    }

    public void remplirTasse(Tasse tasse){
        tasse.cafe=new Cafe(TypeCafe.MOKA,tasse.quantiteCafeMax);

    }


    public void remplirTasse(Tasse tasse, TypeCafe typeCafe, double quantiteCafe){
        if(tasse.cafe!=null){
            tasse.cafe.quantiteLiquideMl+=quantiteCafe;
            if(typeCafe!=tasse.cafe.getTypeCafe()){
                tasse.cafe.typeCafe =TypeCafe.BATARD;
            }
            else{
                tasse.cafe = new Cafe(typeCafe,quantiteCafe);
            }

            if(tasse.cafe.quantiteLiquideMl > tasse.quantiteCafeMax)
            {
                System.out.println("sos ma tasse deborde");
                tasse.cafe.quantiteLiquideMl = tasse.quantiteCafeMax ;
            }
        }

    }
}
