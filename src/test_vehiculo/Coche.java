package test_vehiculo;

public class Coche extends Vehiculo {

    private int NumPuertas;

    public Coche(int NumPuertas, String Matricula) {
        super(Matricula);
        this.NumPuertas = NumPuertas;
    }

    public int getNumPuertas() {
        return NumPuertas;
    }

    @Override
    public String ToString() {
        String L = ("Su carro de marca: " + this.getMarca() + " ,con maticula: " + this.getMatricula() + " ,cuenta con una velocidad de: " + this.getVelocidad() + " Km/h");
        return L;
    }

    @Override
    public void Acelerar(double Kmh) {
        this.setVelocidad(this.getVelocidad() + Kmh);
    }
}
