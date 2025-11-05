package CuentaBancaria;

public class CuentaBancaria {
    int saldo;
    int cedula;
    String tipoCuenta;

    CuentaBancaria(String tipoCuenta, int cedula, int saldo) {
        this.tipoCuenta = tipoCuenta;
        this.cedula = cedula;
        this.saldo = saldo;
    }

    void Mensaje() {
        System.out.println("Los datos de la cuenta son:");
    }
}

class CuentaAhorros extends CuentaBancaria {

    CuentaAhorros(String tipoCuenta, int cedula, int saldo) {
        super(tipoCuenta, cedula, saldo);
    }

    @Override
    void Mensaje() {
        System.out.println("Los datos de la cuenta correspondiente son: Cuenta de tipo: " + tipoCuenta
                + " con un saldo de " + saldo + " dolares la cedula del dueño es " + cedula);
    }

    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros("Juridica", 3415267, 550);
        cuentaAhorros.Mensaje();
    }
}
