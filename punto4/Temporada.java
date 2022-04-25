package punto4;

import java.util.ArrayList;

public class Temporada {
    private ArrayList <Capitulo> capitulos;
    private int numeroTemporada;

    public Temporada (){
        this.numeroTemporada = -1;
        this.capitulos = new ArrayList<Capitulo>();
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
}
