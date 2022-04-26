package punto4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //creo serie temporadas y capitulos
        Serie bb = new Serie("Breaking Bad", "Sobre drogas", "Nose el autor", "Drama");
        Temporada t1 = new Temporada(1);
        Temporada t2 = new Temporada(2);
        Capitulo t1c1 = new Capitulo("el principio", "trata sobre el comienso de la serie");
        Capitulo t1c2 = new Capitulo("Segundo capitulo", "Se mueren todos");
        Capitulo t2c1 = new Capitulo("Tercer capitulo", "Se reviven todos");
        Capitulo t2c2 = new Capitulo("Cuarto capitulo", "Se vuelven a morir todos");
        Capitulo t2c3 = new Capitulo("quinto capitulo", "FIN");

        //Agrego temporadas a la serie
        bb.addTemporada(t1);
        bb.addTemporada(t2);
        //Agrego capitulos a la temporada
        t1.addCapitulo(t1c1);
        t1.addCapitulo(t1c2);
        t2.addCapitulo(t2c1);
        t2.addCapitulo(t2c2);
        t2.addCapitulo(t2c3);


        //seteo si se vieron los capitulos
        t1c1.setSeVio(true);
        t1c1.setCalificacion(3);

        t2c1.setSeVio(true);
        t2c1.setCalificacion(5);

        t2c2.setSeVio(true);
        t2c2.setCalificacion(5);

        System.out.println("Promedio de temporada 1 " + t1.getPromedioClasif());
        System.out.println("Promedio de temporada 2 " + t2.getPromedioClasif());
        bb.getClasifSerie();
        //System.out.println("Promedio total de la serie: " + bb.getClasifSerie());



        // Declaro otro array de temporadas y capitulos
        //ArrayList <Temporada> temporadas = bb.getTemporadas();
        //ArrayList<Capitulo> capitulos = t1.getCapitulos();
        //Traigo temporada 1
        // System.out.println(temporadas.get(1));
        //Traigo el capitulo 1
        //System.out.println(capitulos.get(1));

    }
}
