/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballero.practico5;

/**
 *
 * @author Guido Caballero
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={10,15,32,22,12};
        int bid[][]={{1,3,5},{2,4}};
        System.out.println("La suma de los elementos del arreglo {10,15,32,22,12} es: "+Arreglo.SumarLista(arr));
        System.out.println("Se utiliza un arreglo bidimensional de la siguiente forma {{1,3,5},{2,4}}, el numero mayor es: " + Arreglo.buscarMayor(bid));
        System.out.println("La frase ESTO ES UN STRING contiene T: " + Arreglo.cuentaCaracter("Esto es un string", 't')+" veces");
        System.out.println("La cantidad de vocales en la palabra HOLA es: "+ Arreglo.cuentaVocales("Hola"));
        
        
    }
    
}
