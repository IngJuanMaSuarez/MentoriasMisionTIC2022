public class VIP extends Asistente {

    private boolean[] pantallas = new boolean[]{false, false, false};
    private String credencialesPrevia = "";

    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia, String credenciales) {
        super(idTiquete, nombreCompleto, direccionResidencia);
    }

    public boolean[] getPantallas() {
        return pantallas;
    }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }

    public void generarCredencialesPrevia(){

    }

    public void asignarPantalla(int l){

    }

}
