public class Principal {
    public static void main(String[] args){

        /*INSTANCIAR UNA CLASE*/
        /*Objeto miPersonaje de tipo SuperPersonaje*/
        SuperPersonaje miPersonaje = new SuperPersonaje("JuanMa", "teletransportarse", 50000, false);
        System.out.println(miPersonaje.getNombre());
        System.out.println(miPersonaje.getPoder());
        System.out.println(miPersonaje.getValorComercial());

        miPersonaje.setValorComercial(-78);
        System.out.println(miPersonaje.getValorComercial());

        miPersonaje.setValorComercial(56);
        System.out.println(miPersonaje.getValorComercial());

        miPersonaje.correr();
    }
}