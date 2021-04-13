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
    public static int buscarMayor(int bidimensional[][]){
        int aux = 0;
        for (int i=0;i<bidimensional.length;i++){
            for (int j=0;j<bidimensional[i].length;i++){
                if(aux<bidimensional[i][j])
                    aux = bidimensional[i][j];
            }
        }
        return aux;
    }
    public static int cuentaVocales(String palabra){
        
        return 0;
    }
}

