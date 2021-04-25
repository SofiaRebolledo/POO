package test_vehiculo;

public class Remolque {

    private int Peso;

    public Remolque() {
        Peso = 0;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public String ToString() {
        String L = "El peso es de " + this.getPeso() + " Toneladas";
        return L;
    }
}
