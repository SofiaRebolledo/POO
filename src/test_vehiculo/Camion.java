package test_vehiculo;

public class Camion extends Vehiculo {
    
    private Remolque ObjRemolque;
    
    public Camion(String Matricula) {
        super(Matricula);
        ObjRemolque = null;
    }
    
    public Remolque getObjRemolque() {
        return ObjRemolque;
    }
    
    public void setObjRemolque(Remolque ObjRemolque) {
        this.ObjRemolque = ObjRemolque;
    }
    
    public void PonRemolque(Remolque ObjRemolque) {
        ObjRemolque.setPeso((int) Math.floor(Math.random() * 10 + 1));
        this.setObjRemolque(ObjRemolque);
        System.out.println("Ahora el camion tiene remolque");
    }
    
    public void QuitaRemolque() {
        this.setObjRemolque(null);
        System.out.println("Ahora el camion no tiene remolque");
    }
    
    @Override
    public String ToString() {
        String L = "";
        if (this.ObjRemolque == null) {
            L = ("Su camion de marca: " + this.getMarca() + " ,con maticula: " + this.getMatricula() + " ,cuenta con una velocidad de: " + this.getVelocidad() + " Km/h");
        } else {
            L = ("Su camion de marca: " + this.getMarca() + " ,con maticula: " + this.getMatricula() + " ,cuenta con una velocidad de: " + this.getVelocidad() + " Km/h"
                    + " Remolque: " + this.ObjRemolque.ToString());
            DemasiadoRapido ObjDemasiadoRapido = new DemasiadoRapido();
            ObjDemasiadoRapido.MuyRapido(this.getVelocidad());
        }
        return L;
    }
    
    @Override
    public void Acelerar(double Kmh) {
        this.setVelocidad(this.getVelocidad() + Kmh);
    }
}
