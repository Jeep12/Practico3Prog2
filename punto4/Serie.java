package punto4;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private String autor;
    private String genero;
    private ArrayList <Temporada> temporadas;;

    public Serie (){
        this.titulo = " ";
        this.descripcion = " ";
        this.autor = " ";
        this.genero = " ";
    }
    public Serie (String titulo, String descripcion, String autor, String genero){
        temporadas = new ArrayList<Temporada>();
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
        this.genero = genero;
    }
    public void addTemporada (Temporada t){
        temporadas.add(t);
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
}
