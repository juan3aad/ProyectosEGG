package poo;

import Entidades.Persona;

import java.time.*;

public class POO {

    
    public static void main(String[] args) {
        LocalDate fechaNac = LocalDate.parse("2001-08-04");
        Persona p1=new Persona("Mariano", "Santi", 21, 43635719,fechaNac );
            //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        p1.mostrarfecha();
        
}    
}