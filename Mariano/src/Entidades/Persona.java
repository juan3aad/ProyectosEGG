package Entidades;

import java.time.*;

public class Persona {
    public LocalDate fechaNac;
    public String nombre;
    public String apellido;
    public int edad;
    public int documento;
    public Persona(String nombre, String apellido, int edad, int documento,LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.fechaNac = fechaNac;
    }
    public void mostrarfecha(){
       // SimpletimeFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("Fecha De Nacimiento:"+fechaNac);
    }
}