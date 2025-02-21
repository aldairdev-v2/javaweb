
package retroalimentacionbasica.persona;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //LISTA 1
        List<Persona> personamexico = new ArrayList<>();
        //OBJ 1
        Persona mex1 = new Persona();
        mex1.setNombre("Noemí");
        mex1.setApp_paterno("Bastida");
        mex1.setApp_materno("Bautista");
        mex1.setEdad(23);
        //MOSTRAR LISTA
        System.out.println("PERSONAS MEXICANAS");
        System.out.println("");
        System.out.println("Nombre: "+mex1.getNombre());
        System.out.println("Apellido paterno: "+mex1.getApp_paterno());
        System.out.println("Appelido materno: "+mex1.getApp_materno());
        System.out.println("Edad: "+mex1.getEdad());
        personamexico.add(mex1);
    }
    
}
