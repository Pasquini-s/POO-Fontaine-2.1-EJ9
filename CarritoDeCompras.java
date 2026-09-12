import java.util.ArrayList;

public class CarritoDeCompras {

    private ArrayList<Producto> productos;

    public CarritoDeCompras(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        if (producto != null){
            this.productos.add(producto);
            System.out.println("Producto ' " + producto.getNombre() + " ' agregado al carrito");
        }else{
            System.out.println("No se puede agregar un producto nulo");
        }
    }

    public double calcularTotal(){
        double total = 0.0;
        for (Producto producto : this.productos){
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarDetalle(){
        System.out.println("\n--------------------------------------");
        System.out.println("         RESUMEN DE COMPRA              ");
        System.out.println("----------------------------------------");

        if (this.productos.isEmpty()) {
            System.out.println("El carrito de compras está vacío.");
        } else {
            for (int i = 0; i < this.productos.size(); i++) {
                Producto p = this.productos.get(i);
                System.out.printf("%d. %-25s $%.2f\n", (i + 1), p.getNombre(), p.getPrecio());
            }
            System.out.println("----------------------------------------");
            System.out.printf("TOTAL A ABONAR:                 $%.2f\n", calcularTotal());
        }

        System.out.println("-----------------------------------------\n");
    }


}
