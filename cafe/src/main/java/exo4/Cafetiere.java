package exo4;


import exo2.Cafe;
import exo2.Tasse;
import exo2.TypeCafe;

public class Cafetiere {

    public void remplirTasse(Tasse tasse){
        tasse.cafe=new Cafe(TypeCafe.MOKA,tasse.quantiteCafeMax);
    }



    public void remplirTasse(exo2.Tasse tasse, exo2.TypeCafe typeCafe, double quantiteCafe){
        if(tasse.cafe!=null){
            tasse.cafe.quantiteLiquideMl+=quantiteCafe;
            if(typeCafe!=tasse.cafe.getTypeCafe()){
                tasse.cafe.typeCafe = exo2.TypeCafe.BATARD;
            }
            else{
                tasse.cafe = new exo2.Cafe(typeCafe,quantiteCafe);
            }

            if(tasse.cafe.quantiteLiquideMl > tasse.quantiteCafeMax)
            {
                System.out.println("sos ma tasse deborde");
                tasse.cafe.quantiteLiquideMl = tasse.quantiteCafeMax ;
            }
        }

    }
}
