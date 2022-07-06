public class NPJ extends Humano {

    //ATRIBUTOS
    private String profesion;

    public NPJ(String nombre, char sexo, double vida, double defensa, double velocidad, String profesion) {
        super(nombre, sexo, vida, defensa, velocidad);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    //METODOS
    public void hablar(){}

    @Override
    public String toString() {
        return "NPJ{" +
                "profesion='" + profesion + '\'' +
                '}';
    }
}
