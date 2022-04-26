package punto4;

import java.util.ArrayList;

public class Temporada {
    private ArrayList <Capitulo> capitulos;
    private int numeroTemporada;
    private int capitulosVistos = 0;
    private double promedioTemporada = 0;

    public Temporada (){
        this.numeroTemporada = -1;
    }
    public Temporada(int numeroTemporada) {
        this.capitulos = new ArrayList<Capitulo>();
        this.numeroTemporada = numeroTemporada;
    }
    public void addCapitulo (Capitulo c){
        capitulos.add(c);
    }
    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }
    public int getCapitulosVistos (){
        for (Capitulo capitulo: capitulos){
            if (capitulo.getSeVio()){
                this.capitulosVistos ++;

            }
        }
        return this.capitulosVistos;
    }
    public double getPromedioClasif(){
        double promedio = 0,sumaTotal = 0;
        for (Capitulo capitulo: capitulos ){
            if (capitulo.getSeVio()){
                sumaTotal = sumaTotal + capitulo.getCalificacion();
            }
        }
        promedio = sumaTotal/this.getCapitulosVistos();
        return promedio;

    }
    public String toString (){
        return "Numero de temporada: " + this.numeroTemporada + " Capitulos vistos: " +this.getCapitulosVistos() + " Promedio: "+ this.getPromedioClasif();
    }



}
