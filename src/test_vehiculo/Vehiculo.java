package test_vehiculo;

public abstract class Vehiculo {

    private String Matricula;
    private double Velocidad;
    private String Marca;

    public Vehiculo(String Matricula) {
        this.Matricula = Matricula;
        this.Velocidad = 0;
        this.Marca = " ";
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public abstract String ToString();

    public abstract void Acelerar(double Kmh);
}
