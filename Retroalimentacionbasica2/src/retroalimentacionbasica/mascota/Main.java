
package retroalimentacionbasica.mascota;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //LISTA 1
        List<Mascota> listamascotas = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            //OBJ 1
            Mascota perro1 = new Mascota();
            perro1.setNombre("Zeus");
            perro1.setRaza("BulTerrier");
            perro1.setEdad(13);
            listamascotas.add(perro1);   
        }
       
        //OBJ 2
        Mascota perro2 = new Mascota();
        perro2.setNombre("Firulais");
        perro2.setRaza("Mestizo");
        perro2.setEdad(9);
        listamascotas.add(perro2);
        
        for (int i = 0; i < 1000; i++) {
            
            //OBJ 1
            Mascota gato1 = new Mascota();
            gato1.setNombre("Naranjo");
            gato1.setRaza("Persa");
            gato1.setEdad(7);
            listamascotas.add(gato1);
        }
        
        //OBJ 2
        Mascota gato2 = new Mascota();
        gato2.setNombre("Simba");
        gato2.setRaza("Siames");
        gato2.setEdad(12);
        listamascotas.add(gato2);
        
        for(int i = 0; i < listamascotas.size();i++){
            
            Mascota mascota = listamascotas.get(i);
            
            System.out.println("MASCOTA AGREGADA");
            System.out.println("Nombre: "+mascota.getNombre());
            System.out.println("Raza: "+mascota.getRaza());
            System.out.println("Edad: "+mascota.getEdad());

            System.out.println("Numero de mascotas agregadas: "+ i);
        }

    }
}
