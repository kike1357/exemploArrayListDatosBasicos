package exemploarraylistdatosbasicos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author epastorizalorenzo
 */
public class Numeros {
    ArrayList<Integer>listaNumeros = new ArrayList();
    public void engadirElementos(){
        listaNumeros.add(1);
        listaNumeros.add(5);
        listaNumeros.add(4);
        listaNumeros.add(3);        
    }
    public void amosarLista(){
        System.out.println("********");
        for(int i=0; i<listaNumeros.size();i++)
            System.out.println(listaNumeros.get(i));
        
}
    public void engadirUnElemento(int ele){
        listaNumeros.add(ele);

    }
    public void engadirEnPosicion(){
        listaNumeros.add(1, 20);
    }
    public void borrarCuartoElemento(){
        listaNumeros.remove(3);
    }
    public void ordenar(){
        Collections.sort(listaNumeros);
    }
    public ArrayList<Integer> metodo(ArrayList<Integer>lista){
        return listaNumeros;
    }
    }