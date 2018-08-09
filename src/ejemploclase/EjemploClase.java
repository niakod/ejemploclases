/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase;

/**
 *
 * @author MaR
 */
public class EjemploClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("María"); //utilizamos el setter para asignar el nombre
        p.setEdad(30);
        p.setEmail("niakodmaria@gmail.com");
        //utilizamos el getter para obtener el nombre:
        System.out.println("El nombre de la persona es: "+p.getNombre());
        System.out.println("Edad: "+p.getEdad()+". E-mail: "+p.getEmail()+".");
        //creamos otra Persona utilizando el constructor con parámetros:
        Persona per = new Persona("Pepe",20,"pepe@mail.com");
        System.out.println(per.getNombre()+" tiene "+per.getEdad()+" años y su e-mail es "+
                per.getEmail()+".");
    }
    
}
