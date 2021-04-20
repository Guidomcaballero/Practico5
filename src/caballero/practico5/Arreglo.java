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
public class Arreglo {
    
    public static int SumarLista(int arreglo[]){
        int aux = 0;
        for(int item:arreglo){
            aux += item;
        }
        return aux;
    }
    public static int buscarMayor(int bidimensional[][]){
        int aux=0;
        for (int i=0;i<bidimensional.length;i++){
            for (int j=0;j<bidimensional[i].length;j++){
                if(aux<bidimensional[i][j])
                    aux=bidimensional[i][j];
            }
        }
        return aux;
    }
    public static int cuentaVocales(String palabra){
        int cont = 0;
        char vocales[]={'a','e','i','o','u','A','E','I','O','U'};
        char palabraII[] = palabra.toCharArray();
        for(int i=0;i<palabra.length();i++){
            for(int j=0;j<10;j++){
                if(palabraII[i]==vocales[j]){
                    cont+=1;
                }
            }
        }
        return cont;    
    }
    public static int cuentaCaracter(String palabra,char caracter){
        int cont = 0;
        char palabraII[] = palabra.toCharArray();
        for(int i=0;i<palabra.length();i++){
                if(palabraII[i]==caracter){
                    cont+=1;
                }
        }
        return cont;    
    }
    }

