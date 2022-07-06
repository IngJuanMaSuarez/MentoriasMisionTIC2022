public abstract class Humano {

    //ATRIBUTOS
    private String nombre;
    private char sexo;
    private double vida;
    private double defensa;
    private double velocidad;

    public Humano(String nombre, char sexo, double vida, double defensa, double velocidad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.vida = vida;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    //METODOS
    public void caminar(){}

    @Override
    public String toString() {
        return "Humano{" +
                "nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", vida=" + vida +
                ", defensa=" + defensa +
                ", velocidad=" + velocidad +
                '}';
    }
}
