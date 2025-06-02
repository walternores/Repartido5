package Ejercicio9;

import Ejercicio8.Empleado;

public class Producto {



    public static void main(String[] args) {

        Producto producto = new Producto(123456,"Camisa hombre", 10, 500.0);
        System.out.println(producto.toString());
        producto.setPrecio(600);
        System.out.println(producto.toString());
        producto.reponer(5);
        System.out.println(producto.toString());
        producto.vender(2);
        System.out.println(producto.toString());
        producto.vender(14);

    }


    private Integer codigo;
    private String nombre;
    private int stock;
    private double precio;

    public Producto(Integer codigo, String nombre, int stock, double precio) {
        if(stock>=0 && precio>0) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.stock = stock;
            this.precio = precio;
        }else{
            System.out.println("El valor de precio y/o stock no es valido. Verifique");
        }
    }

    public void vender(int cantidad){
        if(this.stock >= cantidad){
            this.stock = this.stock - cantidad;
        }else{
            System.out.println("No fué posible realizar la venta. Stock insuficiente");
        }
    }
    public void reponer(int cantidad){
        this.stock = this.stock + cantidad;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double nuevoPrecio){
        this.precio = nuevoPrecio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                '}';
    }
}
