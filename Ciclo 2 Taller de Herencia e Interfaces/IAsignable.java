import java.util.ArrayList;
import java.util.Date;

public interface IAsignable {

    ArrayList<Misiones> misiones = new ArrayList<>();

    default void asignarMision(Date fecha, String descripcion){
        misiones.add(new Misiones(fecha, descripcion));
    }

    default ArrayList<Misiones> verMisiones(){
        return misiones;
    }

}
