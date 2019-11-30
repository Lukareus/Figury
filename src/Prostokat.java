public class Prostokat implements Figura {
    private double bokA;
    private double bokB;

    public Prostokat(double A, double B){
        this.bokA = A;
        this.bokB = B;
    }

    @Override
    public double obliczPole() {
        return bokA * bokB;
    }

    @Override
    public double obliczObjetosc() {
        return bokA+bokB;
    }
}
