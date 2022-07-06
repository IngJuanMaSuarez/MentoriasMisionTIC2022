public class Mago extends Humano implements IAsignable {

    private double nivelMagia;

    public Mago(String nombre, char sexo, double vida, double defensa, double velocidad, double nivelMagia) {
        super(nombre, sexo, vida, defensa, velocidad);
        this.nivelMagia = nivelMagia;
    }

    public double getNivelMagia() {
        return nivelMagia;
    }

    public void setNivelMagia(double nivelMagia) {
        this.nivelMagia = nivelMagia;
    }

    void hechizar(){}
}
