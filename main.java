public static void main(String[] args) {

    Producto p1 = new Producto("Teclado Mecánico", 4500.50);
    Producto p2 = new Producto("Mouse Inalámbrico", 2300.00);
    Producto p3 = new Producto("Monitor 24''", 18500.75);

    CarritoDeCompras carrito = new CarritoDeCompras();

    carrito.agregarProducto(p1);
    carrito.agregarProducto(p2);
    carrito.agregarProducto(p3);

    carrito.mostrarDetalle();
}
