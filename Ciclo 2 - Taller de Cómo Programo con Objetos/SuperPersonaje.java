public class SuperPersonaje {

    /*ATRIBUTOS (CARACTERISTICAS O CUALIDADES)*/
    private String nombre, poder, equipo;
    private int edad, vidas;
    private double valorComercial, nivelDePoder;
    private boolean tieneAlas;
    private char genero;

    /*METODO CONSTRUCTOR*/
    /*INICIALIZA EL OBJETO*/
    public SuperPersonaje(String nombre, String poder, double valorComercial, boolean tieneAlas){
        this.nombre = nombre;
        this.poder = poder;
        this.valorComercial = valorComercial;
        this.tieneAlas = tieneAlas;
    }

    /*GETTER
    Los metodos Get, retornan el valor de las variables de atributo privadas
    Se usan como puente para acceder a los atributos de clase desde fuera de la clase*/
    public String getNombre(){
        return this.nombre;
    }

    public String getPoder(){
        return this.poder;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    /*SETTER, permite modificar los atributos de clase*/
    public void setValorComercial(double valorComercial){
        if (valorComercial > 0){
            this.valorComercial = valorComercial;
        }
    }

    /*METODOS (ACCIONES)*/
    void correr(){
        System.out.println("El jugador esta corriendo");
    }

    void atacar(){
    }

    void saltar(){
    }

    void defender(){
    }

    void volar(){
    }

    void jugar(){
    }
}