package Autos;

import java.util.Arrays;

public class Asiento {
    String color;
    int precio;
    int registro;
    
    void cambiarColor(String color){
        String[] validos = {"rojo", "verde", "amarillo", "negro", "blanco"};
        if (Arrays.asList(validos).indexOf(color) != -1) {
            this.color = color;
        }
    }
}
