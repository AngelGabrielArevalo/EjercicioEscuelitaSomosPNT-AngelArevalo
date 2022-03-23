package supermercado.entidades;

import java.text.DecimalFormat;

/*@author Angel Gabriel Arévalo*/
public class CocaCola extends Producto{
    private double litros;  //litros de una cocacola

    public CocaCola() {
        super("Coca-Cola", 18);
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

    public void setLitros(double litros) {
        this.litros = litros;
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
