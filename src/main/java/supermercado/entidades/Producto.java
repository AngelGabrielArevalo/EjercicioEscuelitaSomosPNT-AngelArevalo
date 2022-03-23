package supermercado.entidades;

/*@author Angel Gabriel Arévalo*/
/* Esta clase producto sera una superclase de la cual heredaran las clases 
correspondientes a los productos de nuestro supermercado. La misma implementa
la interfaz Comparable que se utilizará luego para calular el producto más 
barato y más caro*/

public class Producto implements Comparable<Producto>{
    protected String nombre;    //nombre del producto
    protected double precio;    //precio del producto

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }     

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    /**
     * Sobreescribamos el metodo compareTo para comparas el precio entre dos 
     * productos.
     * @param o obtejo perteneciente a la clase Producto con el cual compararemos
     * el precio.
     * @return retornamos 1 si el precio es menor, 0 si son iguales y 1 si es mayor.
     */
    @Override
    public int compareTo(Producto o) {
        if(this.precio<o.precio){
            return -1;
        }else if(this.precio==o.precio){
            return 0;
        }else{
            return 1;
        }
    }
}

    
    

