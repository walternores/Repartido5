package Ejercicio8;

import Ejercicio7.Cuenta;

public class Empleado {


    public static void main(String[] args) {

        Empleado empleado = new Empleado("Walter Nores", "Jefe", 5000.0);
        System.out.println(empleado.toString());
    }


    private String nombre;
    private String cargo;
    private double sueldo_base;

    public Empleado(String nombre, String cargo, double sueldo_base) {
        if(sueldo_base<0){
            System.out.println("El sueldo base no es válido. Verifique");
        }else {
            if (cargo.equals("Jefe")) {
                getSueldoFinal(sueldo_base);
            } else {
                this.sueldo_base = sueldo_base;
            }
            this.nombre = nombre;
            this.cargo = cargo;
        }
    }

    public void getSueldoFinal(double sueldo_base){
        this.sueldo_base = sueldo_base + (sueldo_base * 0.2);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", sueldo_base=" + sueldo_base +
                '}';
    }
}
