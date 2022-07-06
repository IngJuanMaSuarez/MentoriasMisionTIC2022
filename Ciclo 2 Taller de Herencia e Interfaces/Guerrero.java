import java.util.ArrayList;
import java.util.Date;

public class Guerrero extends Humano implements IAsignable {

    //ATRIBUTOS
    private double ataque;

    public Guerrero(String nombre, char sexo, double vida, double ataque, double defensa, double velocidad) {
        super(nombre, sexo, vida, defensa, velocidad);
        this.ataque = ataque;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    //METODOS
    public void atacar(){}
    public void defender(){}

    @Override
    public String toString() {
        return "Guerrero{" +
                "ataque=" + ataque +
                '}';
    }

}
