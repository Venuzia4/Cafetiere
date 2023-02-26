package exo1;

public class Cafetiere {
    public Cafetiere() {
    }

    public void remplirTasse(Tasse tasse){
      tasse.cafe=new Cafe(TypeCafe.MOKA, tasse.quantiteCafeMax);
        }


    public void remplirTasse(Tasse tasse, TypeCafe typeCafe,double quantiteCafe){
   tasse.cafe=new Cafe(typeCafe,quantiteCafe);

    }

}
