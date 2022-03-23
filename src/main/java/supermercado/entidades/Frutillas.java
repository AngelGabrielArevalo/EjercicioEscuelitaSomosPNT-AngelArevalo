package supermercado.entidades;

import java.text.DecimalFormat;

/*@author Angel Gabriel Arévalo*/
public class Frutillas extends Producto{
    private String unidadDeventa;   //unidad de venta de la frutilla, en kg

    public Frutillas() {
        super("Frutillas", 64);
        unidadDeventa="kilo";
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#.##"); //seteo dos decimales para el precio yelimino los ultimos ceros
        return "Nombre: "+nombre+" /// Precio: $"+df.format(precio)+" /// Unidad de venta: "+unidadDeventa;
    }
 
    public String getUnidadDeventa() {
        return unidadDeventa;
    }

    public void setUnidadDeventa(String unidadDeventa) {
        this.unidadDeventa = unidadDeventa;
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
