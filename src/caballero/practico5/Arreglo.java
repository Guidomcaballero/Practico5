/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballero.practico5;

/**
 *
 * @author Usuario
 */
public class Arreglo {
    
    public static int SumarLista(int arreglo[]){
        int aux = 0;
        for(int item:arreglo){
            aux += item;
        }
        return aux;
    }
    
    
}

