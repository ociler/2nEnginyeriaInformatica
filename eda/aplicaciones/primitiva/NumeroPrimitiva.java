package aplicaciones.primitiva;

import java.util.Random;

/** NumeroPrimitiva: representa un numero entero
 *  entre el 1 y el 49, elegido aleatoriamente.
 *
 *  @version Febrero 2019
 */

public class NumeroPrimitiva implements Comparable <NumeroPrimitiva>/* COMPLETAR */ {
    
    // Un NumeroPrimitiva TIENE UN int en el intervalo [1, 49]
    private int numero;
    
    /**
     * Crea un NumeroPrimitiva eligiendo aleatoriamente  
     * un numero del intervalo entero [1, 49].
     */
    public NumeroPrimitiva() {
        Random r = new Random();
        numero = r.nextInt(49) + 1;
    }
    
    //Una prova meua
    public void setNum(int num){
        this.numero = num;
    }
    
    /**
     * Comprueba si un (this) NumeroPrimitiva es igual a otro, 
     * i.e. si ambos tienen el mismo valor
     * 
     * @param otro el otro NumeroPrimitiva.
     * @return true si this y otro tienen el mismo valor 
     *              y false en caso contrario
     */
    
    /* COMPLETAR EL METODO equals */
    public boolean equals(Object otro){
        return otro instanceof NumeroPrimitiva &&
            this.numero == ((NumeroPrimitiva) otro).numero;
    }
    
    
    /**
     * Compara un (this) NumeroPrimitiva con otro.
     * 
     * @param otro el NumeroPrimitiva a comparar con this.
     * @return int < 0 si this es menor que otro, 
     *         int > 0 si this es mayor que otro
     *          0      si this y otro son iguales
     */
    
    /* COMPLETAR EL METODO compareTo */
    public int compareTo(NumeroPrimitiva otro){
        if(this.numero < otro.numero){return -1;}
        else if(this.numero > otro.numero){return 1;}
        else{return 0;}
    }
    
    
    /**
     * Devuelve el String que representa un (this) NumeroPrimitiva 
     * en formato texto
     * 
     * @return el String con el NumeroPrimitiva en formato texto. 
     */
    public String toString() {
        return Integer.toString(numero);
    }
}
