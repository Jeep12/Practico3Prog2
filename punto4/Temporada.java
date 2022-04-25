package punto4;

public class Temporada  {
    private String nombreTemporada;
    private int cantidadCapitulos;
    private Capitulo [] capitulos;

    public Temporada (){
        this.nombreTemporada = " ";
        this.cantidadCapitulos = 0;
    }
    public Temporada (String nombreTemporada){
        this.nombreTemporada = nombreTemporada;
    }
    public Temporada (String nombreTemporada, int cantidadCapitulos){
        this.nombreTemporada = nombreTemporada;
        this.cantidadCapitulos = cantidadCapitulos;
        this.capitulos = new Capitulo[cantidadCapitulos];
        for (int i = 0; i < cantidadCapitulos; i++) {
            capitulos[i] = new Capitulo("La noche oscura","muerte del protagonista", false, 5);
        }

    }
    public int getCantidadCapitulos() {
        return cantidadCapitulos;
    }

    public void setCantidadCapitulos(int cantidadCapitulos) {
        this.cantidadCapitulos = cantidadCapitulos;
    }

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }

    public String getNombreTemporada() {
        return nombreTemporada;
    }

    public void setNombreTemporada(String nombreTemporada) {
        this.nombreTemporada = nombreTemporada;
    }
    public String getDatosCompletos (){
        return this.nombreTemporada + " CAPITULOO";
    }
    public Capitulo getCapitulo (int capitulo){
        return this.capitulos[capitulo];
    }


}
