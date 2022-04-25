package punto4;

public class Capitulo {
    private String titulo;
    private String descripcion;
    private int calificacion;
    private boolean seVio;

    public Capitulo (){
        this.titulo = " ";
        this.descripcion = " ";
        this. calificacion = -1;
        this.seVio = false;
    }
    public Capitulo (String titulo,String descripcion,int calificacion,boolean seVio){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.seVio = seVio;
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

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public boolean isSeVio() {
        return seVio;
    }

    public void setSeVio(boolean seVio) {
        this.seVio = seVio;
    }
}
