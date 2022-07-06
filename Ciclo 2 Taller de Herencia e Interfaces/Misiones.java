import java.util.Date;

public class Misiones {

    private Date fecha;
    private String descripcion;

    public Misiones(Date fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Misiones{" +
                "fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
