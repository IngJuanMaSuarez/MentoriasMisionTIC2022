public abstract class Animal {

    private String nombre;
    private int edad;
    private char sexo;
    private String raza;

    public Animal(String nombre, int edad, char sexo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String comer(){
        return "Esta comiendo feliz";
    }

    public abstract String caminar();

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", raza='" + raza + '\'' +
                '}';
    }
}
