package Figura;

public class Figura {
    int Base;
    int Altura;
    int Area;

    void calcular() {};

    Figura(int Altura, int Base) {
        this.Altura = Altura;
        this.Base = Base;
        this.Area = Altura * Base;
    }
}

class Circulo extends Figura {
    Circulo(int Altura, int Base) {
        super(Altura, Base);
    }

    @Override
    void calcular() {
        System.out.println("El area del ciruclo es: " + Area);
    }
    // PI * Radio^2
}

class Rectangulo extends Figura {
    Rectangulo(int Altura, int Base) {
        super(Altura, Base);
    }

    // Base * Altura = Area//
    @Override
    void calcular() {
        System.out.println("El area de la figura es: " + Area);
    }
}

class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(15, 5);
        rectangulo.calcular();

    }

}