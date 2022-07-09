public class Canario extends Animal implements IDormir {

    public Canario(String nombre, int edad, char sexo, String raza) {
        super(nombre, edad, sexo, raza);
    }

    @Override
    public String caminar() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }
}
