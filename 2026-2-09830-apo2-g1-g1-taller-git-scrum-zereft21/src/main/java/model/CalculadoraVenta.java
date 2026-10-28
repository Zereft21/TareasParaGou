package model;

public class CalculadoraVenta {

    private double subtotal = 0.0;
    private int cantidadProductos = 0;


    public void agregarProducto(double precio) {
        this.subtotal += precio;
        this.cantidadProductos++;
        System.out.println("Producto agregado. Subtotal actual: $" + this.subtotal);
    }

    public double calcularTotalFinal() {
        return this.subtotal;
    }

}
