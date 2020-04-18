package librerias.estructurasDeDatos.lineales;

public class LEGListaConPIOrdenada <E extends Comparable <E>> extends LEGListaConPI<E> {
    public void insertar(E e){
        this.inicio();
        //mentre PI no aplegue al final de la llista i l'element
        //que tinga el PI sigamenor que l'element a insertar avançarem
        while(!esFin() && recuperar().compareTo(e) < 0){
            siguiente();
        }
        super.insertar(e);
    }
}

