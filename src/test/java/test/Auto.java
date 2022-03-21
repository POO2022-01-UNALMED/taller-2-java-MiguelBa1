package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    
    int cantidadAsientos(){
        int cant = 0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null){
                cant++;
            }
        }
        return cant;
    }
    String verificarIntegridad() {
        boolean valido = true;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null){
                if (asientos[i].registro != this.registro){
                    valido = false;
                }
            }
        }
        if (this.motor.registro != this.registro) {
            valido = false;
        }
        if (valido) {
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }
}
