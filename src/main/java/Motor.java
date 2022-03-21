package Autos;

import java.util.Arrays;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int registro) {
        this.registro = registro;
    }
    
    void asignarTipo(String tipo) {
        String[] validos = {"electrico", "gasolina"};
        if (Arrays.asList(validos).indexOf(tipo) != -1) {
            this.tipo = tipo;
        }
    }

    // public static void main(String[] args) {
    //     Motor a = new Motor();
    //     a.cambiarRegistro(123);
    // }
}
