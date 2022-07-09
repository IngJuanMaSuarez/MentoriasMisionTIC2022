public class Perro extends Animal implements IDormir {

    private boolean Fiel;

    public Perro(String nombre, int edad, char sexo, String raza) {
        super(nombre, edad, sexo, raza);
    }

    public boolean isFiel() {
        return Fiel;
    }

    public void setFiel(boolean fiel) {
        Fiel = fiel;
    }

    public String hablar(){
        return   "guau guau woof woof";
    }

    @Override
    public String comer() {
        return "El perro está comiendo de forma acelarada";
    }

    @Override
    public String toString() {
        return "Perro{" +
                "Fiel=" + Fiel +
                '}';
    }

    @Override
    public String caminar() {
        return "Vamos a dar un paseo al parque";
    }

    @Override
    public String dormir() {
        return "El perro duerme placenteramente";
    }
}
