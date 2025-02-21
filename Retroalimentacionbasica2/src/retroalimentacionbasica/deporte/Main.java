
package retroalimentacionbasica.deporte;

import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        //LIST 1
        List<Deporte> deporteconjunto = new ArrayList<>();
        //OBJ 1
        Deporte depc1 = new Deporte();
        depc1.setNombre("Futbol");
        depc1.setTipo("Equipo");
        depc1.setNum_jugadores(11);
        deporteconjunto.add(depc1);
        // Mostrar lista
        
        
//        System.out.println("DEPORTE AGREGADO");
//        System.out.println("Deporte: "+depc1.getNombre());
//        System.out.println("Tipo: "+depc1.getTipo());
//        System.out.println("Jugador(es): "+depc1.getNum_jugadores());
//        System.out.println("");
        //OBJ 2
        Deporte depc2 = new Deporte();
        depc2.setNombre("Basquetbol");
        depc2.setTipo("Equipo");
        depc2.setNum_jugadores(15);
        deporteconjunto.add(depc2);
//        // Mostrar lista
//        System.out.println("DEPORTE AGREGADO");
//        System.out.println("Deporte: "+depc2.getNombre());
//        System.out.println("Tipo: "+depc2.getTipo());
//        System.out.println("Jugador(es): "+depc2.getNum_jugadores());
//        
//        System.out.println("");
//        System.out.println("**************");
//        System.out.println("");
//        
        //LIST 2
        
        //OBJ 1
        
        for (int i = 0; i < 1000; i++) {
            Deporte depi1 = new Deporte();
            depi1.setNombre("Ajedrez");
            depi1.setTipo("Individual");
            depi1.setNum_jugadores(1);
            deporteconjunto.add(depi1);
        }
       
        // Mostrar lista
//        System.out.println("DEPORTE AGREGADO");
//        System.out.println("Deporte: "+depi1.getNombre());
//        System.out.println("Tipo: "+depi1.getTipo());
//        System.out.println("Jugador(es): "+depi1.getNum_jugadores());
//        System.out.println("");
        
        //OBJ 2
        Deporte depi2 = new Deporte();
        depi2.setNombre("Tenis");
        depi2.setTipo("Individual");
        depi2.setNum_jugadores(1);
        deporteconjunto.add(depi2);
        
//        for(int i = 0; i < deporteconjunto.size(); i++){
//            
//            Deporte depgeneral = deporteconjunto.get(i);
//            
//            System.out.println("DEPORTE AGREGADO");
//            System.out.println("Deporte: "+depgeneral.getNombre());
//            System.out.println("Tipo: "+depgeneral.getTipo());
//            System.out.println("Jugador(es): "+depgeneral.getNum_jugadores());
//            System.out.println("numero de deporte "+i);
//            
//        }
//        

for(Deporte depgeneral:deporteconjunto){
     System.out.println("DEPORTE AGREGADO");
            System.out.println("Deporte: "+depgeneral.getNombre());
            System.out.println("Tipo: "+depgeneral.getTipo());
            System.out.println("Jugador(es): "+depgeneral.getNum_jugadores());
            
    
}

//        // Mostrar lista
//        System.out.println("DEPORTE AGREGADO");
//        System.out.println("Deporte: "+depi2.getNombre());
//        System.out.println("Tipo: "+depi2.getTipo());
//        System.out.println("Jugador(es): "+depi2.getNum_jugadores());
//        
//        System.out.println("");
//        System.out.println("**************");
//        System.out.println("");  
    }
    
}
