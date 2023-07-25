/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.PerroController;
import controller.PersonaController;
import java.util.Scanner;
import model.Perro;
import model.Persona;

/**
 *
 * @author ajuand
 */
public class PrincipalAdopcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        PerroController perroController = new PerroController();
        PersonaController personaController = new PersonaController();

        int op = 0;
        do {
            System.out.println("---MENU--");
            System.out.println("1. Ingresar perros");
            System.out.println("2. Mostrar Perros");
            System.out.println("3. Ingresar Personas");
            System.out.println("4. Mostrar Personas");
            System.out.println("5. Buscar Persona para asignar perro");
            System.out.println("6. Eliminar perros");
            System.out.println("7. Eliminar perros por personas");
            System.out.println("8. Salir");
            System.out.println("Seleccione una opción:");
            op = leer.nextInt();

            switch (op) {
                case 1://ingresar personas

                    System.out.println("====Ingreso Perros====");
                    System.out.println("Ingrese el nombre del perro:");
                    String nombre = leer.next();

                    System.out.println("Ingrese Edad:");
                    Integer edad = leer.nextInt();

                    System.out.println("Ingrese el tamaño:");
                    String tamano = leer.next();

                    Perro perro = new Perro(nombre, edad, tamano, false);

                    perroController.agregarPerro(perro);

                    break;

                case 2://Mostrar Perros
                    perroController.mostrarPerros();
                    break;

                case 3://ingresar Personas 
                    System.out.println("\n===Ingreso Personas===");
                    System.out.println("Ingrese nombre:");
                    String nombrePer = leer.next();
                    System.out.println("Ingrese apellido:");
                    String apellidoPer = leer.next();
                    System.out.println("Ingrese edad:");
                    Integer edadPer = leer.nextInt();
                    System.out.println("Ingrese documento:");
                    String documentoPer = leer.next();

                    Persona persona = new Persona(nombrePer, apellidoPer, edadPer, documentoPer);
                    personaController.agregarPersona(persona);
                    break;

                case 4://Mostrar Personas
                    personaController.mostrarPersonas();
                    break;

                case 5: //Buscar persona para asignar Perro
                    System.out.println("Ingrese el nombre de la persona:");
                    String nombrePersonaBuscado = leer.next();
                    Persona personaEncontrado = personaController.buscarPersonaPorNombre(nombrePersonaBuscado);

                    if (personaEncontrado != null) {
                        System.out.println("\nIngrese el nombre del perro adoptar:");
                        String nombrePerroBuscado = leer.next();

                        Perro perroEncontrado = perroController.buscarPerroPorNombre(nombrePerroBuscado);
                        if (perroEncontrado != null) {
                            if (perroEncontrado.isAdoptado()) {
                                System.out.println("YA se encuentra adoptado");
                            } else {
                                personaEncontrado.setPerro(perroEncontrado);
                                perroEncontrado.setAdoptado(true);
                                System.out.println("!!Perro adoptado exitosamente  por " + personaEncontrado.getNombre());
                            }

                        } else {
                            System.out.println("Perro no existe");
                        }

                    } else {
                        System.out.println("Persona no encontrada");
                    }

                    break;
                case 6: //Eliminar Perros
                    System.out.println("Ingrese el nombre del perro a eliminar: ");
                    String nombrePerroBuscado1 = leer.next();
                    Perro perroEncontrado1 = perroController.buscarPerroPorNombre(nombrePerroBuscado1);

                    if (perroEncontrado1 != null) {
                        perroController.eliminarPerro(perroEncontrado1);
                        System.out.println("!!Perro eliminado con exito");
                    } else {
                        System.out.println("El perro no se encuentra");
                    }
                    
                    break;
                case 7://Retirar perro del adoptante
                    System.out.println("Ingrese el nombre de la persona:");
                    String nombrePersonaBuscado2=leer.next();
                    
                    Persona personaEncontrado2=personaController.buscarPersonaPorNombre(nombrePersonaBuscado2);
                    if(personaEncontrado2!=null)    {
                        
                         Perro perroEncontrado2= perroController.buscarPerroPorNombre(personaEncontrado2.getPerro().getNombre());
                                if(perroEncontrado2!=null)
                                {
                                    perroEncontrado2.setAdoptado(false);
                                    
                                }
                                else
                                {
                                    System.out.println("El perro no existe");
                                }
                                personaEncontrado2.setPerro(null);
                    }
break;                    

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (op != 8);

    }

}
