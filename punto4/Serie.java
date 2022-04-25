package punto4;

public class Serie {

    //una descripción, un creador y un género.
    private String nombreSerie;
    private String descripcion;
    private String autor;
    private String genero;
    private int cantidadTemporadas;
    private Temporada[] temporadas;

    public Serie() {
        this.nombreSerie = " ";
        this.descripcion = " ";
        this.autor = " ";
        this.genero = " ";
        this.cantidadTemporadas = 0;
        this.temporadas = new Temporada[cantidadTemporadas];
        for (int i = 0; i < cantidadTemporadas; i++) {
            temporadas[i] = new Temporada();
        }
    }

    public Serie(String nombreSerie, String descripcion, String autor, String genero,int cantidadTemporadas) {
        this.nombreSerie = nombreSerie;
        this.descripcion = descripcion;
        this.autor = autor;
        this.genero = genero;
        this.cantidadTemporadas = cantidadTemporadas;

        this.temporadas = new Temporada[cantidadTemporadas];
        for (int i = 0; i < cantidadTemporadas; i++) {
            temporadas[i] = new Temporada("temporada" +i,5);
        }
    }

    public String getNombreSerie() {
        return nombreSerie;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidadTemporadas() {
        return cantidadTemporadas;
    }

    public void setCantidadTemporadas(int cantidadTemporadas) {
        this.cantidadTemporadas = cantidadTemporadas;
    }

    public Temporada[] getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Temporada[] temporadas) {
        this.temporadas = temporadas;
    }
    public Temporada getTemporada (int temporada){
        return this.temporadas[temporada];
    }
}
