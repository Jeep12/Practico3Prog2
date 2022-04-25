package punto1;

import javax.swing.*;
import java.time.LocalDate;

public class Main {


    public static void main (String [] arg){
        LocalDate fechaNacimiento = LocalDate.of(1993, 10, 28);
        Persona persona = new Persona("Juan","Encabo",fechaNacimiento, 85,1.83);
        persona.setSexo("Masculino");
        persona.getDatosCompletos();
    }
}
