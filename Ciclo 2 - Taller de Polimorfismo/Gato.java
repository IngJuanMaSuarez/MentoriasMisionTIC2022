public class Gato extends Animal implements IDormir {

    public boolean independiente;

    public Gato(String nombre, int edad, char sexo, String raza) {
        super(nombre, edad, sexo, raza);
    }

    public boolean isIndependiente() {
        return independiente;
    }

    public void setIndependiente(boolean independiente) {
        this.independiente = independiente;
    }

    public String caer(){
        return "El gato ha caido de pie";
    }

    @Override
    public String toString() {
        return "Gato{" +
                "independiente=" + independiente +
                '}';
    }

    @Override
    public String caminar() {
        return "Quiero descansar, hoy no voy a caminar";
    }

    @Override
    public String dormir() {
        return "El gato duerme muy muy muy placenteramente";
    }
}
