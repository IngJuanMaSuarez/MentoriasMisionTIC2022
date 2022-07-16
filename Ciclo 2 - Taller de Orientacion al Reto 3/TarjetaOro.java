public class TarjetaOro extends TarjetaCine {

    private String[] beneficiosDescripcion = new String[]{"Boleto Gratis", "Crispetas Gratis", "Gaseosa Gratis"};
    private boolean[] beneficiosEstado = new boolean[]{true, true, true};

    public TarjetaOro(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 20);
    }

    public String[] getBeneficiosDescripcion() {
        return beneficiosDescripcion;
    }

    public void setBeneficiosDescripcion(String[] beneficiosDescripcion) {
        this.beneficiosDescripcion = beneficiosDescripcion;
    }

    public boolean[] getBeneficiosEstado() {
        return beneficiosEstado;
    }

    public void setBeneficiosEstado(boolean[] beneficiosEstado) {
        this.beneficiosEstado = beneficiosEstado;
    }

    public boolean redimirBeneficio(int p){
        return false;
    }
}
