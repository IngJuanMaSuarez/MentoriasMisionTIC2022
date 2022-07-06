import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Guerrero miGuerrero = new Guerrero("JuanMa", 'M', 50, 40, 60, 80);
        NPJ miNPJ = new NPJ("Carolina", 'F', 70, 30, 80, "Medica");

        miGuerrero.asignarMision(new Date(), "Salvar al reino");
        System.out.println(miGuerrero.verMisiones());

        Mago miMago = new Mago("Teresa", 'F', 70, 40, 90, 100);
        //Humano miHumano = new Humano("", 'F', 1, 1, 1);

    }

}
