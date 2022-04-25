package punto4;

public class Capitulo {
    private String titulo;
    private String descripcion ;
    private boolean seVio;
    private int calificacion;


    public Capitulo (){
        this.titulo = " ";
        this.descripcion = " ";
        this.seVio = false;
        this.calificacion = 0;
    }
    public Capitulo (String titulo, String descripcion, boolean seVio, int calificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.seVio = seVio;
        this.calificacion = calificacion;
    }

}
