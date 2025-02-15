
package retroalimentacionbasica.mascota;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        //LISTA 1
        List<Mascota> listperros = new ArrayList<>();
        //OBJ 1
        Mascota perro1 = new Mascota();
        perro1.setNombre("Zeus");
        perro1.setRaza("BulTerrier");
        perro1.setEdad(13);
        listperros.add(perro1);
        //Mostrar lista
        System.out.println("Lista: ");
        System.out.println("MASCOTA AGREGADA");
        System.out.println("Nombre: "+perro1.getNombre());
        System.out.println("Raza: "+perro1.getRaza());
        System.out.println("Edad: "+perro1.getEdad());
        System.out.println("");
        //OBJ 2
        Mascota perro2 = new Mascota();
        perro2.setNombre("Firulais");
        perro2.setRaza("Mestizo");
        perro2.setEdad(9);
        listperros.add(perro2);
        //Mostrar lista
        System.out.println("MASCOTA AGREGADA");
        System.out.println("Nombre: "+perro2.getNombre());
        System.out.println("Raza: "+perro2.getRaza());
        System.out.println("Edad: "+perro2.getEdad());
        
        System.out.println("");
        System.out.println("**************");
        System.out.println("");
        
        //LISTA 2
        List<Mascota> listgatos = new ArrayList<>();
        //OBJ 1
        Mascota gato1 = new Mascota();
        gato1.setNombre("Naranjo");
        gato1.setRaza("Persa");
        gato1.setEdad(7);
        listperros.add(gato1);
        //Mostrar lista
        System.out.println("MASCOTA AGREGADA");
        System.out.println("Nombre: "+gato1.getNombre());
        System.out.println("Raza: "+gato1.getRaza());
        System.out.println("Edad: "+gato1.getEdad());
        System.out.println("");
        //OBJ 2
        Mascota gato2 = new Mascota();
        gato2.setNombre("Simba");
        gato2.setRaza("Siames");
        gato2.setEdad(12);
        listperros.add(gato2);
        //Mostrar lista
        System.out.println("MASCOTA AGREGADA");
        System.out.println("Nombre: "+gato2.getNombre());
        System.out.println("Raza: "+gato2.getRaza());
        System.out.println("Edad: "+gato2.getEdad());
        
        System.out.println("");
        System.out.println("**************");
        System.out.println("");
       
        
    }
}
