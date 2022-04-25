package punto2;

public class Main {
    public static void main (String [] args){
        Electrodomestico producto = new Electrodomestico("ROJO",100,230,30);
        System.out.println("Color: " + producto.getColor());
        System.out.println("Consumo: " + producto.getConsumoEnergetico());
        System.out.println("Precio: " + producto.getPrecioBase());
        System.out.println("Peso: " + producto.getPeso());
        System.out.println("Es bajo consumo: " + producto.esBajoConsumo());
        System.out.println("Balance: " + producto.calcularBalance());
        System.out.println("Es de alta gama "+ producto.esAltaGama());
    }
}
