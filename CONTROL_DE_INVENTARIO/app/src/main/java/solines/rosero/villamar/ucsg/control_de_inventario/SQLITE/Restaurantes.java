package solines.rosero.villamar.ucsg.control_de_inventario.SQLITE;

/**
 * Created by sukasa on 21/02/2017.
 */

public class Restaurantes {
    private int codigo;
    private String nombre;
    private String estado;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
