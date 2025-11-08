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
        System.out.println("Los datos de la cuenta correspondiente son: Cuenta de tipo: " + tipoCuenta
                + " con un saldo de " + saldo + " dolares la cedula del dueño es " + cedula);
    }
}

class CuentaAhorros extends CuentaBancaria {

    CuentaAhorros(String tipoCuenta, int cedula, int saldo) {
        super(tipoCuenta, cedula, saldo);
    }

    @Override
    void Mensaje() {
        System.out.println("El dinero presente en la cuenta de ahorros es " + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria("Juridica", 3415267, 550);
        CuentaAhorros cuentaAhorros = new CuentaAhorros("null", 0, 5000);
        cuentaBancaria.Mensaje();
        cuentaAhorros.Mensaje();
    }
}
