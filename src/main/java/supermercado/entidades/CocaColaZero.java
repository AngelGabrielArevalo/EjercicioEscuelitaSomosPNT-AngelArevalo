package supermercado.entidades;

import java.text.DecimalFormat;

/*@author Angel Gabriel Arévalo*/
public class CocaColaZero extends Producto {
    private double litros;  //litros que posee la cocacola zero
    
    public CocaColaZero() {
        super("Coca-Cola Zero", 20);
        litros=1.5;
    }
    
    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#.##"); //seteo dos decimales para el precio yelimino los ultimos ceros
        return "Nombre: "+nombre+" /// Litros: "+litros+" /// Precio: $"+df.format(precio);
    }

    public double getLitros() {
        return litros;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    } 
    
}
