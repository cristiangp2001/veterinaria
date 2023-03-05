import javax.swing.*;
import java.util.Scanner;

public class Animal {
Scanner sc = new Scanner(System.in);

    public String nombre = "";
    public int fecha = 0;
    public String tipoAnimal = "";

    public Animal(){
      this.nombre =  nombre;
      this.tipoAnimal = tipoAnimal;
      this.fecha = fecha;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public void setFecha(){
        this.fecha = fecha;
    }
    public void setTipoAnimal(){
        this.tipoAnimal = tipoAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoAnimal(){
        return tipoAnimal;
    }

    public int getFecha(){
        return fecha;
    }

    void RegistrarAnimal(){

        int opcion = 0;
        System.out.println("Bienvenidos al sistema de veterinaria" +
                "\n1. CAPTURAR ANIMAL" +
                "\n2. CONSULTAR ANIMAL" +
                "\n3. SALIR");
        opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Ingrese el nombre del animal");
                nombre = sc.next();

                System.out.println("¿Qué raza es?");
                tipoAnimal = sc.next();

                System.out.println("Ingrese la edad del animal");
                fecha = sc.nextInt();

                System.out.println("Animal guardado");


            System.out.println("El nombre guardado es " + nombre + "\n La raza es: " + tipoAnimal +
                    "\n y su edad es " + fecha + " años");

            break;
            case 2:
                System.out.println("El nombre guardado es " + nombre + "\n La raza es: " + tipoAnimal +
                        "\n y su edad es " + fecha + " años");
                break;

            case 3:
                System.exit(1);
                break;



            default:
                System.out.println("La opción es incorrecta");
                break;


        }




    }


}
