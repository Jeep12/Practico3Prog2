package punto4;

public class  Capitulo {
    private String titulo;
    private String descripcion;
    private int calificacion = -1;
    private boolean seVio = false;


    public Capitulo() {
        this.titulo = " ";
        this.descripcion = " ";
    }

    public Capitulo(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.seVio = seVio;
    }
    // Ingresar la calificación de un episodio. Si el valor ingresado como calificación
    //no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.


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
        if (calificacion <= 5 && calificacion >= 1 ){
            this.calificacion = calificacion;
        }else {
            System.out.println("Error, se puede solamente del 1 al 5");
        }

    }

    public boolean getSeVio() {
        return seVio;
    }

    public void setSeVio(boolean seVio) {
        this.seVio = seVio;
    }

    @Override
    public String toString() {
        return "Datos del Episodio: " + "\n" +
                "Titulo: " + this.titulo + "\n" +
                "Descripción:  " + this.descripcion + "\n" +
                "Visto: " + " " + this.seVio + "\n" +
                "Calificación: " + " " + this.calificacion;
    }
}
