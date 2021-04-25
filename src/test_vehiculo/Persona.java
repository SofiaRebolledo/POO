package test_vehiculo;

import java.util.Scanner;

public class Persona {

    private String Nombre;
    private Camion[] ArregloCamion;
    private Coche[] ArregloCoche;
    private String Contraseña;

    public Persona() {
        this.Nombre = "";
        this.ArregloCamion = new Camion[10];
        this.ArregloCoche = new Coche[10];
        for (int c = 0; c < 10; c++) {
            this.ArregloCamion[c] = null;
            this.ArregloCoche[c] = null;
        }
        this.Contraseña = " ";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void AgregarCoche(Coche Obj) {
        for (int c = 0; c < 10; c++) {
            if (this.ArregloCoche[c] == null) {
                this.ArregloCoche[c] = Obj;
                c = 10;
            }
        }
    }

    public void AgregarCamion(Camion Obj) {
        for (int c = 0; c < 10; c++) {
            if (this.ArregloCamion[c] == null) {
                this.ArregloCamion[c] = Obj;
                c = 10;
            }
        }
    }

    public void RegistrarNombre(Scanner Input) {
        System.out.print("Por favor digita tu nombre: ");
        this.setNombre(Input.next());
    }

    public boolean ValidarNombre(String N) {
        if (N.equals(this.getNombre())) {
            return true;
        }
        return false;
    }

    public void RegistrarContraseña(Scanner Input) {
        System.out.print("Por favor digita tu contraseña: ");
        this.setContraseña(Input.next());
    }

    public boolean ValidarContraseña(String C) {
        if (C.equals(this.getContraseña())) {
            return true;
        }
        return false;
    }

    public void MostrarInventario() {
        System.out.println("Su inventario actual es : ");
        System.out.println("COCHES");
        for (int c = 0; c < 10; c++) {
            if (this.ArregloCoche[c] != null) {
                System.out.println(this.ArregloCoche[c].ToString());
            }
        }
        System.out.println("CAMIONES");
        for (int c = 0; c < 10; c++) {
            if (this.ArregloCamion[c] != null) {
                System.out.println(this.ArregloCamion[c].ToString());
            }
        }
    }
}
