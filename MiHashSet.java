
/**
 * Esta clase de forma que funcione como un HashSet.
 * Que contenga elementos de tipo int. 
 *  
 * @author Marcelino José Granda Muñoz
 * @version 2015/03/01
 */
public class MiHashSet
{

    /**
     * Construye un nuevo conjunto vacío 
     */
    public MiHashSet()
    {

    }

    /**
     *  añade el elemento al conjunto si no estaba. 
     *  Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto 
     *  y falso en caso contrario.
     *  @param valor valor a añdir al conjunto
     *  @return true el elemnto no estava presente, false estava presente
     */
    public boolean add(int valor){

        return false;
    }

    /**
     *  vacía el conjunto.
     */
    public void clear(){

    }

    /**
     * devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     * @param elemento elemnto que se desea saber si esta contenido en el cojunto
     * @return retorna true si el conjunto contiene el elemento
     */
    public boolean contains(int elemento){

        return false;
    }

    /**
     * devuelve verdadero si el conjunto no contiene elementos.
     * @return true si el conjunto esta vacio, false en caso contrario
     */
    public boolean isEmpty(){

        return false;
    }

    /**
     * elimina del conjunto el elemento dado. 
     * Si no existiera devuelve falso; 
     * si existía en el conjunto devuelve verdadero.
     * @param elemento elemento que se desea borrar del conjunto
     * @return true el elemento especificado estava en el conjunto, en caso contrario false
     */
    public boolean remove(int elemento){

        return false;
    }

    /**
     *  devuelve el número de elementos del conjunto.
     *  @return numero de elementos en el conjunto
     */
    public int size(){
        return 0;
    }

    /**
     * devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y entre corchetes.
     * @returns cadena de caracteres con todos los elementos separados por comas
     */
    public String toString(){

        return "";
    }

    /**
     * devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca y falso en otro caso.
     * @param otroConjunto conjunto con el que se desea comparar 
     * @returns true si ambos conjuntos son iguales
     */
    public boolean equals(MiHashSet otroConjunto){

        return false;
    }
}
