package punto2;

public class Electrodomestico {
    private String color;
    private double consumoEnergetico;
    private double precioBase;
    private double peso;

    public  Electrodomestico(){
        this.color = "Gris Plata";
        this.consumoEnergetico = 10;
        this.precioBase = 100;
        this.peso = 2;
    }
    public Electrodomestico(String color){}
    public Electrodomestico(String color, double consumoEnergetico){}
    public Electrodomestico(String color, double consumoEnergetico,double precioBase){}
    public Electrodomestico(String color, double consumoEnergetico,double precioBase,double peso){
        this(color);

        this.color= color;
        this.consumoEnergetico = consumoEnergetico;
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(double consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public boolean esBajoConsumo(){
        return this.consumoEnergetico < 45;
    }
    public double calcularBalance (){
        double resultado = 0.0;
        resultado = this.precioBase/this.peso;
        return resultado;
    }
    public boolean esAltaGama (){
        return this.calcularBalance() >3;
    }

}
