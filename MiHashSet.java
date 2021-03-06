
/**
 * Esta clase de forma que funcione como un HashSet.
 * Que contenga elementos de tipo int. 
 *  
 * @author Marcelino José Granda Muñoz
 * @version 2015/03/01
 */
public class MiHashSet
{
    private int[] collection;
    /**
     * Construye un nuevo conjunto vacío 
     */
    public MiHashSet()
    {
        collection = new int[0];
    }

    /**
     *  añade el elemento al conjunto si no estaba. 
     *  Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto 
     *  y falso en caso contrario.
     *  @param valor valor a añdir al conjunto
     *  @return true el elemnto no estava presente, false estava presente
     */
    public boolean add(int valor){
        //false si esta contenido en la coleccion true si no lo esta
        boolean noContains = true;

        //nueva coleccion en caso de agregar un nuevo elemento
        int[] newCollection = new int[collection.length+1];

        for(int i = 0; i < collection.length && noContains; i++){
            if(collection[i] == valor){
                noContains = false;
            }
            else{
                newCollection[i] = collection[i];
            }
        }

        if(noContains){
            newCollection[newCollection.length-1] = valor;
            collection = newCollection;
        }

        return noContains;
    }

    /**
     *  vacía el conjunto.
     */
    public void clear(){
        collection = new int[0];
    }

    /**
     * devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     * @param elemento elemnto que se desea saber si esta contenido en el cojunto
     * @return retorna true si el conjunto contiene el elemento
     */
    public boolean contains(int elemento){
        //true si esta contenido en la coleccion false si no lo esta
        boolean contains = false;

        for(int i = 0; i < collection.length && !contains; i++){
            if(collection[i] == elemento){
                contains = true;
            }
        }

        return contains;
    }

    /**
     * devuelve verdadero si el conjunto no contiene elementos.
     * @return true si el conjunto esta vacio, false en caso contrario
     */
    public boolean isEmpty(){
        return collection.length==0;

    }

    /**
     * elimina del conjunto el elemento dado. 
     * Si no existiera devuelve falso; 
     * si existía en el conjunto devuelve verdadero.
     * @param elemento elemento que se desea borrar del conjunto
     * @return true el elemento especificado estava en el conjunto, en caso contrario false
     */
    public boolean remove(int elemento){
        boolean delete = false;
        //si el mapa esta vacio directamente no se realiza ninguna accion y se devuelve -1
        if(collection.length != 0)
        {
            //nuevo conjunto
            int[] newCollection  = new int[collection.length - 1];

            
            //busqueda del registro el elemnto
            for(int index = 0; index < collection.length ; index++ )
            {
                //si el elemnto coincide realiza borrado
                if (collection[index] == elemento){
                    //marcar como borrado no se guardara en la nuevo conjunto
                    delete = true;
                }

                //no encontrado elemento especificada
                else if(!delete){
                    //-si el ultimo elemento si no es el ultimo elemento no se relaizan modificaciones
                    //-en el restro de casos se guarda el nuevo conjunto
                    if(index != collection.length - 1 ){
                        newCollection[index]   = collection[index];

                    }
                }

                //guardado de elementos depues del borrado 
                else{
                    newCollection[index - 1]   = collection[index];

                }
            }

            //guardado del nuevo conjunto si se a relizado borrado
            if(delete){ 
                collection   = newCollection;
            }
            
        }
        return delete;
    }

    /**
     *  devuelve el número de elementos del conjunto.
     *  @return numero de elementos en el conjunto
     */
    public int size(){
        return collection.length;
    }

    /**
     * devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y entre corchetes.
     * @returns cadena de caracteres con todos los elementos separados por comas si
     */
    public String toString(){
        String toString = "[";
        for(int i = 0; i < collection.length ; i++){
            if(i == 0){
                toString = toString  + collection[i];

            }
            else{ 
                toString = toString + "," + collection[i];	
            }
        }
        toString = toString + "]";
        return toString;
    }

    /**
     * devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca y falso en otro caso.
     * @param otroConjunto conjunto con el que se desea comparar 
     * @returns true si ambos conjuntos son iguales
     */
    public boolean equals(MiHashSet otroConjunto){
        boolean equals = true;
        if(otroConjunto.size() == size())
        {
            for(int i = 0;i < collection.length && equals ; i++){
                if(!otroConjunto.contains(collection[i])){
                    equals = false;
                }
            }
        }

        return equals;
    }
}
