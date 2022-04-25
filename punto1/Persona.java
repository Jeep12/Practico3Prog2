package punto1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);

    private int dni;
    private String sexo = "Femenino";
    private String nombre = "N", apellido = "N";
    private double peso = 1.0, altura = 1.0;

    public Persona(int dni) {
        this.dni = dni;
    }

    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.altura = altura;
    }

    public double getMasaCorporal() {
        return (this.peso / (Math.pow(this.altura, 2)));
    }

    public boolean getEstaEnForma() {
        if (getMasaCorporal() > 25) {
            return true;
        } else {
            return false;
        }
    }

    public LocalDate fechaNacimiento() {
        return this.fechaNacimiento;
    }

    public boolean getCumpleAños() {
        if (fechaNacimiento.equals(LocalDate.now())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getEsMayor() {
        if (this.getEdad() > 18) {
            return true;
        } else {
            return false;
        }
    }

    public int getEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period period = Period.between(fechaNacimiento, fechaActual);
        return period.getYears();
    }

    public boolean getPuedeVotar() {
        if (this.getEdad() > 16) {
            return true;
        } else {
            return false;
        }
    }

    public void getDatosCompletos() {
        System.out.println("Nombre: " + this.nombre + " Apellido: " + this.apellido);
        System.out.println("DNI:" + this.dni);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento() + " Edad: " + getEdad());
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Altura: " + this.altura + " Peso: " + this.peso);
        System.out.println("Masa corporal: " + getMasaCorporal());
        if (getPuedeVotar()) {
            System.out.println("Usted puede votar");
        }
        if (getEstaEnForma()) {
            System.out.println("Esta en forma");
        }
        if (getCumpleAños()) {
            System.out.println("Usted esta cumpliendo años");
        }
        if (getEsMayor()) {
            System.out.println("Es mayor de edad");
        }
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
