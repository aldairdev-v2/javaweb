
package retroalimentacionbasica.pedido;

import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String[] args) {
        
        List<Pedido> listpedidos = new ArrayList<>();
        
        Pedido p1 = new Pedido();
        p1.setNombrepedido("Arroz");
        p1.setCantidad(2);
        p1.setMarca("SOS");
        p1.setTienda("Aurrera");
    
        listpedidos.add(p1);
        
        // Mostrar información del pedido
        System.out.println("PEDIDO AGREGADO");
        System.out.println("Nombre: " + p1.getNombrepedido());
        System.out.println("Cantidad: " + p1.getCantidad());
        System.out.println("Marca: " + p1.getMarca());
        System.out.println("Tienda: " + p1.getTienda());
        System.out.println("");
        System.out.println("**************");
        System.out.println("");
        
        // PRUEBA OBJETO 2
        Pedido p2 = new Pedido();
        p2.setNombrepedido("Cerveza");
        p2.setCantidad(24);
        p2.setMarca("Miller");
        p2.setTienda("Oxxo");
    
        listpedidos.add(p2);
        
        // Mostrar información del pedido
        System.out.println("PEDIDO AGREGADO");
        System.out.println("Nombre: " + p2.getNombrepedido());
        System.out.println("Cantidad: " + p2.getCantidad());
        System.out.println("Marca: " + p2.getMarca());
        System.out.println("Tienda: " + p2.getTienda());
    }
}
