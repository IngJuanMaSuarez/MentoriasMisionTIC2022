import java.util.ArrayList;

public class Tripulante extends UsuarioMoodle {

    private ArrayList<Double> calificaciones = new ArrayList<>();
    private ArrayList<Boolean> entregas = new ArrayList<>();

    public Tripulante(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, int n) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        for (int i = 0; i < n; i++) {
            this.calificaciones.add(0.0);
            this.entregas.add(false);
        }
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public ArrayList<Boolean> getEntregas() {
        return entregas;
    }

    public void setEntregas(ArrayList<Boolean> entregas) {
        this.entregas = entregas;
    }

    public void resolverReto(int retoAEntregar){

    }

}
