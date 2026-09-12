import java.util.ArrayList;

class Producto{
    String nombre;
    Double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }else{
            System.out.println("El producto no deber ser vacío");
        }
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        if (precio >= 0.0){
            this.precio = precio;
        }else{
            System.out.println("El precio no puede ser negativo");
        }
    }

}



