
package retroalimentacionbasica.deporte;

public class Deporte {
    
    private String nombre;
    private String tipo;
    private int num_jugadores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNum_jugadores() {
        return num_jugadores;
    }

    public void setNum_jugadores(int num_jugadores) {
        this.num_jugadores = num_jugadores;
    }
}
