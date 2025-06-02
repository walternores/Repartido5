package Ejercicio7;

public class Cuenta {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(123456789L, "Walter Nores");
        System.out.println(cuenta.toString());
        cuenta.depositar(150.0);
        System.out.println(cuenta.toString());
        cuenta.retirar(50.0);
        System.out.println(cuenta.toString());
        cuenta.retirar(101.0);

    }


    private Long numero;
    private String titular;
    private double saldo;


    public Cuenta(Long numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    public void depositar(double monto) {
        this.saldo = this.saldo + monto;
    }
    public void retirar(double monto) {
        if(this.saldo >= monto){
            this.saldo = this.saldo - monto;
        }else{
            System.out.println("No fué posible retirar. Saldo insuficiente");
        }
    }

    public Long getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
