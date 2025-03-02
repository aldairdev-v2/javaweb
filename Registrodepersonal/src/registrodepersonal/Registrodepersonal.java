
package registrodepersonal;

import java.util.List;
import java.util.ArrayList;

//CLASES    
import registrodepersonal.departamento.Departamento;
import registrodepersonal.direccion.Direccion;
import registrodepersonal.empleado.Empleado;


public class Registrodepersonal {

    public static void main(String[] args) {
        
        //LISTA DPTO
        List<Departamento> lista_dpto = new ArrayList<>();
        
        Departamento dpto = new Departamento();
        dpto.setNombre_dpto("Produccion");
        lista_dpto.add(dpto);
        
        for(int i = 0; i < lista_dpto.size(); i++){
            
            Departamento departamento = lista_dpto.get(i);
            System.out.println("Nombre departamento: "+departamento.getNombre_dpto());
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
        }
        
        //LISTA DIRECCION
        List<Direccion> lista_direccion = new ArrayList<>();
        
        Direccion dir = new Direccion();
        dir.setCalle("Avenida Central");
        dir.setColonia("Lazaro Cardenas");
        dir.setCod_postal(55629);
        dir.setNumero_ext("SN");
        dir.setMunicipio("Zumpango");
        dir.setEstado("Estado de México");
        lista_direccion.add(dir);
        
        for(int i = 0; i < lista_direccion.size(); i++){
            
            Direccion direccion = lista_direccion.get(i);
            System.out.println("Calle: "+direccion.getCalle());
            System.out.println("Colonia: "+direccion.getColonia());
            System.out.println("Codigo postal: "+direccion.getCod_postal());
            System.out.println("Numero ext: "+direccion.getNumero_ext());
            System.out.println("Municipio: "+direccion.getMunicipio());
            System.out.println("Estado: "+direccion.getEstado());
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
        }
        
        //LISTA EMPLEADO
        List<Empleado> lista_empleado = new ArrayList<>();
        
        Empleado emp = new Empleado();
        emp.setNombre_emp("Alan Aldair");
        emp.setApp_pat("Chávez");
        emp.setApp_mat("Hernández");
        emp.setEdad(24);
        emp.setCurp("CAHA010127HMCHRLA3");
        lista_empleado.add(emp);
    }
    
}
