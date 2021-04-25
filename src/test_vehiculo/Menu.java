package test_vehiculo;

import static java.lang.System.exit;
import java.util.Scanner;

public class Menu {

    private int Opc;
    private Persona[] ObjPersona;
    private Scanner Input;

    public Menu() {
        this.Opc = 1;
        this.Input = new Scanner(System.in);
        this.ObjPersona = new Persona[10];
    }

    public int getOpc() {
        return Opc;
    }

    public void setOpc(int Opc) {
        this.Opc = Opc;
    }

    public String ListaMarcas(int a) {
        String Marca = "";
        if (a == 0) {
            Marca = "BMW";
        }
        if (a == 1) {
            Marca = "Mercedes-Benz";
        }
        if (a == 2) {
            Marca = "Audi";
        }
        if (a == 3) {
            Marca = "Renault";
        }
        if (a == 4) {
            Marca = "Ford";
        }
        return Marca;
    }

    public void Proceso() {
        int NumeroRegistro = 0;
        Persona PersonaActual = new Persona();
        System.out.println("Bienvenid@...!!!");
        while (this.getOpc() < 4 && this.getOpc() > 0) {
            System.out.println("***Menu Principal***"
                    + "\n1. Registrarse"
                    + "\n2. Iniciar Sesion"
                    + "\n3. Salir");
            this.setOpc(Input.nextInt());
            if (this.getOpc() == 1 || this.getOpc() == 2) {
                int OpcVehiculos = 1;
                if (this.getOpc() == 1) {
                    this.ObjPersona[NumeroRegistro] = new Persona();
                    this.ObjPersona[NumeroRegistro].RegistrarNombre(Input);
                    this.ObjPersona[NumeroRegistro].RegistrarContraseña(Input);
                    PersonaActual = this.ObjPersona[NumeroRegistro];
                    System.out.println("Hola " + PersonaActual.getNombre());
                    NumeroRegistro += 1;
                }
                if (this.getOpc() == 2) {
                    System.out.print("Digita tu nombre: ");
                    String N = this.Input.next();
                    System.out.print("Digita tu contraseña: ");
                    String C = this.Input.next();
                    for (int c = 0; c < NumeroRegistro; c++) {
                        if (this.ObjPersona[c].ValidarNombre(N) && this.ObjPersona[c].ValidarContraseña(C)) {
                            PersonaActual = this.ObjPersona[c];
                            System.out.println("Hola " + PersonaActual.getNombre());
                        }
                    }
                }
                while (OpcVehiculos < 5 && OpcVehiculos > 0) {
                    System.out.println("***Menu de Vehiculos***"
                            + "\n1. Coches"
                            + "\n2. Camiones"
                            + "\n3. Ver Inventario"
                            + "\n4. Cerrar Sesion"
                            + "\n5. Salir");
                    OpcVehiculos = this.Input.nextInt();
                    if (OpcVehiculos > 5 || OpcVehiculos < 0) {
                        System.out.println("Digitaste una opción invalida");
                    }
                    if (OpcVehiculos == 1) {
                        System.out.print("¿Cuántas puertas tiene el coche? ");
                        int NP = this.Input.nextInt();
                        System.out.print("¿Cuál es la matricula del coche? ");
                        String M = this.Input.next();
                        Coche ObjCoche = new Coche(NP, M);
                        ObjCoche.setMarca(this.ListaMarcas((int) Math.floor(Math.random() * 4 + 0)));
                        ObjCoche.setVelocidad((double) Math.floor(Math.random() * 30 + 1));
                        System.out.println(ObjCoche.ToString());
                        System.out.print("Quiere acelerar??? S/N ");
                        M = this.Input.next();
                        if (M.charAt(0) == 'S' || M.charAt(0) == 's') {
                            System.out.print("Cual es la velocidad (Km/h) que desea acelerar??? ");
                            ObjCoche.Acelerar(this.Input.nextDouble());
                            System.out.println(ObjCoche.ToString());
                        }
                        System.out.print("Quiere agregar este vehiculo a su inventario??? S/N ");
                        M = this.Input.next();
                        if (M.charAt(0) == 'S' || M.charAt(0) == 's') {
                            PersonaActual.AgregarCoche(ObjCoche);
                        }
                    }
                    if (OpcVehiculos == 2) {
                        System.out.print("¿Cuál es la matricula del camion? ");
                        String M = this.Input.next();
                        Camion ObjCamion = new Camion(M);
                        ObjCamion.setMarca(this.ListaMarcas((int) Math.floor(Math.random() * 4 + 0)));
                        ObjCamion.setVelocidad((double) Math.floor(Math.random() * 30 + 1));
                        System.out.println(ObjCamion.ToString());
                        System.out.print("Quiere acelerar??? S/N ");
                        M = this.Input.next();
                        if (M.charAt(0) == 'S' || M.charAt(0) == 's') {
                            System.out.print("Cual es la velocidad (Km/h) que quiere acelerar??? ");
                            ObjCamion.Acelerar(this.Input.nextDouble());
                            System.out.println(ObjCamion.ToString());
                        }
                        System.out.print("El camion tiene remolque? S/N ");
                        M = this.Input.next();
                        if (M.charAt(0) == 'S' || M.charAt(0) == 's') {
                            Remolque ObjRemolque = new Remolque();
                            ObjCamion.PonRemolque(ObjRemolque);
                            System.out.println(ObjCamion.ToString());
                        }
                        System.out.print("Quiere agregar este vehiculo a su inventario??? S/N ");
                        M = this.Input.next();
                        if (M.charAt(0) == 'S' || M.charAt(0) == 's') {
                            PersonaActual.AgregarCamion(ObjCamion);
                        }
                    }
                    if (OpcVehiculos == 3) {
                        PersonaActual.MostrarInventario();
                    }
                    if (OpcVehiculos == 4) {
                        OpcVehiculos = 6;
                    }
                    if (OpcVehiculos == 5) {
                        exit(0);
                    }
                }
                if (this.getOpc() == 3) {
                    exit(0);
                }
            }
        }
    }
}
