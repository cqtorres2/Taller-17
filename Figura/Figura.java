package Figura;

public class Figura {
    int Base;
    int Altura;
    int Area;

    void calcular() {
        System.out.println("El area de la figura es " + Area);
    };

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
}

class Rectangulo extends Figura {
    Rectangulo(int Altura, int Base) {
        super(Altura, Base);
    }
    @Override
    void calcular() {
        System.out.println("El area del rectangulo es: " + Area);
    }
}

class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(15, 5);
        Circulo circulo = new Circulo(23, 5);
        Figura figura = new Figura(56, 43);
        figura.calcular();
        circulo.calcular();
        rectangulo.calcular();
    }

}