public class Preferencial extends Asistente {

    private boolean participarSorteo = false;

    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia, String credenciales) {
        super(idTiquete, nombreCompleto, direccionResidencia);
    }

    public boolean isParticiparSorteo() {
        return participarSorteo;
    }

    public void setParticiparSorteo(boolean participarSorteo) {
        this.participarSorteo = participarSorteo;
    }

    public void participarSorteo(){

    }

}
