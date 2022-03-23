package supermercado.entidades;

import java.text.DecimalFormat;

/*@author Angel Gabriel Arévalo*/
public class ShampooSedal extends Producto{
    private int contenido;  //contenido de un shampoo en ml

    public ShampooSedal() {
        super("Shampoo Sedal", 19);
        contenido=500;
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#.##"); //seteo dos decimales para el precio yelimino los ultimos ceros
        return "Nombre: "+nombre+" /// Contenido: "+contenido+"ml /// Precio: $"+df.format(precio);
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
