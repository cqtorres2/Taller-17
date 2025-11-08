package Transporte;

public class Transporte {
    void moverse() {
        System.out.println("El transporte esta en movimiento");
    }
}

class Coche extends Transporte {
    @Override
    void moverse() {
        System.out.println("El coche esta en movimiento");
    }
}

class Bicicleta extends Transporte {
    @Override
    void moverse() {
        System.out.println("La bicicleta esta en movimiento");
    }

    public static void main(String[] args) {
        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();
        Transporte transporte = new Transporte();

        coche.moverse();
        bicicleta.moverse();
        transporte.moverse();
    }
}