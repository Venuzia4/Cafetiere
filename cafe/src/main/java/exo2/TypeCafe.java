package exo2;

public enum TypeCafe {
    JAVA( 0.035),
    MOKA( 0.025),
    TYPICA(0.027),
    BOURBON( 0.030),
    BATARD(0.00);

    public double coutParM;

    TypeCafe(double coutParM) {
        this.coutParM = coutParM;
    }
}
