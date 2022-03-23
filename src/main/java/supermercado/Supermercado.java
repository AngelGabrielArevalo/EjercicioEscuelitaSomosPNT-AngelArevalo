package supermercado;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.ArrayList;
import java.util.Collections;
import supermercado.entidades.CocaCola;
import supermercado.entidades.CocaColaZero;
import supermercado.entidades.Frutillas;
import supermercado.entidades.Producto;
import supermercado.entidades.ShampooSedal;

public class Supermercado{
    public static void main(String[] args) {
        ArrayList<Producto> listaDeProductos=new ArrayList<>();
        listaDeProductos(listaDeProductos);
        mostrarProductos(listaDeProductos);
        mostrarProductosMasCaroyMasBarato(listaDeProductos);
        //ordenarYMostrar(listaDeProductos); //solución alternativa

    }
    
    /**
     * Con este método agregaremos productos a nuestra lista, pertenece a la clase 
     * ArrayList, pero podríamos haber instanciado con la clase Set para evitar
     * productos repetidos, pero el enunciado dice que se debe usar una lista
     * @param listaProductos esta es la lista de productos del supermercado
     */
    public static void listaDeProductos(ArrayList<Producto> listaProductos){
        listaProductos.add(new CocaColaZero());
        listaProductos.add(new CocaCola());
        listaProductos.add(new ShampooSedal());
        listaProductos.add(new Frutillas());
    }
    
    /**
     * Se muestra la lista de productos. Se utiliza un for each y se imprime 
     * mediate el método toString.
     * @param lista se le pasa por parámetro la lista de productos
     */
    public static void mostrarProductos(ArrayList<Producto> lista){
        lista.forEach(x->System.out.println(x.toString()));
        System.out.println("=============================");
    }
    
    /**
     * Buscamos el producto con el menor precio, para ello utilizamos el método
     * compareTo que sobreescribimos el la clase Producto.
     * @param lista se le pasa por parámetro la lista de productos
     * @return retornamos el producto con el menor precio
     */
    public static Producto productoMasBarato(ArrayList<Producto> lista){
        Producto masBarato=lista.get(0);    //para iniciar decimos que el producto más barato es el primero de la lista
        for(int i=1;i<lista.size();i++){
            if((lista.get(i).compareTo(masBarato))<0){  //si el siguiente producto en la lista es menor al que establecimos anteriormente como menor, lo sobreescribimos
                masBarato=lista.get(i);
            }
        }
        return masBarato;
    }

    /**
     * Buscamos el producto con el mayor precio, para ello utilizamos el método
     * compareTo que sobreescribimos el la clase Producto.
     * @param lista se le pasa por parámetro la lista de productos
     * @return retornamos el producto con el mayor precio
     */
    public static Producto productoMasCaro(ArrayList<Producto> lista){
        Producto masCaro=lista.get(0);  //para iniciar decimos que el producto más caro es el primero de la lista
        for(int i=1;i<lista.size();i++){
            if((lista.get(i).compareTo(masCaro))>0){    //si el siguiente producto en la lista es mayor al que establecimos anteriormente como menor, lo sobreescribimos
                masCaro=lista.get(i);
            }
        }
        return masCaro;
    }
  
    /**
     * Imprimimos por pantalla los productos con menor y mayor precio, se pudo
     * haber hecho directamente desde los dos métodos anteriores, pero de hacerlo 
     * así tendríamos un problema si tuvieramos más de un producto con el menor 
     * precio. Para evitar esto tomamos el producto con mayor y menor precio 
     * utilizando los dos metodos anteriores, y comparamos si hay otro producto 
     * con dicho precio en la lista, de ser así se guadará en un ArrayList para luego 
     * imprimirlos por pantalla.
     * @param lista se le pasa por parámetro la lista de productos
     */
    public static void mostrarProductosMasCaroyMasBarato(ArrayList<Producto> lista){
        ArrayList<Producto> masCaros=new ArrayList();   //lista de productos(si hubiese más de uno) con el mayor precio 
        Producto masCaro=productoMasCaro(lista);
        ArrayList<Producto> masBaratos=new ArrayList(); //lista de productos(si hubiese más de uno) con el menor precio
        Producto masBarato=productoMasBarato(lista);
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).compareTo(masCaro)==0){
                masCaros.add(lista.get(i));
            }
            if(lista.get(i).compareTo(masBarato)==0){
                masBaratos.add(lista.get(i));
            }
        }
        System.out.print("Producto más caro: ");
        for (int i = 0; i < masCaros.size(); i++) {
            if(i==(masCaros.size()-1)){
                System.out.print(masCaros.get(i).getNombre());
            }else{
                System.out.print(masCaros.get(i).getNombre()+", ");
            }  
        }
        System.out.println("");
        System.out.print("Producto más barato: ");
        for (int i = 0; i < masBaratos.size(); i++) {
            if(i==(masBaratos.size()-1)){
                System.out.print(masBaratos.get(i).getNombre());
            }else{
                System.out.print(masBaratos.get(i).getNombre()+", ");
            }  
        }  
    }

    /**
     * Esta es otra forma de resolver el problema utilizando ordenamiento.
     * Mediante la clase Collections y utilizando el método sort, ordenamos la 
     * lista de menor a mayor por precio(esto es debido a que este método utiliza 
     * la clase Comparable que sobreescribimos previamente). Luego tomamos el 
     * primero y último producto y lo mostramos. Además buscamos si hay más de 
     * un producto con el menor precio. 
     * @param lista se le pasa por parámetro la lista de productos
     */
    public static void ordenarYMostrar(ArrayList<Producto> lista){
        Collections.sort(lista);
        System.out.print("Producto más caro: "+lista.get((lista.size()-1)).getNombre());
        for (int i = lista.size()-2; i >= 0; i--) {
            if((lista.get(i).compareTo(lista.get(lista.size()-1)))==0){
                System.out.print(", "+lista.get(i).getNombre());
            }else{
                break;
            }
        }
        System.out.println("");
        System.out.print("Producto más barato: "+lista.get(0).getNombre());
        for (int i = 1; i < lista.size(); i++) {
            if((lista.get(i).compareTo(lista.get(0)))==0){
                System.out.print(", "+lista.get(i).getNombre());
            }else{
                break;
            }
        }
    }

}
