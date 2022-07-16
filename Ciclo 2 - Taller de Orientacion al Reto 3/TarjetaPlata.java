public class TarjetaPlata extends TarjetaCine {

    private int cantidadVisitas = 0;
    private boolean elegibleOro = false;

    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 10);
    }

    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }

    @Override
    public double pagar(String[] cuenta) {
        this.cantidadVisitas++;
        this.elegibleOro = true;
        int total = 0;
        for (String producto: cuenta) {
            if (producto == "Boleta"){
                total += 6000;
            } else if (producto == "Combo 1") {
                total += 8000;
            } else if (producto == "Combo 2") {
                total += 12000;
            }
        }
        return total * (1 - super.getPorcentajeDescuento() / 100);
    }
}
